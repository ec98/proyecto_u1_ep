package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

//logica del negocio
public interface IEstudianteService {
//no siempre van a coincidir iteramente con la otra interface

	public void ingresarEstudiante(Estudiante e);

	public Estudiante buscarporApellido(String apellido);

	public void actualizarEstudiante(Estudiante e);

	public void borrarEstudiante(String cedula);
}
