package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner{

	//1) DI por Atributo (Desacoplando)
//	@Autowired
//	private CitaMedica cita;
	
	@Autowired
	private CitaMedica2 cita;
	
//	@Autowired
//	private Doctor doctor;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");
		
		String r = this.cita.agendar(LocalDateTime.now(), "Ana", "Lopez", 23, "Guayaquil", "Pablo", 32);
		System.out.println(r);
	}

}
