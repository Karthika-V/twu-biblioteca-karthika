//Menu gives a list of options to the user
package com.twu.biblioteca;

import java.util.ArrayList;

public class MenuOptions {

    private ArrayList<String> optionsList;

    public MenuOptions() {
        optionsList = new ArrayList<String>();
        optionsList.add("1:List Books");
        optionsList.add("q:QUIT");
    }

    public void optionHandler(String option) {
        if (option.contentEquals("1")) {
            BookList bookList = new BookList();
            bookList.displayBooklistDetails();
        } else if (option.contentEquals("q")) {
            System.exit(0);
        } else {
            System.out.println("Select a valid option!");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi User!!!\nYou have the following Options:\nChoose One\n");
        for (int i=0; i<optionsList.size();i++) {
            stringBuilder.append(optionsList.get(i)+"\n");
        }
        return stringBuilder.toString();
    }
}
