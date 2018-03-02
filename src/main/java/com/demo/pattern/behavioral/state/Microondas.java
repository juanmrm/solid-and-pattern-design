package com.demo.pattern.behavioral.state;

public interface Microondas {

    void apagar();

    void abrirPuerta();

    void setPotenciaMin();

    void setPotenciaMax();

    void cocinando();

    Estado getEstado();

}
