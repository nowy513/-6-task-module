package com.kodilla.patterns2.observer.homework;

public class Student implements Observer{
    private final String student;
    private int updateCount;

    public Student(String student) {
        this.student = student;
    }

    @Override
    public void update(Homeworks homeworks) {
        System.out.println(student + ": Homework - Module: " + homeworks.getModule() + "\n" +
                "(total: " + homeworks.getMessage());
        updateCount++;
    }

    public String getStudent(){
        return student;
    }
    public int getUpdateCount(){
        return updateCount;
    }
}
