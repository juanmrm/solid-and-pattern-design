package com.demo.pattern.behavioral.mediator;

public interface CocheMediator {

    void enciendeRadio();

    void apagaRadio();

    void apagaMusica();

    void addRadio(Radio radio);

    void addTelefono(Telefono telefono);
}
