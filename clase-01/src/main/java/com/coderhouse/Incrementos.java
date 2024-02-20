package com.coderhouse;

public class Incrementos {

	public static void main(String[] args) {
		int miNumero = 0;
		//Post Incremento
		System.out.println("El valor de miNumero es: " + miNumero);
		// miNumero = miNumero + 1; // Reasignacion
		miNumero++; // Reasigno la variable con un Incremento de 1
		System.out.println("El valor de miNumero es: " + miNumero);
		
		miNumero = miNumero + 2;
		System.out.println("El valor de miNumero es: " + miNumero);
		
		//Pre Incremento
		int miNumeroPre = 0;
		System.out.println("El valor de miNumeroPre es: " + miNumeroPre);
		++miNumeroPre;
		System.out.println("El valor de miNumeroPre es: " + miNumeroPre);
		
		int x = 0;
		x++;
		System.out.println("El valor de x de Post es: " + x);
		++x;
		System.out.println("El valor de x de Pre es: " + x);
		
		
	}

}
