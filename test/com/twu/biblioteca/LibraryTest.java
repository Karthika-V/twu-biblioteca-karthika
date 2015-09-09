package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LibraryTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void shouldDisplayAListOfBooksWithHeaders() {
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        library.displayLibraryBooks();
        assertEquals("List of Books:\nTitle\tAuthor\tPublished Year\nHarry Potter\tJ.K.Rowling\t2000\n" +
                "Diary of a Young Girl\tAnne frank\t1942\n", outContent.toString());
    }

    @Test
    public void shouldHaveACheckOutWhenUserChoosesABookAvailableInLibrary() {
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        library.checkOutBook("Harry Potter");
        assertEquals("Thank You! Enjoy the Book\n", outContent.toString());
    }

    @Test
    public void shouldHaveUnsuccessfulCheckOutWhenUserChoosesAnUnavailableBookInLibrary() {
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        library.checkOutBook("Abcd");
        assertEquals("That book is not available.\n", outContent.toString());
    }
}