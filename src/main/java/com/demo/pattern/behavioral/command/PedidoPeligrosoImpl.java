package com.demo.pattern.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PedidoPeligrosoImpl implements Pedido, PedidoPeligroso {

    private final String instrucciones;
    private final int peso;

    @Override
    public int peso() {
        return peso;
    }

    @Override
    public String instrucciones() {
        return instrucciones;
    }

}
