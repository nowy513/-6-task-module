package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Contractor implements Shop{
    private String conName;
    protected String conAvaible;

    public Contractor(String conName) {
        this.conName = conName;
    }

    public String getConName() {
        return conName;
    }

    public String welcomeToTheShop() {
        conAvaible = "Welcome to " + conName;
        System.out.println(conAvaible);
        return conAvaible;
    }

    @Override
    public String process() {

            conAvaible = "Thank you for making an order in " + conName;

        System.out.println(conAvaible);
        return conAvaible;
    }

    @Override
    public List productList() {
        return null;
    }
}
