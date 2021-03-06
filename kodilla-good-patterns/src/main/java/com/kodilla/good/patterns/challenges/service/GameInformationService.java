package com.kodilla.good.patterns.challenges.service;

public class GameInformationService implements InformationService{
    @Override
    public void inform(OrderRequest orderRequest) {
        System.out.println("User: " + orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurName());
        System.out.println("Data: " + orderRequest.getOrderDay());
        System.out.println("Product: " + orderRequest.getProduct());
    }
}
