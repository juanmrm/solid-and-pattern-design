package com.demo.pattern.structural.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EnTerraza implements Cafe {

    private final Cafe cafe;

    @Override
    public String descripcion() {
        return cafe.descripcion() + " en terraza";
    }

    @Override
    public int precio() {
        return cafe.precio() + 10;
    }
}