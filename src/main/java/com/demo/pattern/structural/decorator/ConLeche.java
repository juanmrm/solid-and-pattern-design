package com.demo.pattern.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConLeche implements Cafe {

    private final Cafe cafe;

    @Override
    public String descripcion() {
        return cafe.descripcion() + " con leche";
    }

    @Override
    public int precio() {
        return cafe.precio() + 20;
    }
}
