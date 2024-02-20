package com.coderhouse;

public class Variables {
	public static void main(String[] args) {
		/*
		 * En esta clase vamos a utilizar Variables
		 */
		int x;
		byte y;
		x = 23;
		y = (byte) x;// Casteamos al int en byte

		System.out.println("El valor de la variable es: " + y);

		float a = 2;
		int b = (int) a;

		System.out.println("El valor de la variable float es: " + a);
		System.out.println("El valor de la variable float Casteado es: " + b);
		
		char letra; // Primitivo
		String letras = "Hola Mundo"; //No primitivo
		boolean falso = false;
		boolean verdadero = true;
		
		System.out.println("El valor de la variable es: " + falso + "\n");
		System.out.println("El valor de la variable es: " + verdadero);
	}
}
