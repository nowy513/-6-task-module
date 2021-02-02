package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args){
        Flight flight1 = new Flight("Barcelona","Warsaw");
        Flight flight2 = new Flight("Warsaw","Moscow");

        FlightSearch flightSearch = new FlightSearch();
        try{
            flightSearch.findFilght(flight1);
        }catch (RouteNotFoundException e) {
            System.out.println("No flight information!");
        }
        try{
            flightSearch.findFilght(flight2);
        }catch (RouteNotFoundException e){
            System.out.println("No flight information!");
        }
    }
}
