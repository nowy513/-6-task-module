package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class GameOrderRepository implements OrderRepository {
    private User user;
    private LocalDate orderDay;
    private String product;

    @Override
    public boolean createOrder(User user, LocalDate localDate, String product) {
        this.user = user;
        this.orderDay = localDate;
        this.product = product;
        return true;
    }
}
