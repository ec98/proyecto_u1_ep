package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public Transferencia buscarTransferencia(String ctaOrigen);

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public void actualizarTransferencia(String ctaOrigen, BigDecimal monto);
	
	public void eliminarTransferenciar(String ctaOrigen);
}
