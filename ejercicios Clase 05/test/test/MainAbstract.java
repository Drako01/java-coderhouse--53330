package com.coderhouse.test;

import com.coderhouse.clasesabstractas.Circulo;
import com.coderhouse.clasesabstractas.Rectangulo;

public class MainAbstract {

	public static void main(String[] args) {

		Rectangulo rectangulo = new Rectangulo();
		
		rectangulo.setAltura(10d);
		rectangulo.setBase(25d);
		
		rectangulo.calcularYMostrarArea();
        rectangulo.calcularYMostrarPerimetro();
        
        Circulo circulo = new Circulo();
        
        circulo.setRadio(15d);
        
        circulo.calcularAreaCirculo();
        circulo.calcularlongitudDeLaCircunferencia();
		
	}

}
