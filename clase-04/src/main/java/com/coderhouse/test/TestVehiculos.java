package com.coderhouse.test;

import com.coderhouse.clases.Vehiculos;

public class TestVehiculos {

	public static void main(String[] args) {

		Vehiculos auto = new Vehiculos(); // Instanciamos la Clase Vehiculos
		// Se le asigno este lugar en Memoria: auto =
		// com.coderhouse.clases.Vehiculos@65ae6ba4

		/*
		 * auto.cantidadDeRuedas = 4; 
		 * auto.marca = "Ford"; 
		 * auto.color = "Rojo";
		 * auto.precio = 2000; 
		 * auto.esElectrico = false;
		 */

		auto.setCantidadDeRuedas(4);
		auto.setMarca("Ford");
		auto.setColor("Rojo");
		auto.setPrecio(2000);
		auto.setEsElectrico(false);

		System.out.println("auto = " + auto);

	}

}
