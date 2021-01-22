package com.kodilla.testing;


import com.kodilla.testing.Calkulator.Calkulator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();
        System.out.println("TEST KALKULATORA!");
        System.out.println();

        Calkulator calkulator = new Calkulator();
        int resultAdd = calkulator.addition(3,4);
        int resultSub = calkulator.subtraction(3, 8);

        System.out.println("Wynik dodawania: " + resultAdd);
        System.out.println("Wynik odejmowania: " + resultSub);

        if (resultAdd == 7){
            System.out.println("Test ok");
        }else{
            System.out.println("ERROR!");
        }
        if (resultSub == -5){
            System.out.println("Test ok");
        }else{
            System.out.println("ERROR!");
        }

   }
}