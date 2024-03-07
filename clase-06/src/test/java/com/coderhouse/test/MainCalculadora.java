package com.coderhouse.test;

import com.coderhouse.clases.sobrecarga.Calculadora;

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.sumar(12, 52);
		calculadora.restar(100, 20);
		calculadora.multiplicar(5, 6);
		calculadora.dividir(20, 0);
		calculadora.dividir(20, 10);
		
		calculadora.sumar(12.53233, 552d);
		
		calculadora.dividir(20.235656, 0);
	}

}
