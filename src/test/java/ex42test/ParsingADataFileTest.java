/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex42test;

import ex42.ParsingADataFile;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ParsingADataFileTest {

    @Test

    public void testParsingADataFile() {

        ParsingADataFile underTest = new ParsingADataFile();

        String[] result = underTest.makeArray("test42.txt");

        String[] strarr = {"testing"};

        assertEquals("[testing, null, null, null, null, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(result));


    }
}
