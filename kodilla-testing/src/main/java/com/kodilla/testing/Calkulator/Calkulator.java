package com.kodilla.testing.Calkulator;

public class Calkulator {
    private int a;
    private int b;
    private int resultAdd;
    private int resultSub;

    public Calkulator(){
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

    public int addition(int a, int b)
    {

        return resultAdd = a+b;
    }

    public int subtraction(int a, int b)
    {

        return resultSub = a-b;
    }

}

