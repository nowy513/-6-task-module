package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
//        Given
        User jan = new Millenials("Jan Kowalski");
        User andrzej = new YGeneration("Andrzej Nowak");
        User katarzyna = new ZGeneration("Katarzyna Wiśniewska");

//        When
        String janShare = jan.sharePost();
        System.out.println("Jan: " + janShare);
        String andrzejShare = andrzej.sharePost();
        System.out.println("Andrzej: " + andrzejShare);
        String katarzynaShare = katarzyna.sharePost();
        System.out.println("Katarzyna: " + katarzynaShare);

//        Then
        assertEquals("[ Facebook ]",janShare);
        assertEquals("[ Twitter ]", andrzejShare);
        assertEquals("[ Snapchat ]", katarzynaShare);

    }

    @Test
    void testIndividualSharingStrategy(){
//        Given
        User jan = new Millenials("Jan Kowalski");

//        When
        String janShare = jan.sharePost();
        System.out.println("Jan should: " + janShare);
        jan.setSharePostStrategy(new TwitterPublisher());
        janShare = jan.sharePost();
        System.out.println("Jan now should: " + janShare);

//        Then
        assertEquals("[ Twitter ]", janShare);

    }
}
