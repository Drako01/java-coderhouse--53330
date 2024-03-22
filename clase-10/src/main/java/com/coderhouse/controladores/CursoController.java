package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.Curso;
import com.coderhouse.repositorios.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Curso>> listarCursos() {
		try {
			List<Curso> cursos = cursoRepository.findAll();
			return new ResponseEntity<>(cursos, HttpStatus.OK); // Codigo 200

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}

	@PostMapping(value = "/agregar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curso> agregarCurso(@RequestBody Curso nuevoCurso) {
		Curso cursoGuardado = cursoRepository.save(nuevoCurso);
		return new ResponseEntity<>(cursoGuardado, HttpStatus.CREATED);
	}

	

}
