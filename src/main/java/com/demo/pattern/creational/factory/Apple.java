package com.demo.pattern.creational.factory;

public class Apple implements Fruit {

    @Override
    public String getTipo() {
        return "Manzana";
    }

    @Override
    public String getColor() {
        return "Verde";
    }
}
