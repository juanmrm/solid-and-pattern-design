package com.demo.pattern.structural.bridge;

// Abstraction
public abstract class Shape {

    protected Draw draw;

    protected Shape(Draw draw){
        this.draw = draw;
    }

    public abstract String draw();
}