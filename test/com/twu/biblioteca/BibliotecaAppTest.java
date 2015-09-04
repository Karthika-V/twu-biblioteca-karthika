package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class BibliotecaAppTest {

    @Test
    public void shouldShowAWelcomeMessageWhenApplicationLaunches() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.start();
        assertEquals("Welcome to Biblioteca!!!\n", outContent.toString());
    }
}
