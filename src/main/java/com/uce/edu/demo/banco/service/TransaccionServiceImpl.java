package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.modelo.to.TransaccionTo;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

//Se encargar de orquestar las otras clases
@Service
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService iTransferenciaService;

	@Autowired
	private IDepositoService iDepositoService;

	@Autowired
	private IRetiroService iRetiroService;

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Autowired
	private IDepositoRepository iDepositoRepository;

	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizarTransferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDepositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.insertarRetiro(ctaRetiro, null, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		// Vamos a unir todas las listas en un unica lista de transaccionTo
		List<TransaccionTo> listFinal = new ArrayList<>();
		for (Transferencia t : listaTrans) {
			TransaccionTo transaccionTo = this.transformar(t);
			listFinal.add(transaccionTo);
		}
		for (Deposito d : listaDepo) {
			TransaccionTo transaccionTo = this.transformar(d);
			listFinal.add(transaccionTo);
		}
		for (Retiro r : listaReti) {
			TransaccionTo transaccionTo = this.transformar(r);
			listFinal.add(transaccionTo);
		}

		return listFinal;
	}

	private TransaccionTo transformar(Transferencia transferencia) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(transferencia.getFechaTransferencia());
		tranTo.setMonto(transferencia.getMontoTransferir());
		tranTo.setTipo("T");
		return tranTo;

	}

	private TransaccionTo transformar(Deposito deposito) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(deposito.getFecha());
		tranTo.setMonto(deposito.getMonto());
		tranTo.setTipo("D");
		return tranTo;
	}

	private TransaccionTo transformar(Retiro retiro) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(retiro.getFechaRetiro());
		tranTo.setMonto(retiro.getMonto());
		tranTo.setTipo("R");
		return tranTo;
	}

}
