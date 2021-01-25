package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Nested
@DisplayName("TDD:Test suite for task 6.4")
public class ShapeCollectorTestSuite {

@Test
     void testAddFigure() {

//    Given
    ShapeCollector shapeCollector = new ShapeCollector();
    Shape shape = new Square(5);
//    When
    shapeCollector.addFigure(shape);
//    Then
    assertEquals(1, shapeCollector.getShapeCollection().size());

    }

@Test
     void testRemoveFigure(){
//    Given
    ShapeCollector shapeCollector = new ShapeCollector();
    Shape shape = new Square(3);
    shapeCollector.addFigure(shape);
//    When
    boolean result = shapeCollector.removeFigure(shape);
//    Then
    assertTrue(result);
    assertEquals(0, shapeCollector.getShapeCollection().size());
}
@Test
     void testRemoveFigureNotExisting(){
//    Given
    ShapeCollector shapeCollector = new ShapeCollector();
    shapeCollector.addFigure(new Square(7));
//    When
    boolean result = shapeCollector.removeFigure(new Square(5));
//    Then
    assertTrue(result);
    assertEquals(0,result);
}
@Test
     void testGetFigure(){
//    Given
    ShapeCollector shapeCollector = new ShapeCollector();
    Shape shape = new Square(12);
    shapeCollector.addFigure(shape);
//    When
    Shape result = shapeCollector.getFigure(0);
//    Then
    assertEquals(shape, result);
}

@Test
     void testShowFigure(){
    ShapeCollector shapeCollector = new ShapeCollector();
    Shape shape = new Square(12);
    shapeCollector.addFigure(shape);
    ArrayList<Shape>shapeList = new ArrayList<>();
    shapeList.add(shape);
//    When
    List<Shape> resultList = shapeCollector.getShapeCollection();
//    Then
    assertEquals(shapeList.toString(), resultList.toString());

}
}
