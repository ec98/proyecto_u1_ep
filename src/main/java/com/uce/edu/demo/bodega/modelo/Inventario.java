package com.uce.edu.demo.bodega.modelo;

import java.util.List;

public class Inventario {

	private List<Producto> inventarioProducto;
	private String idInventario;

	@Override
	public String toString() {
		return "Inventario [inventarioProducto=" + inventarioProducto + ", idInventario=" + idInventario + "]";
	}

	// GETTERS AND SETTERS
	public List<Producto> getInventarioProducto() {
		return inventarioProducto;
	}

	public void setInventarioProducto(List<Producto> inventarioProducto) {
		this.inventarioProducto = inventarioProducto;
	}

	public String getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(String idInventario) {
		this.idInventario = idInventario;
	}

}
