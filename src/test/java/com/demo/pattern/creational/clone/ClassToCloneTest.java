package com.demo.pattern.creational.clone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ClassToCloneTest {

    @Test
    public void checkClone() {

        ClassToClone original = new ClassToClone("Cadena 1", "Cadena 2");
        ClassToClone copia = original.clone();

        assertNotNull(copia);
        assertEquals(original.getS1(), copia.getS1());
        assertEquals(original.getS2(), copia.getS2());
    }

}
