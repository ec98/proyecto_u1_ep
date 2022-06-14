package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String number) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(number);
	}

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.ingresar(c);
	}

	@Override
	public void eliminar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminar(c);
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		return null;
	}

}
