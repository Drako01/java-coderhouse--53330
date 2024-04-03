package com.coderhouse.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.coderhouse.modelos.Curso;
import com.coderhouse.repositorios.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> listarCursos() {
		return cursoRepository.findAll();
	}

	public Curso mostrarCursoPorid(Integer id) {
		return cursoRepository.findById(id).orElse(null);
	}

	public Curso agregarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}

	public Curso editarCursoPorId(Integer id, Curso curso) {
		try {
			if (cursoRepository.existsById(id)) {
				curso.setId_curso(id);
				return cursoRepository.save(curso);
			}
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		return null;
	}

	public boolean eliminarCursoPorId(Integer id) {
		try {
			cursoRepository.deleteById(id);
			return true;
		} catch (EmptyResultDataAccessException e) {
			return false;
		}
	}

}
