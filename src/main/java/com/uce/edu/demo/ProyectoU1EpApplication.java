package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.profesorGeneral.setNombre("Edwin");
		this.profesorGeneral.setApellido("Piruch");
		
		System.out.println(this.profesorGeneral);

		this.profesorMateria.setNombre("Carla");
		this.profesorMateria.setApellido("Manta");
		System.out.println(this.profesorMateria);
		
		Matricula m1 = new Matricula();
		m1.setEstudiante(new Estudiante());
		//m1.setMateria(new ArrayList<Materia>);
		m1.setNumero("23");
		
		this.iMatriculaService.crearMatricula(m1);
		System.out.println(this.iMatriculaService);

	}

}
