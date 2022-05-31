package com.uce.edu.demo.operaciones;

import org.springframework.stereotype.Component;

@Component
public class Pera {

	private float peso;
	private String color;

	// GETTERS AND SETTERS
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
