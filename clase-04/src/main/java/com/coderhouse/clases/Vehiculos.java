package com.coderhouse.clases;

public class Vehiculos {

	// Variable de Clase 
	private static final int CANTIDAD_DE_RUEDAS = 4; // Constante
	// Variables de Instancia - Atributos
	
	private int cantidadDeRuedas;
	private String marca;
	private String color;
	private float precio;
	private boolean esElectrico;

	public Vehiculos() { // Constructor
		super();
	}

	//Encapsulamiento
	public int getCantidadDeRuedas() {
		return this.cantidadDeRuedas;
	}

	public void setCantidadDeRuedas(int cantidadDeRuedas) { // El Parametro es lo que esta dentro del ().
		//CANTIDAD_DE_RUEDAS = 5; Al tener "final" no se puede reasignar.
		String mensaje = "La cantidad maxima de Ruedas permitidas es de: " 
							+ CANTIDAD_DE_RUEDAS;
		if(cantidadDeRuedas > CANTIDAD_DE_RUEDAS) {
			System.out.println("Se excedio de la cantidad permitida. \n" + mensaje);
		} else {			
			this.cantidadDeRuedas = cantidadDeRuedas;
		}
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isEsElectrico() {
		return this.esElectrico;
	}

	public void setEsElectrico(boolean esElectrico) {
		this.esElectrico = esElectrico;
	}

	public void encender() {
		System.out.println("El vehiculo esta encendido!");
	}

	@Override
	public String toString() {
		return "Vehiculos [cantidadDeRuedas=" + cantidadDeRuedas + ", marca=" + marca + ", color=" + color + ", precio="
				+ precio + ", esElectrico=" + esElectrico + "]";
	}

}
