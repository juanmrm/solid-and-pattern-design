package com.demo.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SingletonEnumTest {

    @Test
    public void sngularity() {
        SingletonEnum u1 = SingletonEnum.INSTANCE;
        SingletonEnum u2 = SingletonEnum.INSTANCE;

        u1.setValue(2);

        assertNotNull(u1);
        assertNotNull(u2);
        assertTrue(u1 == u2);

        assertEquals(u1.getValue(), u2.getValue());
    }
}
