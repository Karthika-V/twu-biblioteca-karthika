//Launches Biblioteca Application and display Welcome Message and List of Books
package com.twu.biblioteca;

import java.util.ArrayList;

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
        BookList bookList = new BookList();
        ArrayList<Book> listOfBooks = bookList.listOfBooks();
        display(bookList.displayHeader());
        for(Book book:listOfBooks) {
            display(book.toString());
        }
    }
}
