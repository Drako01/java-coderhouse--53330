package com.coderhouse.clases;

public class Animal {

	// Defino Atributos - private Encapsula
	private String clase;
	private boolean extinto;
	private Integer edad;
	private String genero;

	public Animal() {		
	}

	public Animal(String clase, boolean extinto, Integer edad, String genero) {
		super();
		this.clase = clase;
		this.extinto = extinto;
		this.edad = edad;
		this.genero = genero;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public boolean isExtinto() {
		return extinto;
	}

	public void setExtinto(boolean extinto) {
		this.extinto = extinto;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Definimos metodos
	public void comer() {
	}

	public void haceRuido() {
	}

	public void dormir() {
	}

	public void moverse() {
	}

	@Override
	public String toString() {
		return "Animal [clase = " + clase + ", extinto = " + extinto + ", edad = " + edad + ", genero = " + genero
				+ "]";
	}

}
