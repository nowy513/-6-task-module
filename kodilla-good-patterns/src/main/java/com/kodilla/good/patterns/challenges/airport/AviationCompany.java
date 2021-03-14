package com.kodilla.good.patterns.challenges.airport;

import java.util.HashMap;
import java.util.Map;

public class AviationCompany {

    private final static Map<Integer, Airport>flights = new HashMap<>();

    public AviationCompany(){
        flights.put(1,new Airport("Rzeszów", "Kraków", ""));
        flights.put(2, new Airport("Kraków", "Warszawa", ""));
        flights.put(3, new Airport("Rzeszów", "Amsterdam", "Wrocław"));
        flights.put(4, new Airport("Gdańsk", "Kraków", ""));
        flights.put(5, new Airport("Wrocław", "Berlin", "Warszawa"));
        flights.put(6, new Airport("Rzeszów", "Madryt", "Wrocław"));
    }

    public HashMap<Integer, Airport> getFlights() {
        return new HashMap<Integer, Airport>(flights);
    }
}
