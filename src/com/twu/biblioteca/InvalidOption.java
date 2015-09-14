//displays when user choice is invalid
package com.twu.biblioteca;

public class InvalidOption implements MenuItem {

    private final String message = "Select a valid option!";

    public void performOperation() {
        System.out.println(message);
    }
}
