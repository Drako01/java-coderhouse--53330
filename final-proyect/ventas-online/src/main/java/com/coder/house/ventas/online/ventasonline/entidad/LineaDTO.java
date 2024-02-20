package com.coder.house.ventas.online.ventasonline.entidad;

import java.math.BigDecimal;

public class LineaDTO {
	
	private Integer lineaid;

	private Integer cantidad;

	private String descripcion;

	private BigDecimal precio;

	public Integer getLineaid() {
		return lineaid;
	}

	public void setLineaid(Integer lineaid) {
		this.lineaid = lineaid;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	

}
