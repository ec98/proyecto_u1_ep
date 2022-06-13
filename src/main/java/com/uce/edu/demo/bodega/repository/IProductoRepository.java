package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {

	public void ingresar(Producto p);
	
	public Producto buscar(LocalDateTime fecha);
	
	public void actualizar(Producto p);
	
	public void eliminar(Producto p);
}
