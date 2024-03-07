package com.coderhouse.test;

import com.coderhouse.clases.Perro;
import com.coderhouse.clases.Persona;
import com.coderhouse.interfaces.SerVivo;

public class MainInterfases {

	public static void main(String[] args) {
		Perro unPerro = new Perro();

		unPerro.setVive(true);
		unPerro.setClase("Mamifero");
		unPerro.setRaza("Yorky");
		unPerro.setEdad(4);
		unPerro.setNombre("Daisy");

		System.out.println("Mi perra " + unPerro.getNombre() + " es de Raza " + unPerro.getRaza() + ", es del tipo "
				+ unPerro.getClase() + ", tiene " + unPerro.getEdad() + " de Edad");

		unPerro.vive();
		realizarAccionesSiVive(unPerro);

		System.out.println("");
		Perro otroPerro = new Perro("Mamifero", "Pepe", "Caniche", 14, false);

		System.out.println("Mi perro " + otroPerro.getNombre() + " es de Raza " + otroPerro.getRaza() + ", es del tipo "
				+ otroPerro.getClase() + ", tiene " + otroPerro.getEdad() + " de Edad");

		otroPerro.vive();
		realizarAccionesSiVive(otroPerro);
		
		
		Persona persona = new Persona("Alejandro", "Argentina", 48, true);
		
		System.out.println("El Sr " + persona.getNombre() + " es de " + persona.getNacionalidad() 
							+ " y tiene " + persona.getEdad() + " de Edad");
		persona.vive();
		realizarAccionesSiVive(persona);
		
	}

	//Implemetacion de Interfaces
	public static void realizarAccionesSiVive(SerVivo serVivo) {
		if (serVivo.estaVivo()) {
			serVivo.comer();
			serVivo.hacerSonido();
			serVivo.respirar();
			serVivo.moverse();
		}
	}

}
