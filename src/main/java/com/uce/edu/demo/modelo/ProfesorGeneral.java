package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//tipo singleton (general)
//Cuando no esta en las capas IoC

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON) //unica instancia
//@Scope("singleton") //otra manera de llamar al estereotipo
public class ProfesorGeneral {

	private String nombre;
	private String apellido;

	@Override
	public String toString() {
		return "ProfesorGeneral [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
