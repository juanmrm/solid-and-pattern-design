package com.demo.pattern.behavioral.observer;

public class ServicioAlumnado implements NuevaMatriculaObserver {

    @Override
    public void nueva(Matricula nueva) {
        System.out.printf("Nuevo matricula recibida en servicio de alumnado: %s, se ha matriculado de %s.\n", nueva.getAlumno(), nueva.getCurso());
    }
}
