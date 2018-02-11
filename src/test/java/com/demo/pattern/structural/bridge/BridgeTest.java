package com.demo.pattern.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BridgeTest {

    @Test
    public void drawCircles() {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        String s1 = redCircle.draw();
        String s2 = greenCircle.draw();

        assertTrue(s1.contains("color: red"));
        assertTrue(s2.contains("color: green"));
    }
}