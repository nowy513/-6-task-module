package com.kodilla.good.patterns.challenges.airport;

public class Application {
    public static void main(String[] args){


        Customers customers = new Customers();
        User user1 = customers.customer1;
        User user2 = customers.customer2;
        User user3 = customers.customer3;
        AviationCompany aviationCompany = new AviationCompany();
        FlightSearch flightSearch = new FlightSearch(aviationCompany.getFlights());
        flightSearch.searchDeparture(user1);
        flightSearch.searchArrival(user2);
        flightSearch.searchConnectingFlight(user3);
    }
}
