package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldHaveAListOfBooks() {
        Book book = new Book();
        ArrayList<String> bookList = book.bookList();

        assertEquals(true, !(bookList.isEmpty()));
    }

}