package com.uce.edu.demo.bodega.service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {

	public void ingresar(Producto p, Inventario r);

	public Inventario buscar(String id);

	public void actualizar(Inventario r);

	public void eliminar(Inventario r);
}
