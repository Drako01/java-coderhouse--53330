package com.coderhouse;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * Los Operadores Aritmeticos y son: + - * / %
		 */

		int x = 12;
		float y = 6;
		double suma = x + y;
		double resta = x - y;
		int multiplicacion = (int) (x * y);
		int multiplicacion1 = x * (int) y;
		double multiplicacion2 = x * y;
		float division = x / y;
		float resto = x % y;
		
		
		System.out.println("El resultado de la Suma es: " + suma);
		System.out.println("El resultado de la Resta es: " + resta);
		System.out.println("El resultado de la Multiplicacion es: " + multiplicacion);
		System.out.println("El resultado de la Multiplicacion1 es: " + multiplicacion1);
		System.out.println("El resultado de la Multiplicacion2 es: " + multiplicacion2);
		System.out.println("El resultado de la Division es: " + division);
		System.out.println("El resultado de la Resto de la Division es: " + resto);
	}

}
