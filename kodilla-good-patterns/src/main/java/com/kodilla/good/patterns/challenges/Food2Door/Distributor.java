package com.kodilla.good.patterns.challenges.Food2Door;

public interface Distributor {

    OrderRequest process(OrderRequest orderRequest);
    String getDistributorName();

}
