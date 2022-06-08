package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

public interface IDepositoService {

	public void realizarDeposito(String numberCtaDestino, BigDecimal monto);
}
