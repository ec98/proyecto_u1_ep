package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto implements Comparable<LocalDateTime> {

	private String nombre;
	private LocalDateTime fecha;
	private String cantidad;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fecha=" + fecha + ", cantidad=" + cantidad + ", precioCompra="
				+ precioCompra + ", precioVenta = $ " + precioVenta + "]";
	}

	@Override
	public int compareTo(LocalDateTime o) {
		// TODO Auto-generated method stub
		return this.fecha.compareTo(o);
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

}
