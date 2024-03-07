package com.coderhouse.clasesabstractas;

public class Rectangulo extends Calculos {

	private Double base;
	private Double altura;

	public Rectangulo() {
		super();
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	void calcularArea() {
		System.out.println("El area del Rectangulo es: " + (this.base * this.altura));

	}

	@Override
	void calcularPerimetro() {
		System.out.println("El perimetro del Rectangulo es: " + (this.base * 2 + this.altura * 2));

	}
	
	// Nuevo método público para calcular el área
    public void calcularYMostrarArea() {
        calcularArea();
    }

    // Nuevo método público para calcular el perímetro
    public void calcularYMostrarPerimetro() {
        calcularPerimetro();
    }

}
