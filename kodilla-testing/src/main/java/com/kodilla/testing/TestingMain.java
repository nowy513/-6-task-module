package com.kodilla.testing;


import com.kodilla.testing.Calkulator.Calkulator;

public class TestingMain {
    public static void main(String[] args) {
        Calkulator calkulator = new Calkulator(3,4);
        calkulator.addition(3, 4);
        calkulator.subtraction(3, 8);

        int result = calkulator.getA();
        int result2 = calkulator.getB();

        if (result== calkulator.getA()){
            System.out.println("Test ok");
        }else{
            System.out.println("ERROR!");
        }
        if (result2== calkulator.getB()){
            System.out.println("Test ok");
        }else{
            System.out.println("ERROR!");
        }

    }
}