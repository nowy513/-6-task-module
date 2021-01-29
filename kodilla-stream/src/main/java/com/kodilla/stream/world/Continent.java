package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {

    private final Set<Country> countryList = new HashSet<>();

    public void addCountry(Country country) {
        countryList.add(country);
    }

        public Set<Country> getCoutryList() {
            return countryList;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return countryList.equals(continent.countryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryList);
    }
}

