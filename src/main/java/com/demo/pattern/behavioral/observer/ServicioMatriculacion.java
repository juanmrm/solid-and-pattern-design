package com.demo.pattern.behavioral.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class ServicioMatriculacion {

    private Set<NuevaMatriculaObserver> observers = new LinkedHashSet<>();

    public void registra (NuevaMatriculaObserver observer) {
        this.observers.add(observer);
    }

    private void notifica (Matricula matricula) {
        this.observers.forEach(o -> o.nueva(matricula));
    }

    public void alta (Matricula nueva) {
        System.out.printf("Creando nueva matricula de %s para %s.\n", nueva.getCurso(), nueva.getAlumno());
        this.notifica(nueva);
    }

}
