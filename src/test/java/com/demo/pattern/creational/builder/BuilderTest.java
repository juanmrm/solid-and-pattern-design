package com.demo.pattern.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BuilderTest {

    @Test
    public void construirPersonaMayor() {
        Persona mayor = new Persona.Builder("Maria")
                .setMunicipio("Selva")
                .setMayor(37)
                .setLugarTrabajo("Google")
                .build();

        assertNotNull(mayor);
        assertEquals("Maria", mayor.getNombre());
        assertEquals("Selva", mayor.getMunicipio());
        assertEquals(37, mayor.getEdad());
        assertEquals("Google", mayor.getLugarTrabajo());
    }

    @Test
    public void construirPersonaMenor() {
        Persona menor = new Persona.Builder("Pedro")
                .setMenor(4)
                .setColegio("Colegio de Selva")
                .build();

        assertNotNull(menor);
        assertEquals("Pedro", menor.getNombre());
        assertNull(menor.getMunicipio());
        assertEquals(4, menor.getEdad());
        assertEquals("Colegio de Selva", menor.getColegio());
    }

}
