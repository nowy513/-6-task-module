package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {

    private String name = "Circle";
    private double field;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 && Double.compare(circle.radius, radius) == 0 && name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, radius);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        field = PI * pow(radius, 2);
        return field;
    }
}
