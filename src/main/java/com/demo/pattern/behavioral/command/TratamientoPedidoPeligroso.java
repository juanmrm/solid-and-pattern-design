package com.demo.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TratamientoPedidoPeligroso implements TratamientoPedido {

	private final PedidoPeligroso pedido;

	public boolean tratar() {
		// tratar el pedido segun las instrucciones
		return true; // si es false ... :-( 
	}
}
