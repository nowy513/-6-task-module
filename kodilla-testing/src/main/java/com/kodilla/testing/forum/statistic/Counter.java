package com.kodilla.testing.forum.statistic;

public class Counter {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostUser;
    private double averageCommentUser;
    private double averageCommentPost;

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getaveragePostUser() {
        return averagePostUser;
    }

    public double getaverageCommentUser() {
        return averageCommentUser;
    }

    public double getaverageCommentPost() {
        return averageCommentPost;}


    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(usersNumber!=0) {
            averagePostUser = getPostsNumber() / getUsersNumber();
            averageCommentUser = getCommentsNumber() / getUsersNumber();
        }
        else {
            averagePostUser = 0;
            averageCommentUser = 0;
        }
        if(postsNumber!=0) {
            averageCommentPost = getCommentsNumber() / getPostsNumber();
        }
        else{
            averageCommentPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + getUsersNumber());
        System.out.println("Number of posts: " + getPostsNumber());
        System.out.println("Number of coments: " + getCommentsNumber());
        System.out.println("Average posts per User is " + getaveragePostUser());
        System.out.println("Average comments per User is " + getaverageCommentUser());
        System.out.println("Average comments per Post is " + getaverageCommentPost());
    }
}