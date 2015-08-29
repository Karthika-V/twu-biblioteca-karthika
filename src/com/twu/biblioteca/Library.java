package com.twu.biblioteca;

public class Library {

    private String welcomeMessage;

    public Library(String message) {
        welcomeMessage = message;
    }

    public String welcomeMessage() {
        return welcomeMessage;
    }
}
