package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.service.IProductoService;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.refrigerador.Congelador;
import com.uce.edu.demo.refrigerador.Fruta;
import com.uce.edu.demo.refrigerador.Manzana;
import com.uce.edu.demo.refrigerador.Pera;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private Congelador congelador;

	@Autowired
	private Congelador congelador1;

	@Autowired
	private Congelador congelador2;

	@Autowired
	private Congelador congelador3;

	@Autowired
	private Fruta fruta;

	@Autowired
	private Fruta fruta1;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Realizando ejercicio tipo (PROTOTYPE) ");
		this.congelador.setNombre("Queso");
		this.congelador.setTipo("Lacteo");
		System.out.println(this.congelador);
		System.out.println("***********");
		this.congelador1.setNombre("Yogurt");
		this.congelador1.setTipo("Lacteo");
		System.out.println(this.congelador1);
		System.out.println("***********");
		this.congelador2.setNombre("Carne");
		this.congelador3.setNombre("Huevos");
		System.out.println(this.congelador3);

		System.out.println("Realizando ejercicio tipo (SINGLETON) ");
		Manzana manzana1 = new Manzana();
		Pera pera1 = new Pera();
		manzana1.setTamanio("Grande");
		this.fruta.setManzana(manzana1);

		System.out.println(this.fruta);
		System.out.println("***********");
		manzana1.setTamanio("Pequeño");
		this.fruta1.setManzana(manzana1);
		System.out.println(this.fruta1);

		pera1.setColor("Amarillo");
		this.fruta1.setPera(pera1);
		System.out.println(this.fruta1);

		pera1.setColor("Verde");
		this.fruta1.setPera(pera1);
		System.out.println(this.fruta1);

	}

}
