package com.demo.pattern.structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class BancoNostrumImpl implements BancoNostrum {

	private final Map<String, Integer> baseDatosClientes = new HashMap<>();
	
	@Override
	public void movimiento(String cliente, int cantidad) {
		Integer estadoActual = estado(cliente);
		if (estadoActual == null) {
			estadoActual = 0;
		} 
     	baseDatosClientes.put(cliente,  estadoActual + cantidad);
	}

	@Override
	public Integer estado(String cliente) {
		return baseDatosClientes.get(cliente);
	}

}
