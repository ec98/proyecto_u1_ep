package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
		System.out.println("Actualizando deposito " + d);
	}

	@Override
	public void eliminar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando deposito " + d);
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		// Aqui retorna la lista de depositos SQL
		List<Deposito> listDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("25345");
		
		listDepositos.add(depo1);
		
		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 3, 15, 9, 54, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("12345");
		
		listDepositos.add(depo2);
		
		return listDepositos;
	}

}
