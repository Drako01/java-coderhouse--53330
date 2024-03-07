package com.coderhouse.clases;

import com.coderhouse.interfaces.SeresVivos;

public class Persona implements SeresVivos {

	private String nombre;
	private String nacionalidad;
	private Integer edad;
	private boolean vive;

	
	//Sobrecarga de Constructores
	//Constructores
	public Persona() {
		super();		
	}

	//Constructor Sobrecargado
	public Persona(String nombre) {
		super();
		this.nombre = nombre;		
	}
	//Constructor Sobrecargado
	public Persona(String nombre, String nacionalidad, Integer edad, boolean vive) {
		this(nombre);		
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.vive = vive;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public boolean isVive() {
		return this.vive;
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
		System.out.println(getNombre() + " esta comiendo.!");
	}

	@Override
	public void respirar() {
		System.out.println(getNombre() + " esta respirando.!");

	}

	@Override
	public void moverse() {
		System.out.println(this.nombre + " se esta moviendo.!");

	}

	@Override
	public void comunicarse() {
		System.out.println(this.nombre + " se esta comunicando.!");

	}

	@Override
	public void dormir() {
		System.out.println(this.nombre + " esta durmiendo.!");

	}

	// Metodo propio
	public void imprimirMensaje() {
		if (isVive()) {
			System.out.println(this.nombre + " esta con vida.!");
		} else {
			System.out.println(this.nombre + " esta muerto lamentablemente.!");
		}
	}

}
