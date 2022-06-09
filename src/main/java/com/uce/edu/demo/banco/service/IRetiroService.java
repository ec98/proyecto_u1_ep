package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public Retiro buscarRetiro(String numeroCtaOrigen);

	public void insertarRetiro(String numeroCtaOrigen, String clave, BigDecimal monto);

	public void eliminarRetiro(String numeroCtaOrigen, String clave);

	public void actualizarRetiro(String numeroCtaOrigen,String clave, BigDecimal monto);
}
