package com.coderhouse.test;

import com.coderhouse.clasesabstractas.Circulo;
import com.coderhouse.clasesabstractas.Rectangulo;

public class MainAbstractas {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setBase(6d);
		rectangulo.setAltura(5d);
		
	
		rectangulo.calcularArea();
		rectangulo.calcularPerimetro();
		
		Circulo circulo = new Circulo();
		
		circulo.setRadio(12d);
		
		circulo.calcularArea();
		circulo.calcularLaLongitudDeLaCircunferencia();
			

	}

}
