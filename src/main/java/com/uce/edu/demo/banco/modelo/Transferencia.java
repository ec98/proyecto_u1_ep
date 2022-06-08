package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {

	private String numerocuentaOrigen;
	private String numerocuentaDestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;

	@Override
	public String toString() {
		return "Transferencia [numerocuentaOrigen=" + numerocuentaOrigen + ", numerocuentaDestino="
				+ numerocuentaDestino + ", montoTransferir=" + montoTransferir + ", fechaTransferencia="
				+ fechaTransferencia + "]";
	}

	// GETTERS AND SETTERS
	public String getNumerocuentaOrigen() {
		return numerocuentaOrigen;
	}

	public void setNumerocuentaOrigen(String numerocuentaOrigen) {
		this.numerocuentaOrigen = numerocuentaOrigen;
	}

	public String getNumerocuentaDestino() {
		return numerocuentaDestino;
	}

	public void setNumerocuentaDestino(String numerocuentaDestino) {
		this.numerocuentaDestino = numerocuentaDestino;
	}

	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}

	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}

	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}

	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
}
