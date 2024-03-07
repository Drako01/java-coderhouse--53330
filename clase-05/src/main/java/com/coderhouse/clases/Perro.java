package com.coderhouse.clases;

import java.util.Objects;

public class Perro extends Animal { // Perro hereda de Animal

	private String raza;
	private String color;
	private String nombre;

	// Constructores
	public Perro() {
		
	}

	public Perro(String clase, boolean extinto, Integer edad, String genero, String raza, String color, String nombre) {
		super(clase, extinto, edad, genero);		
		this.raza = raza;
		this.color = color;
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [raza = " + raza + ", color = " + color + ", nombre = " + nombre + "] \n" + super.toString();
	}

	public void ladrar() {
		System.out.println("El perro esta Ladrando");
	}

	// Polimorfismo
	@Override
	public void comer() { // Sobreescribir un metodo
		System.out.println("El Perro esta Comiendo comida Balanceada");
	}

	@Override
	public void moverse() {
		System.out.println("El Perro esta Caminando");
	}

	@Override
	public void haceRuido() {
		System.out.println("El Perro ladra");
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		return Objects.equals(nombre, other.nombre);
	}

}
