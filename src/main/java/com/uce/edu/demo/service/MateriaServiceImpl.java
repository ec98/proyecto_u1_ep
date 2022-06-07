package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService{
	
	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Override
	public void ingresarMateria(Materia e) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(e);
	}

	@Override
	public Materia buscarporMateria(String materia) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscar(materia);
	}

	@Override
	public void actualizarMateria(Materia e) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(e);
	}

	@Override
	public void borrarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(materia);
	}

}
