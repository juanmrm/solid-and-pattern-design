package com.demo.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TratamientoPedidoInternacional implements TratamientoPedido {

    private final PedidoInternacional pedido;

    @Override
    public boolean tratar() {
        return !pedido.getDestino().equals("Mordor");
    }
}
