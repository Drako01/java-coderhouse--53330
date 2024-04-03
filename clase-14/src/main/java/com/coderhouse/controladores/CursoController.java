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

import com.coderhouse.modelos.Curso;
import com.coderhouse.servicios.CursoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/cursos")
@Tag(name = "Gestión de Cursos", description = "Endpoints para gestionar cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@Operation(summary = "Obtener lista de cursos")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Lista de cursos obtenida correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Curso>> listarCursos() {
		try {
			List<Curso> cursos = cursoService.listarCursos();
			return new ResponseEntity<>(cursos, HttpStatus.OK); // Codigo 200

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}	

	@Operation(summary = "Agregar un nuevo curso")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Curso agregado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PostMapping(value = "/agregar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curso> agregarCurso(@RequestBody Curso nuevoCurso) {
		Curso cursoGuardado = cursoService.agregarCurso(nuevoCurso);
		return new ResponseEntity<>(cursoGuardado, HttpStatus.CREATED);
	}	
	
	@Operation(summary = "Eliminar un curso existente")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Curso eliminado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Curso no encontrado", content = @Content) })
	@DeleteMapping(value = "/{id}/eliminar")
	public ResponseEntity<Void> eliminarCurso(@PathVariable("id") Integer id) {
		boolean eliminado = cursoService.eliminarCursoPorId(id);
		if (eliminado) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Codigo 204
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
		}
	}

	@Operation(summary = "Mostrar cursos por ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso encontrado correctamente", content = @Content),
			@ApiResponse(responseCode = "404", description = "Curso no encontrado", content = @Content) })
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Curso> mostrarCursoPorId(@PathVariable("id") Integer id) {
		try {
			Curso curso = cursoService.mostrarCursoPorid(id);
			if (curso != null) {
				return new ResponseEntity<>(curso, HttpStatus.OK); // Codigo 200
			} else {
				return new ResponseEntity<>(curso, HttpStatus.NOT_FOUND); // Codigo 404
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}
	
	@Operation(summary = "Editar un curso segun su ID")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Curso editado correctamente", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = Curso.class)) }),
			@ApiResponse(responseCode = "500", description = "Error interno del servidor", content = @Content) })
	@PutMapping(value = "/{id}/editar", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Curso> editarCurso(@PathVariable("id") Integer id, @RequestBody Curso curso) {
		Curso cursoEditado = cursoService.editarCursoPorId(id, curso);
		if (cursoEditado != null) {
			return new ResponseEntity<>(cursoEditado, HttpStatus.OK); // Codigo 200
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
		}
	}

}
