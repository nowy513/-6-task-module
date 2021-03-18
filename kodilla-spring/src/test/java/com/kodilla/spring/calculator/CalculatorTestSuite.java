package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalculatorTestSuite {

    @Test
    void testCalculations(){
//        Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

//        When
        double add = calculator.add(4, 1);
        double sub = calculator.sub(5,2);
        double mul = calculator.mul(6,2);
        double div = calculator.div(8,2);

//        Then
        Assertions.assertEquals(5, add, 0.0);
        Assertions.assertEquals(3, sub, 0.0);
        Assertions.assertEquals(12, mul, 0.0);
        Assertions.assertEquals(4, div, 0.0);

    }
}
