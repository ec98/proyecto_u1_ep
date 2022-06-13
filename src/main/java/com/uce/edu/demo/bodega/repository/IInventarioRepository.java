package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

public interface IInventarioRepository {

	public void ingresar(Inventario r);
	
	public Inventario buscar(String id);
	
	public void actualizar(Inventario r);
	
	public void eliminar(Inventario r);
	
}
