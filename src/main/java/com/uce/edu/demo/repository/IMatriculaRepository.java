package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

	// C: crear/insertar
	public void creado(Matricula e);

	// R: leer/buscar
	public Matricula buscarporNumero(String matricula);

	// U: actualizar
	public void actualizar(Matricula e);

	// D: eliminar
	public void eliminar(Matricula matricula);
}
