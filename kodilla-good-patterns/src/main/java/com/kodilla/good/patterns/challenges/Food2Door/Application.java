package com.kodilla.good.patterns.challenges.Food2Door;

import static com.kodilla.good.patterns.challenges.Food2Door.OrderRequest.HEALTHY_SHOP;

public class Application {
    public static void main(String[] args){
        Order order = new Order("Tomatos",100);

        OrderProcess orderProcess = new OrderProcess();
        orderProcess.buy(HEALTHY_SHOP, order);
    }

}
