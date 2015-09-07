//Launches Biblioteca Application and display Welcome Message and Menu for options
package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.start();
    }

    public String inputOption() {
        Scanner in = new Scanner(System.in);
        return (in.next());
    }

    public void display(String message) {
        System.out.println(message);
    }

    public void start() {
        display("Welcome to Biblioteca!!!");
        MenuOptions menuOptions = new MenuOptions();
        display(menuOptions.toString());
        do {
            menuOptions.optionHandler(inputOption());
        } while (!(inputOption().contentEquals("q")));
    }
}
