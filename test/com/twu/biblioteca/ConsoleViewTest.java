package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ConsoleViewTest {

    @Test
    public void shouldPrintAllTheMessagesPassedToItInConsole() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new ConsoleView("ABCD");

        assertEquals("ABCD\n", outContent.toString());
    }

}