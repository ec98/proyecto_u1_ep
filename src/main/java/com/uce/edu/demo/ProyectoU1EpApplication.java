package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private IFachadaCuentaBancaria bancaria;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		BigDecimal interes = this.bancaria.calcularInteres("10202");
		System.out.println("Obteniendo un interes de "+interes);
	}

}
