package com.uce.edu.demo.modelo;

public class Estudiante {

	private String cedula;
	private String nombre;
	private String apellido;
	
	// GETTERS AND SETTERS

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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
