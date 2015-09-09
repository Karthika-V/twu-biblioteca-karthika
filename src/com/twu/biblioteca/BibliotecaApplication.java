//Launches Biblioteca Application and display Welcome Message and Menu for getting user input
package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApplication {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();
        bibliotecaApplication.start();
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Biblioteca!!!");
    }

    public void start() {
        displayWelcomeMessage();
        MenuOptions menuOptions = new MenuOptions();
        do {
            System.out.println(menuOptions.toString());
            menuOptions.optionHandler(in.nextLine());
        } while (true);
    }
}
