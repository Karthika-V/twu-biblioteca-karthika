//Booklist displays a list of books and does the operations:Check out and Return Books
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<Book>();

    public Library() {
        library.add(new Book("Harry Potter", "J.K.Rowling", 2000));
        library.add(new Book("Diary of a Young Girl", "Anne frank", 1942));
    }

    public void displayLibraryBooks() {
        System.out.println("List of Books:");
        System.out.println("Title\tAuthor\tPublished Year");
        for (Book book : library) {
            System.out.println(book.toString());
        }
    }

    public void checkOutBook(String userChoice) {
        Book userChoiceBook = new Book(userChoice, null, 0);
        if (!library.contains(userChoiceBook)) {
            System.out.println("That book is not available.");
        } else {
            for (Book book : library) {
                if (book.equals(userChoiceBook)) {
                    library.remove(book);
                    System.out.println("Thank You! Enjoy the Book");
                }
            }
        }
    }

    public void returnBook(String bookChoice) {

    }
}
