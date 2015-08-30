package com.twu.biblioteca;

public class Books {

    private String bookTitle;

    public Books(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String bookDetails() {
        return bookTitle;
    }
}

