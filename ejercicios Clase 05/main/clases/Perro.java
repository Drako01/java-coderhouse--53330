package com.coderhouse.clases;

import com.coderhouse.interfaces.SerVivo;

public class Perro extends Animal implements SerVivo {

	// Atributos de Clase
	private String nombre;
	private String raza;
	private Integer edad;
	private boolean vive;

	// Constructores
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

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public void setVive(boolean vive) {
		this.vive = vive;
	}

	public boolean isVive() {
		return vive;
	}

	// Implementacion de Interfase
	@Override
	public void respirar() {
		System.out.println(this.nombre + " respira por la Nariz");

	}

	@Override
	public void comer() {
		System.out.println(this.nombre + " come comida Balanceada");

	}

	@Override
	public void hacerSonido() {
		System.out.println(this.nombre + " Ladra como todos los perros");

	}

	@Override
	public boolean estaVivo() {
		return isVive();
	}

	// Metodos propios
	public void vive() {
		if (isVive()) {
			System.out.println(this.nombre + " Obviamente esta con vida ");

		} else {
			System.out.println(this.nombre + " Lamentablemente Falleció");
		}
	}

	// Polimorfismo
	@Override
	public void moverse() {
		System.out.println("Mi " + this.raza + " es muy inquieto, no para de Jugar.");
	}

}
