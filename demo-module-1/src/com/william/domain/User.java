package com.william.domain;

public class User {
    private String username;
    private String userSex;

    public User() {
    }

    public User(String username, String userSex) {
        this.username = username;
        this.userSex = userSex;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getUserSex() {
        return userSex;
    }

    public User setUserSex(String userSex) {
        this.userSex = userSex;
        return this;
    }
}
