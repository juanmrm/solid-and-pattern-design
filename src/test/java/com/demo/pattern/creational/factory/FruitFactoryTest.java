package com.demo.pattern.creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitFactoryTest {

    @Test
    public void createApple() {
        FruitFactory factory = new FruitFactory();
        Apple apple = factory.makeApple();

        assertEquals("Manzana", apple.getTipo());
        assertEquals("Verde", apple.getColor());
    }

    @Test
    public void createOrange() {
        FruitFactory factory = new FruitFactory();
        Orange orange = factory.makeOrange();

        assertEquals("Naranja", orange.getTipo());
        assertEquals("Naranja", orange.getColor());
    }

}
