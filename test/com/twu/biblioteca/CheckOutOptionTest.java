package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckOutOptionTest {

    @Test
    public void shouldHaveAnOptionToCheckOutABook() {
        MenuOptions mockedmenuOptions = mock(MenuOptions.class);

        mockedmenuOptions.optionHandler("2");

        verify(mockedmenuOptions).optionHandler("2");
    }

}