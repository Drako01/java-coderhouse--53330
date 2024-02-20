package com.coder.house.ventas.online.ventasonline.entidad;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@Table(name="producto")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productoid;

	private Integer cantidad;

	private Integer codigo;

	private String descripcion;

	private BigDecimal precio;

	public Producto() {
	}

	public Integer getProductoid() {
		return this.productoid;
	}

	public void setProductoid(Integer productoid) {
		this.productoid = productoid;
	}

	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [");
		if (productoid != null)
			builder.append("productoid=").append(productoid).append(", ");
		if (cantidad != null)
			builder.append("cantidad=").append(cantidad).append(", ");
		if (codigo != null)
			builder.append("codigo=").append(codigo);
		builder.append("]");
		return builder.toString();
	}

	
}