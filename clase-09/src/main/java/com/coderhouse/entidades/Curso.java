package com.coderhouse.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "cursos")
public class Curso {
	@Id
	@Column(name = "ID_CURSO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_curso;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "DESCRIPCION")
	private String descripcion;

		
	@OneToMany(mappedBy = "curso")
	private List<Alumno> alumnos;
	
	public Curso() {
		super();
	}

	public Integer getId_curso() {
		return id_curso;
	}

	public void setId_curso(Integer id_curso) {
		this.id_curso = id_curso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}