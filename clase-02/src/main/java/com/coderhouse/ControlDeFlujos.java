package com.coderhouse;

public class ControlDeFlujos {

	public static void main(String[] args) {
		float nroA = 4;
		float nroB = 0;

		float operacion = nroA / nroB;

		if (nroB > 0) { // Condicion Verdadera
			System.out.println("operacion con Nros Positivos= " + operacion); // Ejecuta
		} 
		else if (nroB < 0) { // Sino si
			System.out.println("operacion con Nros Negativos= " + operacion);
		} 
		else {
			System.out.println("No se puede dividir por Cero");
		}

	}

}
