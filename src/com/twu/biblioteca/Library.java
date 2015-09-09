//Library displays a list of books and does the operations:Check out and Return Books
package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Book> checkedOutBooks = new ArrayList<Book>();

    public Library() {
        books.add(new Book("Harry Potter", "J.K.Rowling", 2000));
        books.add(new Book("Diary of a Young Girl", "Anne frank", 1942));
    }

    public void displayLibraryBooks() {
        System.out.println("List of Books:");
        String divider = "------------------------------------------------------------";
        System.out.println(divider);
        System.out.println(String.format("%-23s %-23s %-23s","Title","Author","Published Year"));
        System.out.println(divider);
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println(divider);
    }

    public void checkOutBook(String userChoice) {
        Book userChoiceBook = new Book(userChoice, null, 0);
        if (!books.contains(userChoiceBook)) {
            System.out.println("That book is not available.");
        } else {
            for (Book book : books) {
                if (book.equals(userChoiceBook)) {
                    books.remove(book);
                    checkedOutBooks.add(book);
                    System.out.println("Thank You! Enjoy the Book");
                }
            }
        }
    }

    public Book returnBook(String bookChoice) {
        Book userChoiceBook = new Book(bookChoice, null, 0);
        if (checkedOutBooks.contains(userChoiceBook)) {
            for (Book book : checkedOutBooks) {
                if (book.equals(userChoiceBook)) {
                    books.add(book);
                    System.out.println("Thank You for Returning Book");
                    return book;
                }
            }
        } else {
            System.out.println("That is not a Valid Book to Return");
        }
        return userChoiceBook;
    }

    public void checkInBook(Book book) {
        if (checkedOutBooks.contains(book) && books.contains(book))
            checkedOutBooks.remove(book);
    }
}
