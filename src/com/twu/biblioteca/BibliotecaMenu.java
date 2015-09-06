//Biblioteca Menu gives a list of options to the user
package com.twu.biblioteca;

public class BibliotecaMenu {

    private String choice;

    public void choiceHandler(String choice) {
        if(choice.contentEquals("1")) {
            BookList bookList = new BookList();
            bookList.displayBooklistDetails();
        }
        else{
            System.out.println("Select a valid option!");
        }
    }

    @Override
    public String toString() {
        return("Hi User!!!\nYou have the following Options:\nChoose One\n1.LIST BOOKS");
    }
}
