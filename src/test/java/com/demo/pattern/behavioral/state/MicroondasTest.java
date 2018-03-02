package com.demo.pattern.behavioral.state;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicroondasTest {

    private Microondas micro;

    @Before
    public void before() {
        micro = new MicroondasImpl();
    }

    @Test
    public void apagado_a_abierto() {
        // Given
        assertEquals(Estado.APAGADO, micro.getEstado());

        // When
        micro.abrirPuerta();

        // Then
        assertEquals(Estado.PUERTA_ABIERTA, micro.getEstado());
    }

    @Test
    public void apagado_a_potencia_min() {
        // Given
        assertEquals(Estado.APAGADO, micro.getEstado());

        // When
        micro.setPotenciaMin();

        // Then
        assertEquals(Estado.POTENCIA_MIN, micro.getEstado());
    }

    @Test
    public void apagado_a_potencia_max() {
        // Given
        assertEquals(Estado.APAGADO, micro.getEstado());

        // When
        micro.setPotenciaMax();

        // Then
        assertEquals(Estado.POTENCIA_MAX, micro.getEstado());
    }

    @Test
    public void apagado_a_cocinando() {
        // Given
        assertEquals(Estado.APAGADO, micro.getEstado());

        // When
        micro.cocinando();

        // Then
        assertEquals(Estado.APAGADO, micro.getEstado());
    }

    // TODO: resto de combinaciones

}
