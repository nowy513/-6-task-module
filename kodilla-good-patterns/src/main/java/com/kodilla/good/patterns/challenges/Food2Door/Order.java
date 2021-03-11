package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class Order {

    public OrderRequest order1() {

        Product batonik = new Product("Princessa", 50, 1.20);
        LocalDate orderDay = LocalDate.of(2021, 04, 20);

        return new OrderRequest(orderDay, batonik, 5928);

    }
}
