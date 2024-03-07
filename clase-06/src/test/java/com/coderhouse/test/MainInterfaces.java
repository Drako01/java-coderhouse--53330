package com.coderhouse.test;

import com.coderhouse.clases.Perro;
import com.coderhouse.clases.Persona;
import com.coderhouse.clases.Pez;
import com.coderhouse.interfaces.SeresVivos;

public class MainInterfaces {

	public static void main(String[] args) {

		Perro unPerro = new Perro();
		
		unPerro.setVive(false);
		unPerro.setNombre("Firulay");
		unPerro.setEdad(10);
		unPerro.setRaza("Yorkey");
		unPerro.setClase("Mamifero");
		
		System.out.println("Mi perro " + unPerro.getNombre() 
							+ " es de la Raza " + unPerro.getRaza() 
							+ ", es del tipo " + unPerro.getClase()
							+ " y tiene " + unPerro.getEdad() + " de Edad.!");
		
		unPerro.imprimirMensaje();
		
		realizarAccionesSiVive(unPerro);
		
		Perro otroPerro = new Perro("Mamifero", "Lacie", "Ovejero Aleman", 10, false);
		System.out.println("Mi perro " + otroPerro.getNombre() 
							+ " es de la Raza " + otroPerro.getRaza() 
							+ ", es del tipo " + otroPerro.getClase()
							+ " y tiene " + otroPerro.getEdad() + " de Edad.!");
		
		otroPerro.imprimirMensaje();
		
		realizarAccionesSiVive(otroPerro);
		
		Persona persona = new Persona();
		
		persona.setVive(false);
		persona.setNombre("Sebastian");
		persona.setEdad(22);
		persona.setNacionalidad("Argentina");
		
		
		System.out.println(persona.getNombre() + " es de " + persona.getNacionalidad()
							+ " y tiene " + persona.getEdad() + " de Edad.!");
		
		persona.imprimirMensaje();
		
		realizarAccionesSiVive(persona);
		
		Pez pez = new Pez();
		
		pez.setVive(false);
		pez.setNombre("Sebastian");
		System.out.println(pez.getNombre() + " es un Pezcado " );
		pez.imprimirMensaje();
		realizarAccionesSiVive(pez);
		
	}
	
	public static void realizarAccionesSiVive(SeresVivos serVivo) {
		if(serVivo.estaVivo()) {
			serVivo.comer();
			serVivo.comunicarse();
			serVivo.respirar();
			serVivo.moverse();
			serVivo.dormir();
		}
	}

}
