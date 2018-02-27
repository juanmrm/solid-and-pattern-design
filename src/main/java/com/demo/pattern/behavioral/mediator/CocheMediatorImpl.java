package com.demo.pattern.behavioral.mediator;

public class CocheMediatorImpl implements CocheMediator{

    private Radio radio;
    private Telefono telefono;

    @Override
    public void enciendeRadio() {
        this.apagaMusica();
        this.radio.enciende();
    }

    @Override
    public void apagaRadio() {
        this.radio.apaga();
    }

    @Override
    public void apagaMusica() {
        this.telefono.apagaMusica();
    }

    @Override
    public void addRadio(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void addTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
}
