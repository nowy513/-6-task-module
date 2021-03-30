package com.kodilla.patterns.factory;

public class Rectangle implements Shape{
    private final String name;
    private final double widht;
    private final double lenght;

    public Rectangle(String name, double widht, double lenght) {
        this.name = name;
        this.widht = widht;
        this.lenght = lenght;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return widht * lenght;
    }

    @Override
    public double getCircumference() {
        return 2 * widht + 2 * lenght;
    }
}
