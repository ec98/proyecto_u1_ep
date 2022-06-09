package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private IRetiroService iRetiroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nInsertando retiro\n");
		iRetiroService.insertarRetiro("1725860553", "1111", new BigDecimal(100));
		System.out.println("\nBuscando retiro\n");
		iRetiroService.buscarRetiro("1725860553");
		System.out.println("\nActualizando retiro\n");
		iRetiroService.actualizarRetiro("1725860553", "12321", new BigDecimal(100));
		System.out.println("\nEliminando retiro\n");
		iRetiroService.eliminarRetiro("1725860553", "12322");
	}

}
