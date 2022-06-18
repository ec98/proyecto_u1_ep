package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Lookup
	//toma la espacio de memoria de otro metodo que tenga un Lookup y anulo el retorno e imprime la instancia.
	public ProfesorGeneral obtenerProfesorG() {
		System.out.println("#############");
		return null;
	}
	
	@Lookup
	public ProfesorMateria obtenerProfesorM() {
		ProfesorMateria profM = new ProfesorMateria();
		profM.setApellido("Jaramillo");
		profM.setNombre("Carla");
		System.out.println("((((((((((");
		return profM;
	}

	@Override
	public void crearMatricula(Matricula m) {
		ProfesorMateria profM = this.obtenerProfesorM();
		profM.getNombre();
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON" + this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE" + this.profesorMateria);
		System.out.println("DI un metodo general: "+ this.obtenerProfesorG());
		System.out.println("DI un metodo materia: "+ this.obtenerProfesorM());
		this.matriculaRepository.creado(m);
	}

	@Override
	public Matricula buscarporMatricula(String matricula) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscarporNumero(matricula);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void borrarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(matricula);
	}

}
