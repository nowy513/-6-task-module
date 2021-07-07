package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
//        Given
        MedianAdapter medianAdapter = new MedianAdapter();
            Set<Book> bookA = new HashSet<>();
            bookA.add(new Book("Dan Brown", "Kod Leonarda", 2004, "4251"));
            bookA.add(new Book("J. K. Rowling", "Harry Potter", 2008, "ru489"));
            bookA.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 1987, "oi13231"));
//            When
        int median = medianAdapter.publicationYearMedian(bookA);
//        Then
        assertEquals(2004, median);
    }

}
