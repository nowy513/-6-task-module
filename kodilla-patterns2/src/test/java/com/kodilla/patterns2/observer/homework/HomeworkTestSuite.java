package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
//        Given
        Mentor firstHomework = new FirstHomewor();
        Mentor secondHomework = new SecondHomework();
        Mentor thirdHomework = new ThirdHomework();

        Student johnSmith = new Student("John Smith");
        Student ivoneEscobar = new Student("Ivone Escobar");
        Student jessiePark = new Student("Jessie Park");

        firstHomework.registerObserver(johnSmith);
        secondHomework.registerObserver(ivoneEscobar);
        thirdHomework.registerObserver(jessiePark);

//      When
        firstHomework.addHomework("Create interface");
        secondHomework.addHomework("Map and HashMap");
        thirdHomework.addHomework("Terminal");

        firstHomework.acceptHomework(johnSmith);
        secondHomework.acceptHomework(ivoneEscobar);
        thirdHomework.acceptHomework(jessiePark);

        boolean test1 = firstHomework.isAccepted();
        boolean test2 = secondHomework.isAccepted();
        boolean test3 = thirdHomework.isAccepted();
//        Then
        assertEquals(test1, true);
        assertEquals(test2, true);
        assertEquals(test3, true);

        assertEquals(2, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(2, jessiePark.getUpdateCount());

    }
}
