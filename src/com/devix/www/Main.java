package com.devix.www;

public class Main {

    public static void main(String[] args) {
        displayPassword("furball");
        displayPassword("cat");
    }

    private static void displayPassword(String password) {
        System.out.println("Password: " + password);
        if (password.length() >= 5) {
            return;
        }
        System.out.println("Password too short! ");
    }
}
