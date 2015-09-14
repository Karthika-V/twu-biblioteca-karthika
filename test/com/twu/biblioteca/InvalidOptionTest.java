package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InvalidOptionTest {

    @Test
    public void shouldShowInvalidOptionsWhenUserEntersSomeInvalidInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        MenuOptions menuOptions = new MenuOptions();

        menuOptions.optionHandler("*");

        assertEquals("Select a valid option!\n", outContent.toString());
    }

}