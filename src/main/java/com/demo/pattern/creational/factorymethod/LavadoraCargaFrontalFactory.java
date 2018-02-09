package com.demo.pattern.creational.factorymethod;

public class LavadoraCargaFrontalFactory extends LavadoraFactory {

    @Override
    protected Lavadora creaLavadora() {
        return new LavadoraCargaFrontal();
    }
}
