package com.bancomaya.clientes.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.Tarjeta;
import com.bancomaya.clientes.service.TarjetaService;

@WebService(endpointInterface = "com.bancomaya.clientes.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {

	private static List<Tarjeta> tarjetasCreadas = new ArrayList<Tarjeta>();
	
	static {
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setId(1);
		tarjeta.setCliente("Marco Antonio Sanchez");
		tarjeta.setBanco("Bamco Maya");
		tarjeta.setNumeroTarjeta("4545-8548-8787-6565");
		tarjeta.setFechaCreacion("20");
		tarjeta.setFechaVencimiento("23");
		tarjeta.setNumeroSeguridad("588");
		tarjetasCreadas.add(tarjeta);
	}
	
	@Override
	public Tarjeta crearTarjetaBancaria(Tarjeta tarjeta) {
		tarjeta.setId(1);
		tarjetasCreadas.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {
		// TODO Auto-generated method stub
		return tarjetasCreadas;
	}

	@Override
	public Tarjeta obtenerTarjetaPorNumero(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tarjeta obtenerTArjetaPorCliente(String cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
