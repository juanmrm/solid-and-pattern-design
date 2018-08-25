package com.demo.pattern.creational.factory;

public class FruitFactory {

    public Apple makeApple() {
        return new Apple();
    }

    public Orange makeOrange() {
        return new Orange();
    }

}
