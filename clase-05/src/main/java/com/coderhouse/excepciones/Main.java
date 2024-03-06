package com.coderhouse.excepciones;

public class Main {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		try {			
			int resultado = x / y;
			System.out.println("resultado = " + resultado);
		} catch (ArithmeticException ex) {			
			System.out.println("No se puede dividir por 0" + ex.getMessage());
		}

	}

}
