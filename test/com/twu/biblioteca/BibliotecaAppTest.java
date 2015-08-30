package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldHaveWelcomeMessage() {
        BibliotecaApp bib = new BibliotecaApp();

        assertEquals("Welcome to Biblioteca!!", bib.welcomeMessage());
    }
}
