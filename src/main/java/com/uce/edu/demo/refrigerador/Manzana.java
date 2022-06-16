package com.uce.edu.demo.refrigerador;

import org.springframework.stereotype.Component;

@Component
public class Manzana {

	private String tamanio;
	private float peso;
	private String color;

	@Override
	public String toString() {
		return "Manzana [tamanio=" + tamanio + ", peso=" + peso + ", color=" + color + "]";
	}

	// GETTERS AND SETTERS

	public float getPeso() {
		return peso;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
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
