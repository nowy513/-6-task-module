package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    void testTaskAdd(){
//      Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
//      When
        board.getToDoList().getTask().add("To do List");
        board.getInProgressList().getTask().add("In progress List");
        board.getDoneList().getTask().add("Done List");
//      Then
        Assertions.assertEquals("To do List", board.getToDoList().getTask().get(0));
        Assertions.assertEquals("In progress List", board.getInProgressList().getTask().get(0));
        Assertions.assertEquals("Done List", board.getDoneList().getTask().get(0));


    }
}
