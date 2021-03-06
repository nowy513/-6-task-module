package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;


public interface OrderRepository {
    boolean createOrder(User user , LocalDate localDate, String product);
}
