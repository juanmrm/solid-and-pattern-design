package com.demo.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void singularity() {
        Singleton u1 = Singleton.getInstance();
        Singleton u2 = Singleton.getInstance();

        assertNotNull(u1);
        assertNotNull(u2);
        assertTrue(u1 == u2);
    }

}
