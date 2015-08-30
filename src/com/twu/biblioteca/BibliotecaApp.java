package com.twu.biblioteca;

public class BibliotecaApp {

    private String welcomeMessage;

    public String welcomeMessage() {
        welcomeMessage = "Welcome to Biblioteca!!";
        return welcomeMessage;
    }

    public static void main(String[] args) {

        BibliotecaApp bib = new BibliotecaApp();
        System.out.println(bib.welcomeMessage());

    }
}
