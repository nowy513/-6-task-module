package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {



    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When we get a normal list, we return even numbers")

    @Test
    void testOddNumbersExterminatorEmptyList() {
//        Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
//        When
        ArrayList<Integer> emptyLists = new ArrayList<>();

        List<Integer> result = emptyLists;
        System.out.println("TEST PUSTEJ LISTY");
//        Then
        Assertions.assertEquals(emptyLists, result);

    }
    @Test
    void testOddNumbersExterminatorNormalList() {


        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(5);
        normalList.add(12);
        normalList.add(11);
        normalList.add(22);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(12);
        evenNumbers.add(22);

        System.out.println("TEST LICZB PARZYSTYCH");
//        When
        ArrayList<Integer> testList = exterminator.exterminate(new ArrayList<Integer>(normalList));

//        Then
        Assertions.assertEquals(2, testList.size());
        Assertions.assertEquals(evenNumbers, testList);
    }

}
