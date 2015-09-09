package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


public class BibliotecaApplicationTest {

    @Test
    public void shouldShowAWelcomeMessageWhenApplicationLaunches() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();
        bibliotecaApplication.displayWelcomeMessage();

        assertEquals("Welcome to Biblioteca!!!\n", outContent.toString());
    }

    @Test
    public void shouldTakeUserInputForBibiliotecaApplication() {
        BibliotecaApplication mockedBibliotecaApplication = mock(BibliotecaApplication.class);
        mockedBibliotecaApplication.inputOption();

        verify(mockedBibliotecaApplication, times(1)).inputOption();
    }

    @Test
    public void shouldLaunchBibliotecaApplicationMenuWhenStartIsInvoked() {
        BibliotecaApplication mockedBibliotecaApplication = mock(BibliotecaApplication.class);
        mockedBibliotecaApplication.start();

        verify(mockedBibliotecaApplication, times(1)).start();
    }
}
