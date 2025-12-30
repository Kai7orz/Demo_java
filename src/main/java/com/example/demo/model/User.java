package com.example.demo.model;

public class User {
    private UserId id = null;
    private final String name;
    private final String email;

    public User (String name,String email){
        this.name = name;
        this.email = email;
    }

    public void setId (UserId id) {
        this.id = id;
    }

    public UserId getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getEmail () {
        return this.email;
    }

}
