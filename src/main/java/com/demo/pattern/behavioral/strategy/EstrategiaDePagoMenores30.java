package com.demo.pattern.behavioral.strategy;

public class EstrategiaDePagoMenores30 implements EstrategiaDePago {
    @Override
    public double precioPagado(Materia materia) {
        return materia.getPrecio() * 0.75;
    }
}
