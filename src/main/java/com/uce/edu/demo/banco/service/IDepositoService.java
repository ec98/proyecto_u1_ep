package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public Deposito buscarDeposito(String numberCtaDestino);

	public void actualizarDeposito(String numberCtaDestino, BigDecimal monto);

	public void realizarDeposito(String numberCtaDestino, BigDecimal monto);

	public void eliminarDeposito(String numberCtaDestino);
}
