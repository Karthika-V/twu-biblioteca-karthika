package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {

    public ArrayList bookList() {
        ArrayList<String> booksList = new ArrayList<String>();
        booksList.add("The Diary of A Young Girl");
        booksList.add("Harry Potter and Sorcerer's stone");
        return booksList;
    }

    public void display() {
        ArrayList<String> booksList = bookList();
        for (String book : booksList) {
            System.out.println(book);
        }
    }
}
