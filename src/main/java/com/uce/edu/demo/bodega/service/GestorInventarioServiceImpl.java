package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Autowired
	private IInventarioService iInventarioService;

	@Autowired
	private IProductoService iProductoService;

	@Override
	public void ingresar(Producto p, Inventario r) {
		// TODO Auto-generated method stub
		this.iProductoService.ingresar(p);
		this.iInventarioService.ingresar(p, r);
		
		
	}

	@Override
	public void buscar(LocalDateTime fecha, Inventario r) {
		// TODO Auto-generated method stub
		List<Producto> listProduct = r.getInventarioProducto();
		for (Producto p : listProduct) {
			this.producto(p);
			this.iProductoService.actualizar(p);
		}
		r.setInventarioProducto(listProduct);
		this.iInventarioService.actualizar(r);
		for (Producto p : listProduct) {
			if (p.compareTo(fecha) > 0) {
				System.out.println(p);
			}
		}
	}

	@Override
	public void actualizar(Producto p, Inventario r) {
		// TODO Auto-generated method stub
		this.iProductoService.ingresar(p);
		List<Producto> listaProducto = r.getInventarioProducto();
		listaProducto.add(p);
		r.setInventarioProducto(listaProducto);
		this.iInventarioService.actualizar(r);
	}

	@Override
	public BigDecimal producto(Producto p) {
		BigDecimal pCompra = p.getPrecioCompra();
		BigDecimal g = new BigDecimal("0.10").multiply(pCompra);
		BigDecimal iva = new BigDecimal("0.12").multiply(pCompra);
		BigDecimal pVenta = pCompra.add(g).add(iva);
		p.setPrecioVenta(pVenta);
		return pVenta;
	}

}
