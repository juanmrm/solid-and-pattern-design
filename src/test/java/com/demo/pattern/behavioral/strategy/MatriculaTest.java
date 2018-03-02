package com.demo.pattern.behavioral.strategy;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatriculaTest {

    private List<Materia> materias;
    private Secretaria secretaria;

    @Before
    public void before() {
        materias = Arrays.asList(
                new Materia("Matematicas", 100),
                new Materia("Historia", 50),
                new Materia("Ingles", 40));
        secretaria = new Secretaria();
    }

    @Test
    public void estrategia_de_pago_defecto() {
        // Given
        Alumno alumno = new Alumno("Juan", 35, new EstrategiaDePagoPorDefecto());
        Matricula matricula = new Matricula(alumno, materias);

        // When
        double total = secretaria.precio(matricula);

        // Then
        assertTrue(matricula.getAlumno().getEstrategia() instanceof EstrategiaDePagoPorDefecto);
        assertEquals(190, total, 0);
    }

    @Test
    public void estrategia_de_pago_menores30() {
        // Given
        Alumno alumno = new Alumno("Juan", 25, new EstrategiaDePagoPorDefecto());
        Matricula matricula = new Matricula(alumno, materias);

        // When
        double total = secretaria.precio(matricula);

        // Then
        assertTrue(matricula.getAlumno().getEstrategia() instanceof EstrategiaDePagoMenores30);
        assertEquals(142.5, total, 0);
    }

    @Test
    public void estrategia_de_pago_mayores() {
        // Given
        Alumno alumno = new Alumno("Juan", 55, new EstrategiaDePagoPorDefecto());
        Matricula matricula = new Matricula(alumno, materias);

        // When
        double total = secretaria.precio(matricula);

        // Then
        assertTrue(matricula.getAlumno().getEstrategia() instanceof EstrategiaDePagoParaMayores);
        assertEquals(63.3, total, 0.1);
    }
}
