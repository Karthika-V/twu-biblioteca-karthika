package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooksTest {

    @Test
    public void shouldHaveTitle() {
        Books book = new Books("AnneFrank");

        assertEquals("AnneFrank",book.bookDetails());
    }
}
