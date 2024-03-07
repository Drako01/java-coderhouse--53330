package com.coderhouse.clasesabstractas;

public class Circulo extends Calculos {

	public Double radio;
	public final static Double PI = Math.PI;

	public Circulo() {
		super();
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	public static Double getPi() {
		return PI;
	}

	@Override
	void calcularArea() {
		Double area = this.radio * Math.pow(PI, 2);
		System.out.println("El área del Circulo es: " + area);

	}

	@Override
	void calcularPerimetro() {
		Double perimetro = 2 * PI * this.radio;
		System.out.println("El perímetro del Circulo es: " + perimetro);

	}

	public void calcularAreaCirculo() {
		calcularArea();
	}

	public void calcularlongitudDeLaCircunferencia() {
		calcularPerimetro();
	}

}
