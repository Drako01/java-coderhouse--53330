package com.coderhouse.modelos;

import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Schema(description = "Modelo de Alumno")
@Entity
@Table(name = "alumnos")
public class Alumno {
	@Schema(description = "DNI del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "20333555")
	@Id
	@Column(name = "DNI")
	private Integer dni;
	@Schema(description = "Nombre del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "Alejandro")
	@Column(name = "NOMBRE")
	private String nombre;
	@Schema(description = "Apellido del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "Di Stefano")
	@Column(name = "APELLIDO")
	private String apellido;
	@Schema(description = "Legajo del Alumno", requiredMode = Schema.RequiredMode.REQUIRED, example = "123")
	@Column(name = "LEGAJO")
	private Integer legajo;
	
	//para Foreing key
	
	@Schema(description = "Curso al que se anoto el Alumno")
	@ManyToOne
	@JoinColumn(name = "ID_CURSO")
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	///////////////////
		
	public Alumno() {
		super();
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(legajo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(legajo, other.legajo);
	}

}