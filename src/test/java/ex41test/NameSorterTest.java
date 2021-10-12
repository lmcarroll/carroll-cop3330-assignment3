/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex41test;

import ex41.NameSorter;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NameSorterTest {

    @Test

    public void testNameSorter() {

        NameSorter underTest = new NameSorter();

        String[] result = underTest.fileReader("test41.txt");

        assertEquals("[1, null, null, null, null, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(result));

        int resultI = underTest.fileArrayLength("test41.txt");

        assertEquals(0, resultI);

        String[] str = {"c", "b", "a"};

        String[] resultA = underTest.alphArr(str, 2);

        String[] as = {"a", "b", "c"};

        assertEquals(as, resultA);
    }
}
