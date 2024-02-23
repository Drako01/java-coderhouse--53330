package com.coderhouse;

public class Ejercicio_02 {

	public static void main(String[] args) {
		String nombreMes = "Julio";
		int numeroMes;

		switch (nombreMes) {
		case "Enero":
			numeroMes = 1;
			break;
		case "Febrero":
			numeroMes = 2;
			break;
		case "Marzo":
			numeroMes = 3;
			break;
		case "Abril":
			numeroMes = 4;
			break;
		case "Mayo":
			numeroMes = 5;
			break;
		case "Junio":
			numeroMes = 6;
			break;
		case "Julio":
			numeroMes = 7;
			break;
		case "Agosto":
			numeroMes = 8;
			break;
		case "Septiembre":
			numeroMes = 9;
			break;
		case "Octubre":
			numeroMes = 10;
			break;
		case "Noviembre":
			numeroMes = 11;
			break;
		case "Diciembre":
			numeroMes = 12;
			break;
		default:
			numeroMes = 0;
		}

		if (numeroMes > 0) {
			System.out.println("Numero de mes: " + numeroMes);
		} else
			System.out.println("No existe ese mes");
	}

}
