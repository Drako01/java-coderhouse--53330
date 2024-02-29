package com.coderhouse.constantes;

public class ConstantesTest {
	//Hago las Declaraciones
	static final double PI;
	static final int RADIO;
	
	//Hago las Asignaciones
	static {
		PI = 3.1415592653589793;
		RADIO = 4;
	}
	
	//Calcular el Area de un circulo
	public static void main(String[] args) {
		System.out.println("El area del clurculo con Radio " + RADIO + " es de: "
				+ clacularAreaDelCirculo(RADIO));

	}
	
	private static double clacularAreaDelCirculo (int radio) {	
		return PI * Math.pow(RADIO, 2);
	}

}
