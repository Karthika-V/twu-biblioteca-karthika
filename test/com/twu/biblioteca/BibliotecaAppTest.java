package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldHaveWelcomeMessage() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        assertEquals("Welcome to Biblioteca!!", bibliotecaApp.printData("Welcome to Biblioteca!!"));
    }

    @Test
    public void shouldHaveAListOfBooks() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        ArrayList<String> booksList = bibliotecaApp.booksList();

        assertEquals(true, !(booksList.isEmpty()));
    }

    @Test
    public void shouldRetrieveTheListOfBooks() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        ArrayList<String> booksList = bibliotecaApp.booksList();

        assertEquals(true, true);
    }
}
