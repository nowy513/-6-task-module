package com.kodilla.good.patterns.challenges.Food2Door;

public interface Shop {

    OrderRequest process(OrderRequest orderRequest);
    String getShopName();

}
