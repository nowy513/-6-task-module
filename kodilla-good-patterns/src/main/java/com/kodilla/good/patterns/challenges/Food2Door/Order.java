package com.kodilla.good.patterns.challenges.Food2Door;


import java.time.LocalDate;

public class Order {



        public OrderRequest order1() {

                Shop extraFoodShop = new ExtraFoodShop();
                Product batonik = new Product("Princessa", 50, 1.20);
                LocalDate orderDay = LocalDate.of(2021, 04, 20);
                int numberOrder = 5928;

                return new OrderRequest(extraFoodShop, orderDay, batonik, numberOrder);

        }
}