package com.coderhouse.clases.sobrecarga;

public class Calculadora {

	public void sumar(int a, int b) {
		System.out.println("Suma: " + (a + b));

	}

	public void sumar(double a, double b) {
		System.out.println("Suma: " + (a + b));

	}
	
	public void restar(int a, int b) {
		System.out.println("Resta: " + (a - b));

	}

	public void restar(double a, double b) {
		System.out.println("Resta: " + (a - b));

	}
	public void multiplicar(int a, int b) {
		System.out.println("Multiplicacion: " + (a * b));

	}
	public void multiplicar(double a, double b) {
		System.out.println("Multiplicacion: " + (a * b));

	}

	public void dividir(int a, int b) {
		try {
			if (b == 0) {
				throw new ArithmeticException("No se puede dividir por Cero");
			} else {

				System.out.println("Division: " + (a / b));
			}
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}

	}
	
	public void dividir(double a, double b) {
		try {
			if (b == 0) {
				throw new ArithmeticException("No se puede dividir por Cero con Doubles");
			} else {

				System.out.println("Division: " + (a / b));
			}
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}

	}

}
