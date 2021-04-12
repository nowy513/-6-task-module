package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest{

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String HEALTHY_SHOP = "HealthyShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public Contractor getContractor(String conName) {
        if (conName.equalsIgnoreCase(EXTRA_FOOD_SHOP)) {
            return new ExtraFoodShop(EXTRA_FOOD_SHOP);
        } else if (conName.equalsIgnoreCase(HEALTHY_SHOP)) {
            return new HealthyShop(HEALTHY_SHOP);
        } else if (conName.equalsIgnoreCase(GLUTEN_FREE_SHOP)) {
            return new GlutenFreeShop(GLUTEN_FREE_SHOP);
        } else {
            System.out.println("Warning, no contractor selected.");
            return null;
        }
    }
}