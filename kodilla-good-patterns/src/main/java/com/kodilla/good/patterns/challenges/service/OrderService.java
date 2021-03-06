package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public interface OrderService{
    boolean order(User user , LocalDate orderDay , String product);
}