//Launches Biblioteca Application and display Welcome Message.
package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void display() {
        System.out.println("Welcome to Biblioteca!!!");
    }

    public void start() {
        display();
    }
}
