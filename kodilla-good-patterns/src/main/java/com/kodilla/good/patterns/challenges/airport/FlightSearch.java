package com.kodilla.good.patterns.challenges.airport;

import java.util.HashMap;

public class FlightSearch {

    private final HashMap<Integer, Airport>flightList;

    public FlightSearch(HashMap<Integer, Airport> flightList) {
        this.flightList = flightList;
    }
    public void searchDeparture(User user){
        flightList.entrySet().stream()
                .map(e->e.getValue())
                .filter(e->e.getDepartures().toUpperCase().equals(user.getAirport().getDepartures().toUpperCase()))
                .map(e->"Departure: " + e.getDepartures() + "\n" + "Arrival: " + e.getArrival())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchArrival(User user){
        flightList.entrySet().stream()
                .map(e->e.getValue())
                .filter(e->e.getArrival().toUpperCase().equals(user.getAirport().getArrival().toUpperCase()))
                .map(e->"Arrival: " + e.getArrival() + "\n" + "Departure: " + e.getDepartures())
                .forEach(System.out::println);
        System.out.println();
    }
    public void searchConnectingFlight (User user){
        flightList.entrySet().stream()
                .map(e->e.getValue())
                .filter(e->e.getConnection().toUpperCase().equals(user.getAirport().getConnection().toUpperCase()))
                .map(e->"Departure: " + e.getDepartures() + " -> Connection: " + e.getConnection() + " -> Arrival: " + e.getArrival())
                .forEach(System.out::println);
    }
}
