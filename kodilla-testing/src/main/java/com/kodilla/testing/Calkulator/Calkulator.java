package com.kodilla.testing.Calkulator;

public class Calkulator {
    private int a;
    private int b;
    private int result;
    private int result2;

    public Calkulator(int a, int b){
        this.a = a;
        this.b = b;
        this.result = result;
        this.result2 = result2;
    }

    public int getResult() {
        return result;
    }

    public int getResult2() {
        return result2;
    }

    public void addition(int a, int b)
    {
        result = a+b;
        System.out.println("Wynik dodawania: " + result);
    }

    public void subtraction(int a, int b)
    {
        result2 = a-b;
        System.out.println("Wynik odejmowania: " + result2);
    }

}

