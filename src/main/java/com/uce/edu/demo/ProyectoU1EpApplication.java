package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.operaciones.Fruta;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	// TALLER TRABAJADO EN CLASE

	// 1) DI por Atributo (Desacoplando)
//	@Autowired
//	private CitaMedica cita;

//	@Autowired
//	private CitaMedica2 cita;

//	@Autowired
//	private Doctor doctor;

	// TAREA 5

	// 1) DI por Atributo (Desacoplando)
	@Autowired
	private Fruta fruta1;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// TALLER TRABAJADO EN CLASE

//		System.out.println("Mi primer proyecto con Spring Framework");
//		
//		String respuesta = this.cita.agendar(LocalDateTime.now(), "Ana", "Lopez", 23, "Guayaquil", "Pablo", 32);
//		System.out.println(respuesta);

		// TAREA 5

//		System.out.println("1. Realizando ejecucion... DI por atributos");
//		// Obteniendo respuesta de los atributos inyectados
//		String respuesta = this.fruta1.entrega(LocalDateTime.now(), "Mediano", 12, "Verde", 10, "Amarillo");
//		System.out.println(respuesta);

//		System.out.println("2. Realizando ejecucion... DI por constructor");
//		//Obteniendo respuesta mediante constructor
//		String respuesta = this.fruta1.entrega(LocalDateTime.now(), "Grande", 32, "Azul", 13, "Verde");
//		System.out.println(respuesta);

		System.out.println("3. Realizando ejecucion... DI por metodos SET");
		//Obteniendo respuesta mediante metodo SET de los atributos inyectados
		String respuesta = this.fruta1.entrega(LocalDateTime.now(), "Pequenio", 6, "Anaranjado", 7, "Blanco");
		System.out.println(respuesta);

	}

}
