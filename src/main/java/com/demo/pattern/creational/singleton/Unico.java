package com.demo.pattern.creational.singleton;

import java.io.Serializable;

public class Unico implements Serializable{

    private static Unico instance;

    private Unico() {}

    public synchronized static Unico getInstance() { // Indicar sincronized por posibles problemas de concurrencia (no deben entrar 2 hilos a la vez)
        if (instance == null) {
            instance = new Unico();
        }
        return instance;
    }

    private Object readResolve() { // Para controlar que nadie pueda crear otra instancia serializando / deserializando este singleton.
        return instance;
    }

}
