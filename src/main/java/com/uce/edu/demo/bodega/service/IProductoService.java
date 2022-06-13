package com.uce.edu.demo.bodega.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {

	public void ingresar(Producto p);

	public Producto buscar(LocalDateTime fecha);

	public void actualizar(Producto p);

	public void eliminar(Producto p);
}
