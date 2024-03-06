package com.coderhouse.jerarquias;

import com.coderhouse.clases.Gato;
import com.coderhouse.clases.Perro;

public class Main {

	public static void main(String[] args) {
		Perro perro = new Perro();

		perro.setColor("Blanco");
		perro.setNombre("Coder");
		perro.setEdad(3);

		System.out.println("El Perro es de color " + perro.getColor() + ", se llama " + perro.getNombre() + " y tiene "
				+ perro.getEdad() + " años de Edad.");

		Gato gato = new Gato();

		gato.setColor("Negro");
		gato.setNombre("Michi");
		gato.setEdad(5);

		System.out.println("El gato es de color " + gato.getColor() + ", se llama " + gato.getNombre() 
		+ " y tiene " + gato.getEdad() + " años de Edad.");
		
		// System.out.println(perro);

	}

}
