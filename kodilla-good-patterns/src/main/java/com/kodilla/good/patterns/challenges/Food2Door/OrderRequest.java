package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class OrderRequest{
    private Distributor distributor;
    private LocalDate orderDay;
    private Product product;
    private int numberOrder;

    public OrderRequest(Distributor distributor, LocalDate orderDay, Product product, int numberOrder) {
        this.distributor = distributor;
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

    public Distributor getDistributor() {
        return distributor;
    }
}