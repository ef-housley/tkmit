package com.example.demo.model;

public class User {
    // Attributes
    private String username;
    private String email;
    private String password;
    private int age;

    // Constructor
    public User(String username, String email, String password, int age) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}





