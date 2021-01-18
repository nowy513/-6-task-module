package com.kodilla.testing.Calkulator;

public class Calkulator {
    private int a;
    private int b;

    public Calkulator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void addition(int a, int b){
        System.out.println("Wynik dodawania: " + (a+b));
    }

    public void subtraction(int a, int b){
        System.out.println("Wynik odejmowania: " + (a-b));
    }

}

