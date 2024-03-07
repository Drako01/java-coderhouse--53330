package com.coderhouse.clases;

import com.coderhouse.interfaces.SeresVivos;

public class Pez extends Animal implements SeresVivos {

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
	public boolean estaVivo() {
		return isVive();
	}

	@Override
	public void comer() {
		System.out.println(getNombre() + " esta comiendo comida Balanceada para Peces.!");
	}

	@Override
	public void respirar() {
		System.out.println(getNombre() + " esta respirando por las Branqueas.!");

	}

	@Override
	public void moverse() {
		System.out.println(this.nombre + " esta nadando.!");

	}

	@Override
	public void comunicarse() {
		System.out.println(this.nombre + " no se comunica, o al menos no sabemos como lo hace.!");

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
