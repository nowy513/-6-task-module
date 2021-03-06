package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class GameOrderRequest {
    public static OrderRequest order(){
        User user = new User("Jan" , "Kowalski");
        LocalDate orderDay = LocalDate.of(2020 ,5 , 14);
        String product = "GTA V";
        return new OrderRequest(user , orderDay , product);
    }
}
