package com.uce.edu.demo.refrigerador;

import org.springframework.stereotype.Component;

@Component
public class Pera {

	private float peso;
	private String color;

	@Override
	public String toString() {
		return "Pera [peso=" + peso + ", color=" + color + "]";
	}

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
