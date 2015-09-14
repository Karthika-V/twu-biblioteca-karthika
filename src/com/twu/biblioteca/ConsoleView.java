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

    public void menuView() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi User!!!\nYou have the following Options:\nChoose One\n");
        MenuOptions menuOptions = new MenuOptions();
        stringBuilder.append(menuOptions.toString());
        System.out.println(stringBuilder);
    }

    public void bookListView(ArrayList<Book> books) {
        String divider = "------------------------------------------------------------";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(divider);
        stringBuilder.append(String.format("%-23s %-23s %-23s", "Title", "Author", "Published Year"));
        stringBuilder.append(divider);
        for (Book book : books) {
            stringBuilder.append(book.toString());
        }
        stringBuilder.append(divider);
        System.out.println(stringBuilder);
    }

}
