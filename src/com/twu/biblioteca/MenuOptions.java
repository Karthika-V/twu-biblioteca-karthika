//Menu gives a list of options to the user and handles the option
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
            new ListBookOption(library).performOperation();
        } else if (option.contentEquals("q")) {
            new QuitOption().performOperation();
        } else if (option.contentEquals("2")) {
            new CheckOutOption(library).performOperation();
        } else if (option.contentEquals("3")) {
            new CheckInBookOption(library).performOperation();
        } else {
            new InvalidOption().performOperation();
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
