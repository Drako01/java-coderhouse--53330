package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.Alumno;
import com.coderhouse.servicios.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/alumnos")
@Tag(name= "Gestion de Alumnos", description = "Endpoints para Gestionar Alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

	@Operation(summary = "Obtener lista de alumnos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de alumnos obtenida correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Alumno>> listarAlumnos() {
		try {
			List<Alumno> alumnos = alumnoService.listarAlunos();
			return new ResponseEntity<>(alumnos, HttpStatus.OK); // Codigo 200

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}
	@Operation(summary = "Obtener alumno por DNI")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno encontrado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> mostrarAlumnoPorDNI(@PathVariable("id") Integer dni) {
		try {
			Alumno alumno = alumnoService.mostrarAlumnoPorDNI(dni);
			if (alumno != null) {
				return new ResponseEntity<>(alumno, HttpStatus.OK); // Codigo 200
			} else {
				return new ResponseEntity<>(alumno, HttpStatus.NOT_FOUND); // Codigo 404
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}

	@Operation(summary = "Agregar un nuevo alumno")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Alumno agregado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(value = "/agregar", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> agregarAlumno(@RequestBody Alumno alumno) {
		alumnoService.agregarAlumno(alumno);
		return new ResponseEntity<>(alumno, HttpStatus.CREATED); // Codigo 201
	}

	@Operation(summary = "Editar un alumno existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Alumno editado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Alumno.class)) }),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@PutMapping(value = "/{id}/editar", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Alumno> editarAlumno(@PathVariable("id") Integer dni, @RequestBody Alumno alumno) {
		Alumno alumnoEditado = alumnoService.editarAlumnoPorDNI(dni, alumno);
		if (alumnoEditado != null) {
			return new ResponseEntity<>(alumnoEditado, HttpStatus.OK); // Codigo 200
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
		}
	}

	@Operation(summary = "Eliminar un alumno existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Alumno eliminado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Alumno no encontrado", content = @Content) })
	@DeleteMapping(value = "/{id}/eliminar")
	public ResponseEntity<Void> eliminarAlumno(@PathVariable("id") Integer dni) {
		boolean eliminado = alumnoService.eliminarAlumnoPorDNI(dni);
		if (eliminado) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Codigo 204
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
		}
	}

}
