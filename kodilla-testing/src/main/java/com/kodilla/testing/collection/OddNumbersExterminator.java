package com.kodilla.testing.collection;

import java.util.ArrayList;

class OddNumbersExterminator {
    public  ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int number : numbers){
            if(number%2==0){
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }
}