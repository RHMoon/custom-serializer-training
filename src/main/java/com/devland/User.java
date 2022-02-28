package com.devland;

public class User {
    public int userId;
    public String name;

    public User() {
        super();
    }

    public User(final int userId, final String name) {
        this.userId = userId;
        this.name = name;
    }

    // API

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
