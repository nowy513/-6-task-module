package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop extends Shop{

    public HealthyShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
        informationService(orderRequest);
        informationDelivery(orderRequest, 3);
    }
}
