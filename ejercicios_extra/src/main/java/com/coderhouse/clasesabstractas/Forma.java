package com.coderhouse.clasesabstractas;

public abstract class Forma {
	
	//Los metodos Abstractos no tienen Implementacion
	abstract void calcularArea();
	
	abstract void calcularPerimetro();
	
	//Un metodo cualquiera publico
	public void informacion() {
		System.out.println("Soy una Forma Geometrica");
	}

}
