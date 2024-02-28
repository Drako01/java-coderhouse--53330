package com.coderhouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteraciones {

	public static void main(String[] args) {
		List<String> listaDeColores = new ArrayList<>();
		listaDeColores.add("Blanco");
		listaDeColores.add("Negro");
		listaDeColores.add("Azul");
		listaDeColores.add("Verde");

		//Iterator<String> iterator = listaDeColores.iterator();
		/*
		System.out.println("El tamaño de la lista es de : " + listaDeColores.size() 
				+ " Elementos");
		
		while (iterator.hasNext() ) {
			String color = iterator.next();
			System.out.println("Color " + color);
		}
		
		do {
			System.out.println("Estoy en el Do While");
			String color = iterator.next();
			System.out.println("Color " + color);
		} while (iterator.hasNext()); // Da true mientra haya Colores
		*/
		/*
		int contador = 1;
		do {
			System.out.println("El contador esta en: " + contador);
			contador++;
		}while(contador < 5);
		
		for (int i = 1; i < 10; i++) {
			System.out.println("El contador esta en: " + i);

		}*/
		/*
		int[] numeros = {
				1,122,23,4,53,63
		};
		
		for (int numero : numeros) {
			System.out.println("El Numero es: " + numero);
		}*/
		
		listaDeColores.forEach( color -> {
			System.out.println("Color = " +  color);
		});
	}

}
