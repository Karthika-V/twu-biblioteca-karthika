//A book should have a title, author and published year.
package com.twu.biblioteca;

public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int publishedYear;

    public Book(String bookTitle, String bookAuthor, int publishedYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return (this.bookTitle+"\t"+this.bookAuthor+"\t"+this.publishedYear);
    }
}
