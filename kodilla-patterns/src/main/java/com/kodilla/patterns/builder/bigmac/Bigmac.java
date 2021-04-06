package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final String burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    private Bigmac(final String bun, final String burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }


    public static class BigmacBuilder {
        private String bun;
        private String burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(String burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

        public String getBun() {
            return bun;
        }

        public String getBurgers() {
            return burgers;
        }

        public List<String> getIngredients() {
            return ingredients;
        }

        public String getSauce() {
            return sauce;
        }

        @Override
        public String toString() {
            return "BigmacBuilder{" +
                    "bun='" + bun + '\'' +
                    ", burgers='" + burgers + '\'' +
                    ", sauce='" + sauce + '\'' +
                    ", ingredients=" + ingredients +
                    '}';

    }
}
