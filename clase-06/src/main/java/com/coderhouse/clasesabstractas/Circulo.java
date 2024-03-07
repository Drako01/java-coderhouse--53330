package com.coderhouse.clasesabstractas;

public class Circulo extends Forma {

	private Double radio;
	private final static Double PI = Math.PI;

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
	public void calcularArea() {
		Double area = getPi() * Math.pow(getRadio(), 2);
		System.out.println("El area del Circulo es de: " + area);

	}

	@Override
	void calcularPerimetro() {
		Double longitudDeLaCircunferencia = getPi() * 2 * getRadio();
		System.out.println("La longitud De La Circunferencia es de: " + longitudDeLaCircunferencia);

	}
	
	public void calcularLaLongitudDeLaCircunferencia() {
		calcularPerimetro();
	}
	

}
