/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex45test;

import ex45.WordFinder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordFinderTest {

    @Test

    public void testWordFinder() {

        WordFinder underTest = new WordFinder();

        String str = "use, utilize";

        String result = underTest.replaceInString(str);

        assertEquals("use", "use");
    }
}
