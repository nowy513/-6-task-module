package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String result = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e.toString())
                .collect(Collectors.joining(" ! ", " ", " "));
        System.out.println(result);

    }
}
