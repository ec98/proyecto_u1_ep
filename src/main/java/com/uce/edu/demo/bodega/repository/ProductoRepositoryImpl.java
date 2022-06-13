package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void ingresar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Ingresando el producto " + p);
	}

	@Override
	public Producto buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		producto.setFecha(fecha);
		return producto;
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando el producto " + p);
	}

	@Override
	public void eliminar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando el producto  " + p);
	}

}
