package com.demo.pattern.creational.factorymethod;

public abstract class LavadoraFactory {

    public Lavadora crea() {
        Lavadora lavadora = this.creaLavadora();
        lavadora.ponerMandos();
        lavadora.ponerTambor();
        return lavadora;
    }

    protected abstract Lavadora creaLavadora();
}
