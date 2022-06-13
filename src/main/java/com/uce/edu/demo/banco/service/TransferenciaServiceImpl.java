package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

//Orquestadora/Fachadas
//Metodos a la realidad y programar lo que se debe.

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	// Como la logica de CuentaBancariaService no hace nada
	// si puedo Inyectar el CuentaBancariaRepository

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Autowired
	private ITransferenciaRepository transferenciaRepository;

	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevosaldoOrigen = saldoOrigen.subtract(monto); // subtract es cuando realizamos una operacion
		cOrigen.setSaldo(nuevosaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevosaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevosaldoDestino);
		this.bancariaService.actualizar(cDestino);

		Transferencia t = new Transferencia();
		t.setNumerocuentaOrigen(ctaOrigen);
		t.setNumerocuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.transferenciaRepository.insertar(t);
	}

	@Override
	public Transferencia buscarTransferencia(String ctaOrigen) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		cOrigen.setNumero(ctaOrigen);
		this.bancariaService.actualizar(cOrigen);

		Transferencia transferencia = new Transferencia();
		transferencia.setNumerocuentaOrigen(ctaOrigen);
		return this.transferenciaRepository.buscar(ctaOrigen);
	}

	@Override
	public void actualizarTransferencia(String ctaOrigen, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		cOrigen.setNumero(ctaOrigen);
		cOrigen.setSaldo(monto);
		this.bancariaService.actualizar(cOrigen);

		Transferencia transferencia = new Transferencia();
		transferencia.setNumerocuentaOrigen(ctaOrigen);
		transferencia.setMontoTransferir(monto);
		transferencia.setFechaTransferencia(LocalDateTime.now());
		this.transferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void eliminarTransferenciar(String ctaOrigen) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		cOrigen.setNumero(ctaOrigen);
		this.bancariaService.actualizar(cOrigen);

		Transferencia transferencia = new Transferencia();
		transferencia.setNumerocuentaDestino(ctaOrigen);
		this.transferenciaRepository.eliminar(transferencia);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//solo llama al service
		//No hay ninguna logica de negocio
		return this.transferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
	}

}
