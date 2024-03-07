
public class Cuadrado {

	private Double lado;

	public Cuadrado() {}
	public Cuadrado(Double lado) {
		super();
		this.lado = lado;
	}

	public Double getLado() {
		return this.lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	public void areaDelCuadrado() {
		Double area = Math.pow(getLado(), 2);
		System.out.println("El area del Cuadrado de lado: " + getLado() + " es de: " + area);
	}
}
