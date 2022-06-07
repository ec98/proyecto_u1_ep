package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void creado(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula " + e);
	}

	@Override
	public Matricula buscarporNumero(String matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula: " + matricula);
		Matricula m = new Matricula();
		m.setNumero(matricula);
		return m;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: " + e);
	}

	@Override
	public void eliminar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula: " + matricula);

	}

}
