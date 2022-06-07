package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void crearMatricula(Matricula m);

	public Matricula buscarporMatricula(String matricula);

	public void actualizarMatricula(Matricula m);

	public void borrarMatricula(Matricula matricula);
}
