package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos " + t);
	}

	@Override
	public Transferencia buscar(String numberCtaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Buscando el numero de cuenta de la transferencia " + numberCtaOrigen);
		Transferencia transferencia = new Transferencia();
		transferencia.setNumerocuentaOrigen(numberCtaOrigen);
		return transferencia;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando transferencia " + t);
	}

	@Override
	public void eliminar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando transferencia " + t);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		// Aqui deberia estar el SQL a la base
		List<Transferencia> listConsultada = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumerocuentaDestino("1234");
		trans1.setNumerocuentaOrigen("4232");

		listConsultada.add(trans1);
		return listConsultada;
	}

}
