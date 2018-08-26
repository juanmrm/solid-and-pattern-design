package com.demo.pattern.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConCacao implements Cafe {

    private final Cafe cafe;

    @Override
    public String descripcion() {
        return cafe.descripcion() + " con cacao";
    }

    @Override
    public int precio() {
        return cafe.precio() + 10;
    }
}
