package com.coderhouse.test;

import com.coderhouse.clases.Perro;

public class Main {

	public static void main(String[] args) {
		//Animal unAnimal = new Animal();
		
		Perro unPerro = new Perro();
		Perro otroPerro = new Perro();
		//Gato unGato = new Gato();
		
		
		unPerro.setClase("Mamifero");
		unPerro.setColor("Blanco");
		unPerro.setEdad(4);
		unPerro.setExtinto(false);
		unPerro.setGenero("Hembra");
		unPerro.setNombre("Yully");
		unPerro.setRaza("Yorkey");
		
		otroPerro.setClase("Mamifero");
		otroPerro.setColor("Blanco");
		otroPerro.setEdad(4);
		otroPerro.setExtinto(false);
		otroPerro.setGenero("Hembra");
		otroPerro.setNombre("Daisy");
		otroPerro.setRaza("Yorkey");
		
		/*
		unAnimal.comer();
		unAnimal.moverse();
		unAnimal.haceRuido();
		
		unPerro.comer();
		unPerro.moverse();
		unPerro.haceRuido();
		
		unGato.comer();
		unGato.moverse();
		unGato.haceRuido();
		*/
		if (unPerro.equals(otroPerro)) {			
			System.out.println("HashCode de Perro = " + unPerro.hashCode());
			System.out.println("HashCode de otro Perro = " + otroPerro.hashCode());
			System.out.println("Los perros son Iguales");
		} else {
			System.out.println("HashCode de Perro = " + unPerro.hashCode());
			System.out.println("HashCode de otro Perro = " + otroPerro.hashCode());
			System.out.println("Los perros son Distintos");
		}
		System.out.println("Primer Perro = " + unPerro);
		
		Perro unTercerPerro = new Perro("Mamifero", false, 4 , "Macho ", 
										"Perro", "negro", "Coder");
		System.out.println("Tercer Perro = " + unTercerPerro);
	}

}
