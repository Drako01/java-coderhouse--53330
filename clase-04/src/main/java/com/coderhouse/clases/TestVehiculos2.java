package com.coderhouse.clases;

public class TestVehiculos2 {

	public static void main(String[] args) {

		Vehiculos auto = new Vehiculos();

		auto.setCantidadDeRuedas(4);
		auto.setMarca("Ford");
		auto.setColor("Azul");
		auto.setPrecio(2000);
		auto.setEsElectrico(false);
		
		

		System.out.println("auto = " + auto);

		System.out.println("Enciende el auto?");
		auto.encender();
	}

}
