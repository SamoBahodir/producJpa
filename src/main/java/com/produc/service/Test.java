package com.produc.service;

public class Test {
    public static void main(String[] args) {
        User user = User.getUser();
        User user1 = User.getUser();
        System.out.println("user1 = " + user1);
        System.out.println("user = " + user);
    }
}

class User {
    private static User user = new User();

    private User() {

    }

    public static User getUser() {
        return user;
    }
}

class Role {
    private User user;

    public Role(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}