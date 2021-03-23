package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTestSuite {

    @Test
    void testDefaultInvestingStrategies(){
//        Given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemer");
        Customer kodilla = new CorporateCustomer("Kodilla");

//        When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " +stevenShouldBuy );
        String johnShouldBuy = john.predict();
        System.out.println("John should " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should " + kodillaShouldBuy);

//        Then
        assertEquals("[Conservative predictor]", stevenShouldBuy);
        assertEquals("[Aggressive predictor]", johnShouldBuy);
        assertEquals("[Balanced predictor]", kodillaShouldBuy);

    }

    @Test
    void testIndividualInvestingStrategy(){
//        Given
        Customer steven = new IndividualCustomer("Steven Links");

//        When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);

//        Then
        assertEquals("[Aggressive predictor]",stevenShouldBuy);
    }
}
