package com.uce.edu.demo.bodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void ingresar(Producto p, Inventario r) {
		// TODO Auto-generated method stub
		List<Producto> listProduct = new ArrayList<>();
		listProduct.add(p);
		r.setInventarioProducto(listProduct);
		this.iInventarioRepository.ingresar(r);
	}

	@Override
	public Inventario buscar(String id) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.buscar(id);
	}

	@Override
	public void actualizar(Inventario r) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(r);
	}

	@Override
	public void eliminar(Inventario r) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(r);
	}

}
