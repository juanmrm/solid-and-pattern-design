package com.demo.pattern.behavioral.strategy;

public class EstrategiaDePagoParaMayores implements EstrategiaDePago{
    @Override
    public double precioPagado(Materia materia) {
        return materia.getPrecio() / 3;
    }
}
