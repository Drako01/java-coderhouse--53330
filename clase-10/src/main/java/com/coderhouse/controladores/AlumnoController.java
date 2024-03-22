package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.Alumno;
import com.coderhouse.repositorios.AlumnoRepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Alumno>> listarAlumnos() {
		try {
			List<Alumno> alumnos = alumnoRepository.findAll();
			return new ResponseEntity<>(alumnos, HttpStatus.OK); // Codigo 200

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> mostrarAlumnoPorDNI(@PathVariable("id") Integer dni) {
		try {
			Alumno alumno = alumnoRepository.findById(dni).orElse(null);
			if (alumno != null) {
				return new ResponseEntity<>(alumno, HttpStatus.OK); // Codigo 200
			} else {
				return new ResponseEntity<>(alumno, HttpStatus.NOT_FOUND); // Codigo 404
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}
	
	@PostMapping(value = "/agregar", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> agregarAlumno(@RequestBody Alumno alumno){
		alumnoRepository.save(alumno);
		return new ResponseEntity<>(alumno, HttpStatus.CREATED); // Codigo 201
	}
	
	@GetMapping(value = "/{id}/eliminar", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> eliminarAlumnoPorDNI (@PathVariable("id") Integer dni){
		try {
			alumnoRepository.deleteById(dni);
			return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		} catch (EmptyResultDataAccessException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}
	}

}
