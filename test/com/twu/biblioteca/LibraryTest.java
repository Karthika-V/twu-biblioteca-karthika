package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldHaveWelcomeMessage() {
        Library lib = new Library();

        assertEquals(lib.welcomeMessage(), "Welcome to Biblioteca!!");
    }
}
