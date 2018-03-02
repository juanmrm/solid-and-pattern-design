package com.demo.pattern.behavioral.observer;

public class ServicioMensajeria implements NuevaMatriculaObserver {
    @Override
    public void nueva(Matricula nueva) {
        System.out.printf("Nuevo email: ¡Enhorabuena %s!, te has matriculado de %s.\n", nueva.getAlumno(), nueva.getCurso() );
    }
}