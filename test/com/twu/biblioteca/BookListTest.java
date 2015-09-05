package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookListTest {

    @Test
    public void shouldHaveAListOfBooks() {
        BookList bookList = new BookList();
        assertEquals(true, !(bookList.toString().isEmpty()));
    }

}