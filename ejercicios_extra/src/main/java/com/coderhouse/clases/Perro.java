package com.coderhouse.clases;

import com.coderhouse.interfaces.SeresVivos;

public class Perro extends Animal implements SeresVivos {

	private String nombre;
	private String raza;
	private Integer edad;
	private boolean vive;

	public Perro() {
		super();
	}

	public Perro(String clase, String nombre, String raza, Integer edad, boolean vive) {
		super(clase);
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.vive = vive;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
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

	public Perro(String clase) {
		super(clase);
	}

	@Override
	public boolean estaVivo() {
		return isVive();
	}

	@Override
	public void comer() {
		System.out.println(getNombre() + " esta comiendo comida Balanceada.!");
	}

	@Override
	public void respirar() {
		System.out.println(getNombre() + " esta respirando por el hocico.!");

	}

	@Override
	public void moverse() {
		System.out.println(this.nombre + " esta corriendo.!");

	}

	@Override
	public void comunicarse() {
		System.out.println(this.nombre + " esta ladrando.!");

	}

	@Override
	public void dormir() {
		System.out.println(this.nombre + " esta durmiendo.!");

	}

	// Polimorfismo
	@Override
	public void imprimirMensaje() {
		if (isVive()) {
			System.out.println(this.nombre + " esta con vida.!");
		} else {
			System.out.println(this.nombre + " esta muerto lamentablemente.!");
		}
	}

}
