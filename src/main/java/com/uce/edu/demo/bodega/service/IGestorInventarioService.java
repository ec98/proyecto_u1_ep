package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IGestorInventarioService {
	
	public void ingresar(Producto p, Inventario r);

	public void buscar(LocalDateTime fecha, Inventario r);
	
	public void actualizar(Producto p, Inventario r);
	
	public BigDecimal producto(Producto p);
}
