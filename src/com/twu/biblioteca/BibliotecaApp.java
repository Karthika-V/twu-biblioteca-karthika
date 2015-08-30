package com.twu.biblioteca;

public class BibliotecaApp {

    private String welcomeMessage;

    public String welcomeMessage() {
        welcomeMessage = "Welcome to Biblioteca!!";
        return welcomeMessage;
    }

    public boolean booksList() {
        System.out.println("List Of Books:");
        System.out.println("The Diary of A Young Girl\t Anne Frank\t 1952");
        return true;
    }

    public static void main(String[] args) {
        BibliotecaApp bib = new BibliotecaApp();
        System.out.println(bib.welcomeMessage());
        bib.booksList();
    }
}
