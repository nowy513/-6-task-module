package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVENTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case DRIVINGTASK:
                return new DrivingTask("Driving Task", "City","the car");
            case PAINTINGTASK:
                return new PaintingTask("Painting Task","red", "the wall");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping Task", "Books", 10);
            default:
                return null;
        }
    }
}
