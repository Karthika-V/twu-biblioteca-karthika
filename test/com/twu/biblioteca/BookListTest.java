package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BookListTest {

    @Test
    public void shouldDisplayAListOfBooksWithHeaders() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BookList bookList = new BookList();
        bookList.displayBooklistDetails();
        assertEquals("List of Books:\nTitle\tAuthor\tPublished Year\nHarry Potter\tJ.K.Rowling\t2000\n" +
                "Diary of a Young Girl\tAnne frank\t1942\n", outContent.toString());
    }
}