package com.coderhouse.modelos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Schema(description = "Modelo de Curso")
@Entity
@Table(name = "cursos")
public class Curso {
	@Schema(description = "Id del Curso", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
	@Id
	@Column(name = "ID_CURSO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_curso;
	@Schema(description = "Nombre del Curso", requiredMode = Schema.RequiredMode.REQUIRED, example = "Java")
	@Column(name = "TITULO")
	private String titulo;
	@Schema(description = "Descripcion del Curso", requiredMode = Schema.RequiredMode.REQUIRED, example = "Java para Principiantes")
	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Schema(description = "Lista de Alumnos del Curso")
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