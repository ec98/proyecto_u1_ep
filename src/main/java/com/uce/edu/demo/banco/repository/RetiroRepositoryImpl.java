package com.uce.edu.demo.banco.repository;

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
		System.out.println("Buscando el retiro mediante el numero de cuenta "+numeroCtaOrigen);
		Retiro r = new Retiro();
		r.setNumeroCtaOrigen(numeroCtaOrigen);
		return r;
	}

	@Override
	public void eliminar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando el retiro "+r);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando el retiro "+r);
	}

}
