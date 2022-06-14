package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("futuro")
public class CuentaBancariaFuturoServiceImpl implements ICuentaBancariaService {

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public CuentaBancaria buscar(String number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal monto = new BigDecimal((int) (Math.random() * 10 + 1));
		BigDecimal interes;
		if (monto.compareTo(BigDecimal.ZERO) >= 5 && numeroCta.equals("10202")) {
			interes = saldo.multiply(new BigDecimal(35)).divide(new BigDecimal(100));
		} else {
			interes = saldo.multiply(new BigDecimal(35)).divide(new BigDecimal(100)).add(monto);
		}

		return interes;
	}

}
