package com.kodilla.testing.Calkulator;

public class Calkulator {
    private int a;
    private int b;
    private int resultAdd;
    private int resultSub;

    public Calkulator(int a, int b){
        this.a = a;
        this.b = b;
        this.resultAdd = resultAdd;
        this.resultSub = resultSub;
    }

    public int getResultAdd() {
        return resultAdd;
    }

    public int getResultSub() {
        return resultSub;
    }

    public void addition(int a, int b)
    {
        resultAdd = a+b;
        System.out.println("Wynik dodawania: " + resultAdd);
    }

    public void subtraction(int a, int b)
    {
        resultSub = a-b;
        System.out.println("Wynik odejmowania: " + resultSub);
    }

}

