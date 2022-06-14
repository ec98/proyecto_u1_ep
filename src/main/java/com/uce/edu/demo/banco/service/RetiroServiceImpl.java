package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private IRetiroRepository retiroRepository;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Override
	public Retiro buscarRetiro(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(numeroCtaOrigen);
		cOrigen.setNumero(numeroCtaOrigen);
		this.bancariaService.actualizar(cOrigen);

		Retiro r = new Retiro();
		r.setNumeroCtaOrigen(numeroCtaOrigen);
		r.setFechaRetiro(LocalDateTime.now());
		return this.retiroRepository.buscar(numeroCtaOrigen);
	}

	@Override
	public void insertarRetiro(String numeroCtaOrigen, String clave, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(numeroCtaOrigen);
		cOrigen.setNumero(numeroCtaOrigen);
		BigDecimal saldoInicial = cOrigen.getSaldo();
		BigDecimal saldoFinal = saldoInicial.add(monto);
		cOrigen.setSaldo(saldoFinal);
		this.bancariaService.actualizar(cOrigen);

		Retiro r = new Retiro();
		r.setNumeroCtaOrigen(numeroCtaOrigen);
		r.setClave(clave);
		r.setMonto(monto);
		r.setFechaRetiro(LocalDateTime.now());
		this.retiroRepository.insertar(r);
	}

	@Override
	public void eliminarRetiro(String numeroCtaOrigen, String clave) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(numeroCtaOrigen);
		cOrigen.setNumero(numeroCtaOrigen);
		this.bancariaService.actualizar(cOrigen);

		Retiro r = new Retiro();
		r.setNumeroCtaOrigen(numeroCtaOrigen);
		r.setClave(clave);
		r.setFechaRetiro(LocalDateTime.now());
		r.setMonto(null);
		this.retiroRepository.eliminar(r);

	}

	@Override
	public void actualizarRetiro(String numeroCtaOrigen,String clave, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(numeroCtaOrigen);
		cOrigen.setNumero(numeroCtaOrigen);
		cOrigen.setSaldo(monto);
		BigDecimal saldoInicial = cOrigen.getSaldo();
		if (saldoInicial != monto) {
			BigDecimal saldoFinal = saldoInicial.add(monto);
			cOrigen.setSaldo(saldoFinal);
			this.bancariaService.actualizar(cOrigen);
		} else {
			cOrigen.setSaldo(saldoInicial);
			this.bancariaService.actualizar(cOrigen);
		}

		Retiro r = new Retiro();
		r.setNumeroCtaOrigen(numeroCtaOrigen);
		r.setMonto(monto);
		r.setClave(clave);
		r.setFechaRetiro(LocalDateTime.now());
		this.retiroRepository.actualizar(r);
	}

}
