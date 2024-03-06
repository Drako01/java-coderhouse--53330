package com.coderhouse.clases;

public class Gato extends Animal {
	private String raza;
	private String color;
	private String nombre;
	
	public Gato() {
		super();		
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
		return "Perro [raza = " + raza + ", color = " + color 
				+ ", nombre = " + nombre + "] \n" + super.toString();
	}
	
	public void ladrar() {
		System.out.println("El perro esta Ladrando");
	}
	
	//Polimorfismo
	@Override
	public void comer() { //Sobreescribir un metodo
		System.out.println("El Gato esta Comiendo comida Balanceada");
	}
	@Override
	public void moverse() {
		System.out.println("El Gato esta Caminando");
	}
	@Override
	public void haceRuido() {
		System.out.println("El Gato mahulla");
	}
}
