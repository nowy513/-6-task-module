package com.kodilla.good.patterns.challenges.airport;

public class User {

    private final String name;
    private final String surname;
    private final Airport airport;

    public User(final String name, final String surname, final Airport airport) {
        this.name = name;
        this.surname = surname;
        this.airport = airport;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Airport getAirport() {
        return airport;
    }
}
