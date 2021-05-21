package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic {
    private final List<String> message;
    private final String name;

    public ForumTopic(String name) {
        message = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post){
        message.add(post);
    }
}
