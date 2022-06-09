package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto el deposito: " + d);
	}

	@Override
	public Deposito buscar(String numberCtaDestino) {
		System.out.println("Buscando cuenta del deposito " + numberCtaDestino);
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numberCtaDestino);
		return deposito;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando deposito "+d);
	}

	@Override
	public void eliminar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando deposito "+d);
	}

}
