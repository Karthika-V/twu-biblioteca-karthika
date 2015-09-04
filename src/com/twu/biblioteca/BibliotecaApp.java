//Launches Biblioteca Application and display Welcome Message and List of Books
package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public void display(String message) {
        System.out.println(message);
    }

    public void start() {
        display("Welcome to Biblioteca!!!");
        display("List of Books:");
        Book book = new Book();
        book.display();
    }
}
