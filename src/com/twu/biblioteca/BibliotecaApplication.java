//Launches Biblioteca Application and display Welcome Message and Menu for getting user input
package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApplication {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();
        bibliotecaApplication.start();
    }

    public void start() {
        ConsoleView consoleView = new ConsoleView("Welcome to Biblioteca!!!");
        MenuOptions menuOptions = new MenuOptions();
        do {
            consoleView.MenuView();
            menuOptions.optionHandler(in.nextLine());
        } while (true);
    }
}
