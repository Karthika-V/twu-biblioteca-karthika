//Booklist have a list of books and header
package com.twu.biblioteca;

import java.util.ArrayList;

public class BookList {

    public ArrayList<Book> listOfBooks() {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Harry Potter","J.K.Rowling",2000));
        bookList.add(new Book("Diary of a Young Girl","Anne frank",1942));
        return bookList;
    }

    public String displayHeader() {
        return ("Title\tAuthor\tPublished Year");
    }
}
