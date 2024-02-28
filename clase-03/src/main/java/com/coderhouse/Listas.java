package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		List<String> listaDeColores = new ArrayList<>();
		listaDeColores.add("Blanco");
		listaDeColores.add("Negro");
		listaDeColores.add("Azul");
		listaDeColores.add("Verde");
		
		List<String> listaDeColoresNueva = new ArrayList<>();
		listaDeColoresNueva.add("Violeta");
		listaDeColoresNueva.add("Naranja");
		/*	
		for (String color : listaDeColores) { // Por cada color hace algo
			System.out.println("El color es= " + color); // Imprimilo por consola
		}*/
		
		listaDeColores.addAll(listaDeColoresNueva);
		/*
		for (String color : listaDeColores) { 
			System.out.println("El color es= " + color); 
		}
		listaDeColores.remove(0);
		
		listaDeColores.removeAll(listaDeColoresNueva);
		
		for (String color : listaDeColores) { 
			System.out.println("El color es= " + color); 
		}*/
		
		//listaDeColores.clear();
		
		//listaDeColores.retainAll(listaDeColoresNueva);
		
		if(listaDeColores.isEmpty()) { //Retorna un Boolean
			System.out.println("La Lista listaDeColores esta Vacia.!");
		} else {
			for (String color : listaDeColores) { 
				System.out.println("El color es= " + color); 
			}
		}
		
		int posicion = 2;
		listaDeColores.set(0, "Gris");
		System.out.println("El Color en la posicion " + posicion +  " es " 
		+ listaDeColores.get(posicion));
		System.out.println("El Color en la posicion " + 0 +  " es " 
				+ listaDeColores.get(0));
		
		String miColor = "Negro";
		System.out.println("El Color " + miColor + " se encuentra en la posicion " 
		+ listaDeColores.indexOf(miColor));
		
	}

}
