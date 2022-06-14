package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService iCuentaBancariaService;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService iCuentaBancariaServiceA;
	
	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService iCuentaBancariaServiceF;
	
	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;

	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cta = this.iCuentaBancariaRepository.buscar(numeroCta);
		if (cta.getTipo().equals("A")) {
			// Cuenta Ahorros
			interes = this.iCuentaBancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		} else if (cta.getTipo().equals("C")){
			// Cuenta Corriente
			interes = this.iCuentaBancariaService.calcularInteres(numeroCta, cta.getSaldo());
		} else {
			// Cuenta Futuro
			System.out.println("Cuenta Futuro");
			interes = this.iCuentaBancariaServiceF.calcularInteres(numeroCta, cta.getSaldo());
		}
		return interes;
	}

}
