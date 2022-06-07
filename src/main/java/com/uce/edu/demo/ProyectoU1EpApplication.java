package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1EpApplication implements CommandLineRunner {

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("\nImpresion de materias\n");

		Materia materia = new Materia();

		List<Materia> list_Materias = new ArrayList<Materia>();

		materia.setNombre("Investigacion Operativa");
		materia.setSemestre("Sexto Semestre");
		this.materiaService.ingresarMateria(materia);

		Materia materia1 = new Materia();
		materia1.setNombre("Programacion Avanzada II");
		materia1.setSemestre("Sexto Semestre");
		this.materiaService.ingresarMateria(materia1);

		this.materiaService.actualizarMateria(materia);
		this.materiaService.buscarporMateria("Investigacion Operativa");
		this.materiaService.borrarMateria(materia);

		list_Materias.add(materia);
		list_Materias.add(materia1);

		System.out.println("\nImpresion de matriculas\n");
		// System.out.println(list_Materias);

		// Datos necesarios para la matricula
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("Edwin");
		estudiante.setApellido("Piruch");
		estudiante.setCedula("1725860553");

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNombre("Rosa");
		estudiante1.setApellido("Angelica");
		estudiante1.setCedula("1400280499");

		Matricula matricula = new Matricula();
		matricula.setEstudiante(estudiante);
		matricula.setMateria(list_Materias);
		matricula.setNumero("#29283");
		this.matriculaService.crearMatricula(matricula);

		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(estudiante1);
		matricula1.setMateria(list_Materias);
		matricula1.setNumero("#12032");
		this.matriculaService.crearMatricula(matricula1);

		matricula.setNumero("#19202");
		this.matriculaService.actualizarMatricula(matricula);
		this.matriculaService.buscarporMatricula("#12032");
		this.matriculaService.borrarMatricula(matricula);

	}

}
