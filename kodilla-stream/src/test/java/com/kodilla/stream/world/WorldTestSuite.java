package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
//        Given
        Continent europe = new Continent();
        Country poland = new Country(new BigDecimal ("37973534"));
        Country france = new Country(new BigDecimal ("66995728"));
        Country italy = new Country(new BigDecimal("60426667"));
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(italy);

        Continent africa = new Continent();
        Country angola = new Country(new BigDecimal("30810682"));
        Country gambia = new Country(new BigDecimal("2284148"));
        Country marocco = new Country(new BigDecimal("36032159"));
        africa.addCountry(angola);
        africa.addCountry(gambia);
        africa.addCountry(marocco);

        Continent asia = new Continent();
        Country china = new Country(new BigDecimal("1330044605"));
        Country georgia = new Country(new BigDecimal("4630624"));
        Country japan = new Country(new BigDecimal("127078679"));
        asia.addCountry(china);
        asia.addCountry(georgia);
        asia.addCountry(japan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
//        When
        BigDecimal totalPeople = world.getPeopleQuantity();
//        Then
        BigDecimal expectedPeople = new BigDecimal("1696276826");
        assertEquals(expectedPeople, totalPeople);

    }
}
