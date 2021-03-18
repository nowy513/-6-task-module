package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Distributor{

    private final String name = "Extra Food Shop";

    @Override
    public OrderRequest process(OrderRequest orderRequest) {
        System.out.println();
        System.out.println("Zamówienie do " + name + " o numerze: " + orderRequest.getNumberOrder() + " zostało przyjęte " + orderRequest.getOrderDay());
        System.out.println();
        System.out.println("Zamówiono: " + orderRequest.getProduct().getQuantity() + "x " + orderRequest.getProduct().getName() + " cena za sztuke: " + orderRequest.getProduct().getPrice() + " pln");
        System.out.println();
        System.out.println("Koszt zamowienia: " + orderRequest.getProduct().getQuantity() * orderRequest.getProduct().getPrice() + " pln");
        System.out.println();
        return new OrderRequest(orderRequest.getDistributor(), orderRequest.getOrderDay(), orderRequest.getProduct(),orderRequest.getNumberOrder());
    }

    @Override
    public String getDistributorName() {
        return name;
    }

}
