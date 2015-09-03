package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldHaveWelcomeMessage() {
        BibliotecaApp bib = new BibliotecaApp();

        assertEquals("Welcome to Biblioteca!!", bib.welcomeMessage());
    }

    @Test
    public void shouldHaveAListOfBooks() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        ArrayList<String> booksList = bibliotecaApp.booksList();

        assertEquals(true, !(booksList.isEmpty()));
    }
}
