package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void crearMatricula(Matricula m) {
		// TODO Auto-generated method stub
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
