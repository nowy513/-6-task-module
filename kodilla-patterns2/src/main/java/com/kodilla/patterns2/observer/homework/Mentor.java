package com.kodilla.patterns2.observer.homework;



import java.util.ArrayList;
import java.util.List;

public class Mentor implements Observable{

    private final List<Observer> observers;
    private final List<String> message;
    private boolean isAccepted;
    private final int module;

    public Mentor(int module) {
        observers = new ArrayList<>();
        message = new ArrayList<>();
        this.isAccepted = true;
        this.module = module;
    }
    public void addHomework(String homework){
        message.add(homework);
        notifyObservers();
    }


    @Override
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);


    }

    @Override
    public void acceptHomework(Observer observer){
        if (isAccepted){
            message.add("Your homework has been acceptable");

        }else{
            message.add("Your homework not has been accetable");
        }
        notifyObservers();
    }

    public List<String> getMessage() {
        return message;
    }

    public boolean isAccepted() {
        return isAccepted;
    }

    public int getModule() {
        return module;
    }
}

