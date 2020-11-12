package com.bancomaya.clientes.model;

public class Tarjeta {
	
	private int id;
	private String cliente;
	private String banco;
	private String numeroTarjeta;
	private String fechaCreacion;
	private String fechaVencimiento;
	private String numeroSeguridad;
	
	public Tarjeta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param cliente
	 * @param banco
	 * @param numeroTarjeta
	 * @param fechaCreacion
	 * @param fechaVencimiento
	 * @param numeroSeguridad
	 */
	public Tarjeta(int id, String cliente, String banco, String numeroTarjeta, String fechaCreacion,
			String fechaVencimiento, String numeroSeguridad) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.banco = banco;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaCreacion = fechaCreacion;
		this.fechaVencimiento = fechaVencimiento;
		this.numeroSeguridad = numeroSeguridad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNumeroSeguridad() {
		return numeroSeguridad;
	}

	public void setNumeroSeguridad(String numeroSeguridad) {
		this.numeroSeguridad = numeroSeguridad;
	}
	
	

}
