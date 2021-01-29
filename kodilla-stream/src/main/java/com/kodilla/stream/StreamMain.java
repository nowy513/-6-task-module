package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("First sample text", " ABC ", ((a, b) -> b+a+b));
        poemBeautifier.secondBeautify("SMALL LETTERS", ".TXT",((a, b) -> a+b));
        poemBeautifier.thirdBeautify("Number of charcter", " - ", ((a, b) -> a+b));
    }

}