package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args){
        Order order = new Order();
        OrderRequest orderRequest1 = order.order1();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process(orderRequest1);
    }

}
