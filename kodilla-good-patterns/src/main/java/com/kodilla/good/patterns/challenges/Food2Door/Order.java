package com.kodilla.good.patterns.challenges.Food2Door;


public class Order {

        public String product;
        public int quantity;

        public Order(String product, int quantity) {
                this.product = product;
                this.quantity = quantity;
        }

        public String getProduct() {
                return product;
        }

        public int getQuantity() {
                return quantity;
        }
}