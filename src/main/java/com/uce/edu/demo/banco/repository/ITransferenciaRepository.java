package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);
	
	public Transferencia buscar(String numberCtaOrigen);
	
	public void actualizar(Transferencia t);
	
	public void eliminar(Transferencia t);
}
