package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//toma el control a traves de un estereotipo Service
public class CitaMedica {

	private LocalDateTime fechaCita;

//	@Autowired //(Inyectando atributo)
//	private Doctor doctor; // referencia atributo this
//	@Autowired //(Inyectando atributo)
//	private Paciente paciente;

	//2) mediante el constructor llamo a la variable para inyectar
	private Doctor doctor; // referencia atributo this
	private Paciente paciente;

	
	//2) DI por contructor
	public CitaMedica(Doctor doctor, Paciente paciente) {
		this.doctor = doctor; // mediante el constructor llamo a la variable para inyectar
		this.paciente = paciente;
	}

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaciente) {

		// -----------------
		// this.doctor = new Doctor();
		// this.paciente = new Paciente();
		// -------------------

		// hacemos referencia a punto nulo
		// ejempo: null.setNonbre

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);

		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);

		// Seteamos los atributos de la cita medica
		this.fechaCita = fechaCita;

		// Se inserta la cita en la base de datos
		return "Cita agendada";
	}

	// GETTERS AND SETTERS
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
