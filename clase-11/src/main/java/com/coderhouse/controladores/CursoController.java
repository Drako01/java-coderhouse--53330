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

@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoService cursoService;

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<Curso>> listarCursos() {
		try {
			List<Curso> cursos = cursoService.listarCursos();
			return new ResponseEntity<>(cursos, HttpStatus.OK); // Codigo 200

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
		}

	}

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

	@PostMapping(value = "/agregar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Curso> agregarCurso(@RequestBody Curso nuevoCurso) {
		Curso cursoGuardado = cursoService.agregarCurso(nuevoCurso);
		return new ResponseEntity<>(cursoGuardado, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}/editar", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Curso> editarCurso(@PathVariable("id") Integer id, @RequestBody Curso curso) {
		Curso cursoEditado = cursoService.editarCursoPorId(id, curso);
		if (cursoEditado != null) {
			return new ResponseEntity<>(cursoEditado, HttpStatus.OK); // Codigo 200
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
		}
	}

	@DeleteMapping(value = "/{id}/eliminar")
	public ResponseEntity<Void> eliminarCurso(@PathVariable("id") Integer id) {
		boolean eliminado = cursoService.eliminarCursoPorId(id);
		if (eliminado) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Codigo 204
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
		}
	}

}
