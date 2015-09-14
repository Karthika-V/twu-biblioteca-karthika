package com.twu.biblioteca;

import java.util.Scanner;

public class CheckInBookOption implements MenuItem {

    private Library library;
    private Scanner in = new Scanner(System.in);

    public CheckInBookOption(Library library) {
        this.library = library;
    }

    public void performOperation() {
        System.out.println("Enter the Book name:");
        String bookChoice = in.nextLine();
        library.checkInBook(library.returnBook(bookChoice));
    }
}