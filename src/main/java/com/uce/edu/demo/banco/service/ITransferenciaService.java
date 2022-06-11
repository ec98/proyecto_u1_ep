package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public Transferencia buscarTransferencia(String ctaOrigen);

	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto);
	
	public void actualizarTransferencia(String ctaOrigen, BigDecimal monto);
	
	public void eliminarTransferenciar(String ctaOrigen);
	
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
