package com.demo.pattern.structural.proxy;

public class CuentaNormal implements Cuenta {

	private final String cliente;
	private int cantidad;
	
	public CuentaNormal(String cliente) {
		this.cliente = cliente;
		this.cantidad = 0;
	}

	public String getCliente() {
		return cliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void movimiento (int importe) {
		cantidad += importe;
	}
	
}
