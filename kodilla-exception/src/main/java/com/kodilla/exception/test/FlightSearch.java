package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException{

        HashMap<String, Boolean>  airport = new HashMap<>();
        airport.put("Warsaw", Boolean.TRUE);
        airport.put("New York", Boolean.TRUE);
        airport.put("Berlin",Boolean.FALSE);
        airport.put("Barcelona", Boolean.TRUE);
        airport.put("Paris", Boolean.FALSE);

        if (airport.containsKey(flight.getArrivalAirport())){
            System.out.println(flight.getArrivalAirport()+ " " + airport.get(flight.getArrivalAirport()));
        }else{
            throw new RouteNotFoundException("No flight information");
        }


    }
}
