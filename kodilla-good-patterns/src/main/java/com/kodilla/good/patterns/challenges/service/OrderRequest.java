package com.kodilla.good.patterns.challenges.service;
import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private LocalDate orderDay;
    private String product;

    public OrderRequest(User user, LocalDate orderDay , String product) {
        this.user = user;
        this.orderDay = orderDay;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDay() {
        return orderDay;
    }

    public String getProduct() {
        return product;
    }
}