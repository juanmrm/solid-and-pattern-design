package com.demo.pattern.creational.abs.factory;

public class FactoryEs implements AbstractFactory {

    @Override
    public Preguntas getPreguntas() {
        return new PreguntasEs();
    }

    @Override
    public Saludos getSaludos() {
        return new SaludosEs();
    }
}
