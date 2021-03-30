package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask(){
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTask.executeTask();
//        Then
        assertEquals("Driving Task", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    void testPaintingTask(){
//        Given
        TaskFactory factory = new TaskFactory();
//        When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
//        Then
        assertEquals("Painting Task", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    void testShoppingTask(){

        TaskFactory factory = new TaskFactory();
//        When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
//        Then
        assertEquals("Shopping Task", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }
}
