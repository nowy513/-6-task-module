package com.kodilla.good.patterns.challenges.airport;

import java.util.Objects;

public final class Airport {

    private final String arrival;
    private final String departures;
    private final String connection;

    public Airport(String departures, String arrival, String connection) {
        this.arrival = arrival;
        this.departures = departures;
        this.connection = connection;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDepartures() {
        return departures;
    }

    public String getConnection() {
        return connection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(arrival, airport.arrival) && Objects.equals(departures, airport.departures) && Objects.equals(connection, airport.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrival, departures, connection);
    }
}
