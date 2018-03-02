package com.demo.pattern.behavioral.strategy;

public class EstrategiaDePagoPorDefecto implements EstrategiaDePago {
    @Override
    public double precioPagado(Materia materia) {
        return materia.getPrecio();
    }
}