package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(e -> e.toString() + "!")
                .forEach(System.out::print);
    }
}
