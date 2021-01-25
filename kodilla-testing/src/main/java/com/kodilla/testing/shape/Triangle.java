package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double edge;
    private double height;
    private double field;

    public Triangle(double edge, double height) {
        this.edge = edge;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.edge, edge) == 0 && Double.compare(triangle.height, height) == 0 && Double.compare(triangle.field, field) == 0 && name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, edge, height, field);
    }



    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        field = (edge * height)/2;
        return field;
    }

}
