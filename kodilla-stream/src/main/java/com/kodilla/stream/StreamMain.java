package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        System.out.println("ZADANIE 7.1. Wstęp do programowania funkcyjnego");

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("First sample text", " ABC ", (a, b) -> b + a + b);
        poemBeautifier.beautify("SMALL LETTERS", ".TXT", (a, b) -> a.toLowerCase() + b.toLowerCase());
        poemBeautifier.secondBeautify("Number of charcter", " - ", (a, b) -> a + b);


        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("ZADANIE 7.3. Poznanie funkcji ");

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUser = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getBirthDate() < 2001)
                .filter(forumUser -> forumUser.getSex() == 'M' )
                .filter(forumUser -> forumUser.getPostedPost() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

                theResultMapOfUser.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + ": "+ integerForumUserEntry.getValue())
                .forEach(System.out::println);


    }
}