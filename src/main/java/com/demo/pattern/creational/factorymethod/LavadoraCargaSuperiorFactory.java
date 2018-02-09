package com.demo.pattern.creational.factorymethod;

public class LavadoraCargaSuperiorFactory extends LavadoraFactory {

    @Override
    protected Lavadora creaLavadora() {
        return new LavadoraCargaSuperior();
    }
}
