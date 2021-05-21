package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.ChildSeatDecorator;
import com.kodilla.patterns2.decorator.taxiportal.MyTaxiNetworkOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithSalamiCheeseGetCost(){
//        Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
//        When
        BigDecimal theCost = theOrder.getCost();
//        Then
        assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testPizzaWithSalamiCheeseGetDescription(){
//        Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
//        When
        String description = theOrder.getDescription();
//        Then
        assertEquals(description, "pizza base + sauce + cheese + salami + cheese");
    }

    @Test
    public void testPizzaWithAllTheToppingsGetCost(){
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
//        When
        BigDecimal theCost = theOrder.getCost();
//        Then
        assertEquals(new BigDecimal(32), theCost);
    }

    @Test
    public void testPizzaWithAllTheToppingsGetDescription() {
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SalamiDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
//        When
        String description = theOrder.getDescription();
//        Then
        assertEquals(description, "pizza base + sauce + cheese + salami + cheese + pepper + ham + mushrooms");
    }
}
