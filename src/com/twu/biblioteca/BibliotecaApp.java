package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    private String welcomeMessage;

    public String welcomeMessage() {
        welcomeMessage = "Welcome to Biblioteca!!";
        return welcomeMessage;
    }

    public ArrayList booksList() {
        System.out.println("List Of Books:");
        ArrayList<String> books = new ArrayList<String>();
        books.add("The Diary of A Young Girl\t Anne Frank\t 1952");
        books.add("Harry Potter\t J.K Rowling\t 2004");
        return books;
    }

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        System.out.println(bibliotecaApp.welcomeMessage());
    }
}
