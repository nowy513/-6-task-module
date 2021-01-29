package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String user;
    private final char sex;
    private final LocalDate birthDate;
    private final int postedPost;

    public ForumUser(int userID, String user, char sex, int yearBirth, int monthBirth, int dayBirth, int postedPost) {
        this.userID = userID;
        this.user = user;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearBirth, monthBirth, dayBirth);
        this.postedPost = postedPost;
    }

    public int getUserID() {
        return userID;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public int getPostedPost() {
        return postedPost;
    }

    public int getBirthDate() {
        return birthDate.getYear();
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "userID " + userID +
                ", user '" + user + '\'' +
                ", sex " + sex +
                ", birthDate " + birthDate +
                ", postedPost " + postedPost +
                '}';
    }
}
