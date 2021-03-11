package com.kodilla.good.patterns.challenges.Food2Door;

public abstract class Shop {

    private String name;


    public Shop(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    abstract void process(OrderRequest orderRequest);

    void informationService(OrderRequest orderRequest) {
        System.out.println("Zamówienie o numerze: " + orderRequest.getNumberOrder() + " zostało przyjęte " + orderRequest.getOrderDay());
        System.out.println();
        System.out.println("Zamówiono: " + orderRequest.getProduct().getQuantity() + "x " + orderRequest.getProduct().getName() + " cena za sztuke: " + orderRequest.getProduct().getPrice() + " pln");
        System.out.println();
        System.out.println("Koszt zamowienia: " + orderRequest.getProduct().getQuantity() * orderRequest.getProduct().getPrice() + " pln");
        System.out.println();

    }

    void informationDelivery(OrderRequest orderRequest, int deliveryTime) {
        int day = orderRequest.getOrderDay().getDayOfMonth() - deliveryTime;
        System.out.println("Przesyłka zostanie dostarczona: " + orderRequest.getOrderDay().getYear() + "-" + orderRequest.getOrderDay().getMonthValue() + "-" + day);

    }
}
