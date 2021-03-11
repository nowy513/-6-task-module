package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop extends Shop{

    public GlutenFreeShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
    informationService(orderRequest);
    informationDelivery(orderRequest, 4);
    }
}
