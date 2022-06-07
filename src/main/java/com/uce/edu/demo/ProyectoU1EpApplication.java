package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e = new Estudiante();
		e.setNombre("Edwin");
		e.setApellido("Piruch");
		e.setCedula("1725860553");
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Ana");
		e1.setApellido("Lopez");
		e1.setCedula("1722992922");
		this.estudianteService.ingresarEstudiante(e1);
		
		//USAR LOS 3 METODOS RESTANTES
		e.setCedula("1829202222");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarporApellido("Piruch");
		
		this.estudianteService.borrarEstudiante("1722992922");
	}

}
