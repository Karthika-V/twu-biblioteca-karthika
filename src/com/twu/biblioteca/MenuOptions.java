//Menu gives a list of options to the user
package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuOptions {

    private ArrayList<String> optionsList;
    private Library library = new Library();
    private Scanner in = new Scanner(System.in);

    public MenuOptions() {
        optionsList = new ArrayList<String>();
        optionsList.add("1:List Books");
        optionsList.add("2:Checkout Book");
        optionsList.add("3:Return Book");
        optionsList.add("q:QUIT");
    }

    public void optionHandler(String option) {
        if (option.contentEquals("1")) {
            library.displayLibraryBooks();
        } else if (option.contentEquals("q")) {
            System.exit(0);
        } else if (option.contentEquals("2")) {
            System.out.println("Enter the Book name:");
            String bookChoice = in.nextLine();
            library.checkOutBook(bookChoice);
        } else if (option.contentEquals("3")) {
            System.out.println("Enter the Book name:");
            String bookChoice = in.nextLine();
            library.checkInBook(library.returnBook(bookChoice));
        } else {
            System.out.println("Select a valid option!");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi User!!!\nYou have the following Options:\nChoose One\n");
        for (int i = 0; i < optionsList.size(); i++) {
            stringBuilder.append(optionsList.get(i) + "\n");
        }
        return stringBuilder.toString();
    }
}
