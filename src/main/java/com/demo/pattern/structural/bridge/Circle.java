package com.demo.pattern.structural.bridge;

// Function as a Bridge between Shape and Draw
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, Draw draw) {
        super(draw);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String draw() {
        return  draw.drawCircle(radius,x,y);
    }
}