package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

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

    @Test
    public void shouldHaveAReturnBookOptionWhenUserChoosesReturnFromMenuWhichWasCheckedOutBefore() {
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        library.checkOutBook("Harry Potter");
        library.checkInBook(library.returnBook("Harry Potter"));
        assertEquals("Thank You! Enjoy the Book\nThank You for Returning Book\n", outContent.toString());
    }

    @Test
    public void shouldHaveUnsuccessfulReturnWhenUserChoosesABookWhichIsNotCheckedOutFromLibrary() {
        System.setOut(new PrintStream(outContent));
        Library library = new Library();
        library.returnBook("Abcd");
        assertEquals("That is not a Valid Book to Return\n", outContent.toString());
    }
}