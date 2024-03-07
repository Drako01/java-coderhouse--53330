package com.coderhouse.clases;

import com.coderhouse.interfaces.SerVivo;

public class Persona implements SerVivo {

	// Atributos de Clase
	private String nombre;
	private String nacionalidad;
	private Integer edad;
	private boolean vive;

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String nacionalidad, Integer edad, boolean vive) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.vive = vive;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public boolean isVive() {
		return vive;
	}

	public void setVive(boolean vive) {
		this.vive = vive;
	}

	@Override
	public boolean estaVivo() {
		return isVive();
	}

	@Override
	public void comer() {
		System.out.println(this.nombre + " come todo el Dia");

	}

	@Override
	public void hacerSonido() {
		System.out.println(this.nombre + " no para de Hablar");

	}

	@Override
	public void respirar() {
		System.out.println(this.nombre + " respira por la Nariz");

	}

	@Override
	public void moverse() {
		System.out.println(this.nombre + " camina y corre.!");

	}

	// Metodos propios
	public void vive() {
		if (isVive()) {
			System.out.println(this.nombre + " Obviamente esta con vida ");

		} else {
			System.out.println(this.nombre + " Lamentablemente Falleció");
		}
	}
}
