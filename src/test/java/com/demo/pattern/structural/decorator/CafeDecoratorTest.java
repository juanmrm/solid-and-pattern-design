package com.demo.pattern.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CafeDecoratorTest {

    @Test
    public void cafeConLeche() {
        Cafe conLeche = new ConLeche(new CafeCorto());

        assertEquals("cafe corto con leche", conLeche.descripcion());
        assertEquals(90+20, conLeche.precio());
    }

    @Test
    public void cafeConLecheYCacao() {
        Cafe conLecheYCacao = new ConCacao(new ConLeche(new CafeCorto()));

        assertEquals("cafe corto con leche con cacao", conLecheYCacao.descripcion());
        assertEquals(90+20+10, conLecheYCacao.precio());
    }
}
