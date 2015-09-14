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
    public void shouldHaveACheckOutWhenUserChoosesABookAvailableInLibrary() {
        Library library = new Library();
        library.checkOutBook("Harry Potter");

        assertEquals("Thank You! Enjoy the Book\n", outContent.toString());
    }

    @Test
    public void shouldHaveUnsuccessfulCheckOutWhenUserChoosesAnUnavailableBookInLibrary() {
        Library library = new Library();
        library.checkOutBook("Abcd");
        assertEquals("That book is not available.\n", outContent.toString());
    }

    @Test
    public void shouldHaveAReturnBookOptionWhenUserChoosesReturnFromMenuWhichWasCheckedOutBefore() {
        Library library = new Library();
        library.checkOutBook("Harry Potter");
        library.checkInBook(library.returnBook("Harry Potter"));

        assertEquals("Thank You! Enjoy the Book\nThank You for Returning Book\n", outContent.toString());
    }

    @Test
    public void shouldHaveUnsuccessfulReturnWhenUserChoosesABookWhichIsNotCheckedOutFromLibrary() {
        Library library = new Library();
        library.returnBook("Abcd");

        assertEquals("That is not a Valid Book to Return\n", outContent.toString());
    }
}