package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class OrderRequest{
    private Shop shop;
    private LocalDate orderDay;
    private Product product;
    private int numberOrder;

    public OrderRequest(Shop shop, LocalDate orderDay, Product product, int numberOrder) {
        this.shop = shop;
        this.orderDay = orderDay;
        this.product = product;
        this.numberOrder = numberOrder;
    }

    public LocalDate getOrderDay() {
        return orderDay;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public Shop getDistributor() {
        return shop;
    }
}