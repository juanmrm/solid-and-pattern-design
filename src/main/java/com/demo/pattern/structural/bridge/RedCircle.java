package com.demo.pattern.structural.bridge;

public class RedCircle implements Draw {

    @Override
    public String drawCircle(int radius, int x, int y) {
        return "Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]";
    }
}
