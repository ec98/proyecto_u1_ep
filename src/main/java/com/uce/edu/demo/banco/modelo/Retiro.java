package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private String numeroCtaOrigen;
	private String clave;
	private BigDecimal monto;
	private LocalDateTime fechaRetiro;

	@Override
	public String toString() {
		return "Retiro [numeroCtaOrigen=" + numeroCtaOrigen + ", clave=" + clave + ", monto=" + monto + ", fechaRetiro="
				+ fechaRetiro + "]";
	}

	// GETTERS AND SETTERS

	public String getNumeroCtaOrigen() {
		return numeroCtaOrigen;
	}

	public void setNumeroCtaOrigen(String numeroCtaOrigen) {
		this.numeroCtaOrigen = numeroCtaOrigen;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

}
