package com.uce.edu.demo.banco.service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void insertar(CuentaBancaria c);

	public void actualizar(CuentaBancaria c);

	public CuentaBancaria buscar(String number);

	public void eliminar(CuentaBancaria c);
}
