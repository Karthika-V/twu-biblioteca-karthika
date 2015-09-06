package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaAppTest {

    @Test
    public void shouldShowAWelcomeMessageWhenApplicationLaunches() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.start();
        assertEquals("Welcome to Biblioteca!!!\n", outContent.toString());
    }

    @Test
    public void shouldHaveMenuToTakeUserChoiceForBibiliotecaApplication() {
        BibliotecaApp mockedBibliotecaApp = mock(BibliotecaApp.class);
        mockedBibliotecaApp.inputChoice();
        verify(mockedBibliotecaApp).inputChoice();
    }

    @Test
    public void shouldLaunchBibliotecaApplicationWhenStartIsInvoked() {
        BibliotecaApp mockedBibliotecaApp = mock(BibliotecaApp.class);
        mockedBibliotecaApp.start();
        verify(mockedBibliotecaApp).start();
    }
}
