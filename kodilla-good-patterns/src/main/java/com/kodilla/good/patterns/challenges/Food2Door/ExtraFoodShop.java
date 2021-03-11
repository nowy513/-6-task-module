package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop extends Shop{


    public ExtraFoodShop(String name) {
        super(name);
    }


    @Override
    void process(OrderRequest orderRequest){
        informationService(orderRequest);
        informationDelivery(orderRequest, 5);
    }

}
