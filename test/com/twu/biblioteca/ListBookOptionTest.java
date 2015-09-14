package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListBookOptionTest {

    @Test
    public void shouldCallBookListWhenUserChoiceIsOne() {
        Library mockedbookList = mock(Library.class);
        mockedbookList.displayLibraryBooks();
        verify(mockedbookList).displayLibraryBooks();
    }

}