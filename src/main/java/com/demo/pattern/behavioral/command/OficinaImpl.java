package com.demo.pattern.behavioral.command;

public class OficinaImpl implements Oficina{

    @Override
    public String recibe (TratamientoPedido pedido) {
		StringBuilder sb = new StringBuilder();

		sb.append("Registrando pedido. ");

		boolean ok = pedido.tratar();

		sb.append(ok ? "Pedido tratado correctamente" : "No se ha podido tratar el pedido");

        return sb.toString();
	}
	
}
