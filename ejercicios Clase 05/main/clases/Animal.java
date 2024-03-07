package com.coderhouse.clases;

public class Animal {

	// Atributos
	private String clase;

	// Constructores
	public Animal() {
		super();
	}

	//Sobrecarga de constructores
	public Animal(String clase) {
		super();
		this.clase = clase;
	}

	
	// Getters and Setters
	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	
	// Metodos propios
	public void moverse() {
	}

}
