package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IGestorInventarioService;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private IGestorInventarioService iGestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Inventario inventario = new Inventario();
		Producto producto1 = new Producto();
		producto1.setNombre("Tallarin");
		producto1.setCantidad("120");
		producto1.setFecha(LocalDateTime.of(2020, 5, 23, 16, 40, 32));
		producto1.setPrecioCompra(new BigDecimal(10));
		producto1.setPrecioVenta(this.iGestorInventarioService.producto(producto1));

		Producto producto2 = new Producto();
		producto2.setNombre("Atun");
		producto2.setCantidad("320");
		producto2.setFecha(LocalDateTime.of(2021, 11, 12, 9, 32, 11));
		producto2.setPrecioCompra(new BigDecimal(20));
		producto2.setPrecioVenta(this.iGestorInventarioService.producto(producto2));

		Producto producto3 = new Producto();
		producto3.setNombre("Pollo");
		producto3.setCantidad("200");
		producto3.setFecha(LocalDateTime.of(2022, 3, 11, 5, 21, 9));
		producto3.setPrecioCompra(new BigDecimal(15));
		producto3.setPrecioVenta(this.iGestorInventarioService.producto(producto3));
		
		Producto producto4 = new Producto();
		producto4.setNombre("Huevos");
		producto4.setCantidad("500");
		producto4.setFecha(LocalDateTime.of(2019, 9, 14, 8, 22, 2));
		producto4.setPrecioCompra(new BigDecimal(17));
		producto4.setPrecioVenta(this.iGestorInventarioService.producto(producto4));

		Producto producto5 = new Producto();
		producto5.setNombre("Leche");
		producto5.setCantidad("300");
		producto5.setFecha(LocalDateTime.of(2021, 7, 16, 12, 10, 3));
		producto5.setPrecioCompra(new BigDecimal(11));
		producto5.setPrecioVenta(this.iGestorInventarioService.producto(producto5));
		
		System.out.println("\nProductos MEGA SANTA MARIA\n");
		
		this.iGestorInventarioService.ingresar(producto1, inventario);
		this.iGestorInventarioService.actualizar(producto2, inventario);
		this.iGestorInventarioService.actualizar(producto3, inventario);
		this.iGestorInventarioService.actualizar(producto4, inventario);
		this.iGestorInventarioService.actualizar(producto5, inventario);
		
		System.out.println("\nBuscador de Fechas\n");
		
		this.iGestorInventarioService.buscar(LocalDateTime.of(2020, 5, 23, 0, 0), inventario);
		this.iGestorInventarioService.buscar(LocalDateTime.of(2021, 11, 12, 0, 0), inventario);

	}

}
