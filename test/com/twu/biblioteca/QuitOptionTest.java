package com.twu.biblioteca;

import org.junit.Rule;
import org.junit.Test;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class QuitOptionTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldQuitFromApplicationtWhenUserChoiceIsQuit() {
        MenuOptions mockedmenuOptions = mock(MenuOptions.class);

        mockedmenuOptions.optionHandler("q");

        verify(mockedmenuOptions).optionHandler("q");
        exit.expectSystemExitWithStatus(0);
        System.exit(0);
    }

}