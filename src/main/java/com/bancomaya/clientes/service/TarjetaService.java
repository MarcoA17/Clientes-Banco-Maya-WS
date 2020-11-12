package com.bancomaya.clientes.service;

import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.Tarjeta;

@WebService
public interface TarjetaService {

	public Tarjeta crearTarjetaBancaria(Tarjeta tarjeta);
	
	public List<Tarjeta> obtenerTarjetas();
	
	public Tarjeta obtenerTarjetaPorNumero(String numeroTarjeta);
	
	public Tarjeta obtenerTArjetaPorCliente(String cliente);
}
