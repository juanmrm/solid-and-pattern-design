package com.demo.pattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class UnicoTest {

    @Test
    public void singularity() {
        Unico u1 = Unico.getInstance();
        Unico u2 = Unico.getInstance();

        assertNotNull(u1);
        assertNotNull(u2);
        assertTrue(u1 == u2);
    }

}
