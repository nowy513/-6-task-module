package com.kodilla.good.patterns.challenges.service;

public class Application {
    public static void main(String[] args) {
        GameOrderRequest gameOrderRequest = new GameOrderRequest();
        OrderRequest orderRequest = GameOrderRequest.order();

        ProductOrderService productOrderService = new ProductOrderService(new GameInformationService() , new GameOrderService() , new GameOrderRepository());
        productOrderService.process(orderRequest);
    }
}
