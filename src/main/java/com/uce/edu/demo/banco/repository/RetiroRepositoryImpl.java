package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Insertando el  retiro " + r);
	}

	@Override
	public Retiro buscar(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Buscando el retiro mediante el numero de cuenta " + numeroCtaOrigen);
		Retiro r = new Retiro();
		r.setNumeroCtaOrigen(numeroCtaOrigen);
		return r;
	}

	@Override
	public void eliminar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando el retiro " + r);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando el retiro " + r);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listRetirar = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setMonto(new BigDecimal(25));
		reti1.setFechaRetiro(LocalDateTime.of(2022, 4, 23, 8, 43, 15));
		reti1.setNumeroCtaOrigen("13234");

		listRetirar.add(reti1);
		return listRetirar;
	}

}
