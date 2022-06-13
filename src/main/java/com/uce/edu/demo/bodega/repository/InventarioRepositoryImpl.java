package com.uce.edu.demo.bodega.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void ingresar(Inventario r) {
		// TODO Auto-generated method stub
		System.out.println("Ingresando el inventario " + r);
	}

	@Override
	public Inventario buscar(String id) {
		// TODO Auto-generated method stub
		Inventario inventario = new Inventario();
		inventario.setIdInventario(id);
		return inventario;
	}

	@Override
	public void actualizar(Inventario r) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando el inventario " + r);
	}

	@Override
	public void eliminar(Inventario r) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando el inventario " + r);
	}

}
