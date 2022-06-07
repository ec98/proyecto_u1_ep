package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {

	// CRUD
	// SOLO CONTRATOS

	// C: crear/insertar
	public void insertar(Materia e);

	// R: leer/buscar
	public Materia buscar(String materia);

	// U: actualizar
	public void actualizar(Materia e);

	// D: eliminar
	public void eliminar(Materia materia);

}
