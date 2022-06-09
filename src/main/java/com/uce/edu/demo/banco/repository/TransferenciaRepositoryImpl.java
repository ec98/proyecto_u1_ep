package com.uce.edu.demo.banco.repository;

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
		System.out.println("Buscando el numero de cuenta de la transferencia "+numberCtaOrigen);
		Transferencia transferencia = new Transferencia();
		transferencia.setNumerocuentaOrigen(numberCtaOrigen);
		return transferencia;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando transferencia "+t);
	}

	@Override
	public void eliminar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando transferencia "+t);
	}

}
