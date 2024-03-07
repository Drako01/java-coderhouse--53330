package com.coderhouse.clases;

import com.coderhouse.interfaces.SerVivo;

public class Pez extends Animal implements SerVivo {

	private String nombre;
	private boolean vive;

	public Pez() {
		super();
	}

	public Pez(String clase, String nombre, boolean vive) {
		super(clase);
		this.nombre = nombre;
		this.vive = vive;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVive() {
		return vive;
	}

	public void setVive(boolean vive) {
		this.vive = vive;
	}

	@Override
	public void respirar() {
		System.out.println(this.nombre + " respira Oxigeno del Agua");

	}

	@Override
	public void comer() {
		System.out.println(this.nombre + " come comida Balanceada para Peces");

	}

	@Override
	public void hacerSonido() {
		System.out.println(this.nombre + " no emite sonido!");

	}

	@Override
	public boolean estaVivo() {

		return isVive();
	}

	// Polimorfismo
	@Override
	public void moverse() {
		System.out.println("Mi " + this.nombre + " solo Nada!.");
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
