package com.demo.pattern.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable{

    private static Singleton instance;

    private Singleton() {}

    public synchronized static Singleton getInstance() { // Indicar sincronized por posibles problemas de concurrencia (no deben entrar 2 hilos a la vez)
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Controla la deserializacion de un objeto
    private Object readResolve() { // Para controlar que nadie pueda crear otra instancia serializando / deserializando este singleton.
        return instance;
    }

}
