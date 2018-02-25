package com.demo.pattern.behavioral.command;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TratamientoPedidoMultiple implements TratamientoPedido {

	private final List<Pedido> pedidos;

	public boolean tratar() {
		// iterar sobre la lista de pedidos y tratar cada uno
		return true; 
	}
}
