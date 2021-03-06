package com.kodilla.good.patterns.challenges.service;

import java.time.LocalDate;

public class GameOrderService implements OrderService{
    private User user = new User("Jan" , "Kowalski");
    private LocalDate orderDay;
    private String game = "GTA V";
    private boolean dataUser = false;
    private boolean nameGame = false;


    @Override
    public boolean order(User user , LocalDate orderDay , String product) {
        this.orderDay = orderDay;
        if(this.user.getName().equals(user.getName()) && this.user.getSurName().equals(user.getSurName())){
            dataUser = true;
        }
        if(getGame().equals(product)){
            nameGame = true;
        }
        if(dataUser && nameGame){
            return true;
        }
        return false;
    }

    public String getGame() {
        return game;
    }
}
