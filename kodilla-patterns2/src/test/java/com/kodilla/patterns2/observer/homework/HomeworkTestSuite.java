package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
//        Given
        Homeworks firstHomework = new FirstHomewor();
        Homeworks secondHomework = new SecondHomework();
        Homeworks thirdHomework = new ThirdHomework();
        Student johnSmith = new Student("John Smith");
        Student ivoneEscobar = new Student("Ivone Escobar");
        Student jessiePark = new Student("Jessie Park");

        firstHomework.registerObserver(johnSmith);
        secondHomework.registerObserver(ivoneEscobar);
        thirdHomework.registerObserver(jessiePark);

        firstHomework.addHomework("Create interface");
        secondHomework.addHomework("Map and HashMap");
        thirdHomework.addHomework("Terminal");

        firstHomework.acceptHomework(johnSmith);
        secondHomework.acceptHomework(ivoneEscobar);
        thirdHomework.acceptHomework(jessiePark);
//        When
        boolean test1 = firstHomework.isAccepted();
        boolean test2 = secondHomework.isAccepted();
        boolean test3 = thirdHomework.isAccepted();
//        Then
        assertEquals(test1, true);
        assertEquals(test2, true);
        assertEquals(test3, true);
    }
}
