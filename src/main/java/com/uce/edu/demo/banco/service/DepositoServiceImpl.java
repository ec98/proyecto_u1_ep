package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;

	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void realizarDeposito(String numberCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numberCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numberCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertarDeposito(deposito);
	}

	@Override
	public Deposito buscarDeposito(String numberCtaDestino) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numberCtaDestino);
		ctaDestino.setNumero(numberCtaDestino);
		this.bancariaService.actualizar(ctaDestino);

		return this.depositoRepository.buscar(numberCtaDestino);
	}

	@Override
	public void actualizarDeposito(String numberCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numberCtaDestino);
		ctaDestino.setNumero(numberCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		if (saldoCtaDestino != monto) {
			BigDecimal saldoFinal = saldoCtaDestino.add(monto);
			ctaDestino.setSaldo(saldoFinal);
			this.bancariaService.actualizar(ctaDestino);
		} else {
			ctaDestino.setSaldo(saldoCtaDestino);
			this.bancariaService.actualizar(ctaDestino);
		}
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numberCtaDestino);
		deposito.setMonto(monto);
		deposito.setFecha(LocalDateTime.now());
		this.depositoRepository.actualizar(deposito);

	}

	@Override
	public void eliminarDeposito(String numberCtaDestino) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = new CuentaBancaria();
		ctaDestino.setNumero(numberCtaDestino);
		this.bancariaService.actualizar(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numberCtaDestino);
		deposito.setFecha(LocalDateTime.now());
		this.depositoRepository.eliminar(deposito);
	}

}
