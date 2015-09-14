//Displays in console all the messages passed to it
package com.twu.biblioteca;

import java.util.ArrayList;

public class ConsoleView {

    private String message;

    public ConsoleView(String message) {
        this.message = message;
        String fs = String.format(message);
        System.out.println(fs);
    }

    public void MenuView() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi User!!!\nYou have the following Options:\nChoose One\n");
        MenuOptions menuOptions = new MenuOptions();
        stringBuilder.append(menuOptions.toString());
        System.out.println(stringBuilder);
    }

    public void BookView(ArrayList<Book> books) {
        System.out.println("List of Books:");
        String divider = "------------------------------------------------------------";
        System.out.println(divider);
        System.out.println(String.format("%-23s %-23s %-23s", "Title", "Author", "Published Year"));
        System.out.println(divider);
        for (Book book : books) {
            System.out.println(book.toString());
        }
        System.out.println(divider);
    }

}
