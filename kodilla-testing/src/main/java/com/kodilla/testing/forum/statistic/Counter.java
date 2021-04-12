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
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of coments: " + commentsNumber);
        System.out.println("Average posts per User is " + averagePostUser);
        System.out.println("Average comments per User is " + averageCommentUser);
        System.out.println("Average comments per Post is " + averageCommentPost);
    }
}