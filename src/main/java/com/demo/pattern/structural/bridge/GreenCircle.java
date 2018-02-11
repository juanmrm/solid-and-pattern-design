package com.demo.pattern.structural.bridge;

public class GreenCircle implements Draw {

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]";
    }
}
