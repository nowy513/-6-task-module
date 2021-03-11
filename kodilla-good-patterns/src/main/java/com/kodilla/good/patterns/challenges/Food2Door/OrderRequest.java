package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class OrderRequest{

    private LocalDate orderDay;
    private Product product;
    private int numberOrder;

    public OrderRequest(LocalDate orderDay, Product product, int numberOrder) {
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
}