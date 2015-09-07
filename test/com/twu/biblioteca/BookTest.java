package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldHaveBookDetails() {
        Book book = new Book("Abc", "Def", 1900);
        assertEquals(true, !(book.toString().isEmpty()));
    }

    @Test
    public void shouldFormatDisplayDetails() {
        Book book = new Book("Abc", "Def", 1900);
        book.toString();
        assertEquals("Abc\tDef\t1900", book.toString());
    }
}