package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IndexingTest {
    BookObject newBook = new BookObject();
    @Test
    @DisplayName("Takes Book Name, Author and Genre and creates an index number based on them")
    void createIndex(){
        newBook.setBookTitle("Alex");
        assertEquals(7, newBook.setIndexNumber());
        newBook.setBookTitle("The Lord Of The Rings");
        assertEquals(48, newBook.setIndexNumber());
        newBook.setBookTitle("Moby Dick");
        assertNotEquals(50, newBook.setIndexNumber());
        newBook.setBookTitle("@@");
        assertEquals(8, newBook.setIndexNumber());
    }

}
