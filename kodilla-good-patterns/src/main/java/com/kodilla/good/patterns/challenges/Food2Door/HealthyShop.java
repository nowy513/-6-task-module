package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements Shop {

    private final String name = "Healthy Shop";


    @Override
    public OrderRequest process(OrderRequest orderRequest) {
        System.out.println("Zamówienie do " + name + " o numerze: " + orderRequest.getNumberOrder() + " zostało przyjęte " + orderRequest.getOrderDay());
        System.out.println();
        System.out.println("Zamówiono: " + orderRequest.getProduct().getQuantity() + "x " + orderRequest.getProduct().getName() + " cena za sztuke: " + orderRequest.getProduct().getPrice() + " pln");
        System.out.println();
        System.out.println("Koszt zamowienia: " + orderRequest.getProduct().getQuantity() * orderRequest.getProduct().getPrice() + " pln");
        System.out.println();
        return new OrderRequest(orderRequest.getDistributor(), orderRequest.getOrderDay(), orderRequest.getProduct(),orderRequest.getNumberOrder());
    }

    @Override
    public String getShopName() {
        return name;
    }
}
