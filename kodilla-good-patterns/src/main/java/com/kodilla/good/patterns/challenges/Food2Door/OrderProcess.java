package com.kodilla.good.patterns.challenges.Food2Door;

class OrderProcess {
    private Contractor contractor;
    private String product;
    private int quantity;


    public Order buy(String conName, Order order) {

        OrderRequest orderRequest = new OrderRequest();
        Contractor contractor = orderRequest.getContractor(conName);

        contractor.welcomeToTheShop();
        contractor.productList();


        if (contractor != null && contractor.getConName() != "") {
            System.out.println("Your order in " + contractor.getConName() + " is " + order.quantity + " " + order.product);
            contractor.process();
            return new Order("Tomatos", 100);
        } else {
            System.out.println("The order has not been accepted.");
            return null;
        }

    }
}
