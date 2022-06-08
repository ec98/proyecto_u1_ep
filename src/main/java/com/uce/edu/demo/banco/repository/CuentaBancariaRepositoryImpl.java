package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria c) {
		//Aqui hay que construir los SQL's
		System.out.println("Cuenta bancaria actualizada a: " + c);
	}

	@Override
	public CuentaBancaria buscar(String number) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria "+number);
		//Consulta a la base de datos
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(number);
		cta.setSaldo(new BigDecimal(100));
		return cta;
	}

}
