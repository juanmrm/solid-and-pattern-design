package com.demo.pattern.behavioral.state;

import lombok.Getter;

public class MicroondasImpl implements Microondas{

    @Getter
    private Estado estado = Estado.APAGADO;

    @Override
    public void apagar() {
        estado = estado.apagar();
    }

    @Override
    public void abrirPuerta() {
        estado = estado.abrirPuerta();
    }

    @Override
    public void setPotenciaMin() {
        estado = estado.setPotenciaMin();
    }

    @Override
    public void setPotenciaMax() {
        estado = estado.setPotenciaMax();
    }

    @Override
    public void cocinando() {
        estado = estado.cocinando();
    }
}
