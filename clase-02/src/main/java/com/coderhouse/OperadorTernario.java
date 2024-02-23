package com.coderhouse;

public class OperadorTernario {

	public static void main(String[] args) {
		
		String mensaje1 = "Hola Mundo";
		String mensaje2 = "Adios Mundo";
		boolean condicion = false;
		String mensaje;
		
		mensaje = condicion ? mensaje1 : mensaje2;
		
		System.out.println("mensaje = " + mensaje);
		
		
		int valorA = 10;
		int valorB = 20;
		int resultado;
		boolean condicionNumero = false;
		
		resultado = condicionNumero 
				? // if (condicion)
				valorA // Si es true
				: // else
				valorB; // Si es false
		

		System.out.println("resultado = " + resultado);
		
		
		if(!condicionNumero) {
			System.out.println("resultado = " + valorA);
		}
		else {
			System.out.println("resultado = " + valorB);
		}
		
	}

}
