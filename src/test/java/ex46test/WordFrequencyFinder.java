/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex46test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordFrequencyFinder {

    @Test

    public void testWordFrequencyFinder() {

        WordFrequencyFinder underTest = new WordFrequencyFinder();

        String result = underTest.fileToSingleLineString("test46.txt");

        assertEquals("hello world", result);

        int[] arr = {1, 2, 3, 4, 12, 6};

        int res = underTest.indexOfLargestInArray(arr);

        assertEquals(12, res, .001);

    }

}

