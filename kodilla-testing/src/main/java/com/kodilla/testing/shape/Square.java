package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.pow;

public class Square implements Shape {

    private String name = "Square";
    private double field;
    private double edgelenght;

    public Square(double edgelenght) {
        this.edgelenght = edgelenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 && Double.compare(square.edgelenght, edgelenght) == 0 && name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, edgelenght);
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        field = pow(edgelenght, 2);
        return field;
    }
}
