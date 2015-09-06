package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaMenuTest {

    @Test
    public void shouldListOutMenuForUser() {
        BibliotecaMenu bibliotecaMenu = new BibliotecaMenu();
        bibliotecaMenu.toString();
        assertEquals("Hi User!!!\nYou have the following Options:\nChoose One\n1.LIST BOOKS" , bibliotecaMenu.toString());
    }

    @Test
    public void shouldCallBookListWhenUserChoiceIsOne() {
        BookList mockedbookList = mock(BookList.class);
        mockedbookList.displayBooklistDetails();
        verify(mockedbookList).displayBooklistDetails();
    }

    @Test
    public void shouldShowInvalidOptionsWhenUserEntersSomeInvalidInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaMenu bibliotecaMenu = new BibliotecaMenu();

        bibliotecaMenu.choiceHandler("2");

        assertEquals("Select a valid option!\n",outContent.toString());

    }

}