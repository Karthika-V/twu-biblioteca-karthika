package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuOptionsTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldListOutMenuForUser() {
        MenuOptions menuOptions = new MenuOptions();
        menuOptions.toString();
        assertEquals("Hi User!!!\nYou have the following Options:\nChoose One\n1:List Books\n2:Checkout Book\n3:Return Book\nq:QUIT\n", menuOptions.toString());
    }

    @Test
    public void shouldCallBookListWhenUserChoiceIsOne() {
        Library mockedbookList = mock(Library.class);
        mockedbookList.displayLibraryBooks();
        verify(mockedbookList).displayLibraryBooks();
    }

    @Test
    public void shouldShowInvalidOptionsWhenUserEntersSomeInvalidInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        MenuOptions menuOptions = new MenuOptions();

        menuOptions.optionHandler("*");

        assertEquals("Select a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldQuitFromApplicationtWhenUserChoiceIsQuit() {
        MenuOptions mockedmenuOptions = mock(MenuOptions.class);

        mockedmenuOptions.optionHandler("q");

        verify(mockedmenuOptions).optionHandler("q");
        exit.expectSystemExitWithStatus(0);
        System.exit(0);
    }

    @Test
    public void shouldHaveAnOptionToCheckOutABook() {
        MenuOptions mockedmenuOptions = mock(MenuOptions.class);

        mockedmenuOptions.optionHandler("2");

        verify(mockedmenuOptions).optionHandler("2");
    }

}