package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

@Test
void testGetAverage(){
//    Given
    int[] numbers = new int[] {7,54,32,2,65};
//    When
    double avarage = ArrayOperations.getAverage(numbers).getAsDouble();
//    Then
    Assertions.assertEquals(32,avarage);
}
}
