//displays the available list of books in library
package com.twu.biblioteca;

public class ListBookOption implements MenuItem {

    private Library library;

    public ListBookOption(Library library){
        this.library=library;
    }

    public void performOperation() {
        library.displayLibraryBooks();
    }
}
