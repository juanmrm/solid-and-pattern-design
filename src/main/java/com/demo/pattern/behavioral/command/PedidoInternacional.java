package com.demo.pattern.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class PedidoInternacional implements Pedido {

    @Getter
	private final String destino;
	private final int peso;
	
	@Override
	public int peso() {
		return peso;
	}

}
