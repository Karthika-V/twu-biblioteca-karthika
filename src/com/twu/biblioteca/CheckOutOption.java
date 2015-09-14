//checks out a book from library books
package com.twu.biblioteca;

import java.util.Scanner;

public class CheckOutOption implements MenuItem {

    private Library library;
    private Scanner in = new Scanner(System.in);

    public CheckOutOption(Library library) {
        this.library = library;
    }

    public void performOperation() {
        System.out.println("Enter the Book name:");
        String bookChoice = in.nextLine();
        library.checkOutBook(bookChoice);;
    }
}
