//Booklist have a list of books and header information
package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<Book>();

    public void displayBooklistDetails() {
        System.out.println("List of Books:");
        System.out.println("Title\tAuthor\tPublished Year");
        bookList.add(new Book("Harry Potter", "J.K.Rowling", 2000));
        bookList.add(new Book("Diary of a Young Girl", "Anne frank", 1942));
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}
