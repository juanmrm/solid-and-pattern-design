package com.demo.pattern.behavioral.observer;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class ServicioMatriculacionTest {

    @Test
    public void notifica () {
        ServicioMatriculacion spyOnmatriculador = spy(new ServicioMatriculacion());
        ServicioMensajeria spyOnMensajeria = spy(new ServicioMensajeria());
        ServicioAlumnado spyOnAlumnado = spy(new ServicioAlumnado());

        spyOnmatriculador.registra(spyOnMensajeria);
        spyOnmatriculador.registra(spyOnAlumnado);

        Alumno alumno = new Alumno("Juan", 33);
        Curso curso = new Curso("Criptografia", "Estudio de los algoritmos tipicos aplicados en criptografia");
        Matricula matricula = new Matricula(alumno, curso);

        spyOnmatriculador.alta(matricula);

        verify(spyOnmatriculador, times(2)).registra(any(NuevaMatriculaObserver.class));
        verify(spyOnMensajeria).nueva(matricula);
        verify(spyOnAlumnado).nueva(matricula);
    }
}
