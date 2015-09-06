package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaMenuTest {

    @Test
    public void shouldListOutMenuForUser() {
        BibliotecaMenu bibliotecaMenu = new BibliotecaMenu();
        bibliotecaMenu.toString();
        assertEquals("Hi User!!!\nYou have the following Options:\nChoose One\n1.LIST BOOKS" , bibliotecaMenu.toString());
    }

}