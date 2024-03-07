package com.coderhouse.clasesabstractas;

public class Rectangulo extends Forma {

	private Double base;
	private Double altura;

	public Rectangulo() {
		super();
	}

	public Double getBase() {
		return this.base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return this.altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public void calcularArea() {
		System.out.println("El area del Rectangulo es de: " + (getBase() * getAltura()));
	}

	@Override
	public void calcularPerimetro() {
		System.out.println("El perimetro del Rectangulo es de: " + 
							(getBase() * 2 +  getAltura() * 2));
	}

}
