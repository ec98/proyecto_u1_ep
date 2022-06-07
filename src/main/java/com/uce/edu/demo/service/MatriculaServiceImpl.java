package com.uce.edu.demo.service;

import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void ingresarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.insertar(m);
	}

	@Override
	public Matricula buscarporMatricula(String matricula) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(matricula);
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
