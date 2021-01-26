package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeCollection = new ArrayList<>();

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    public void addFigure(Shape shape){
        shapeCollection.add(shape);;
    }

    public boolean removeFigure(Shape shape){
       return shapeCollection.remove(shape);
    }

    public Shape getFigure(int n) {
        if(n<shapeCollection.size()){
            return shapeCollection.get(n);
        } else {
            return null;
        }
    }

    public void showFigiure(){
        System.out.println(shapeCollection.toString());
    }
}
