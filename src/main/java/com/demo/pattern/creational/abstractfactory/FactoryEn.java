package com.demo.pattern.creational.abstractfactory;

public class FactoryEn implements AbstractFactory {

    @Override
    public Preguntas getPreguntas() {
        return new PreguntasEn();
    }

    @Override
    public Saludos getSaludos() {
        return new SaludosEn();
    }
}
