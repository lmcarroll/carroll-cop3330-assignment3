/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex46;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class WordFrequencyFinder {

    //turns file text into string. removes all newline characters
    public static String fileToSingleLineString (String file) throws IOException {

        String content = Files.readString(Path.of(file), StandardCharsets.US_ASCII);

        content = content.replaceAll(System.lineSeparator(), " ");

        return content;
    }

    //splits the string into an array. sorts the words alphabetically
    public static String[] sortAndSeparate (String str) {

        String[] strArr = str.split(" ", 20);

        Arrays.sort(strArr);

        return strArr;
    }

    //prints out a histogram chart of the words
    public static void histoPrint (String[] arr) {

        String[] words = new String[100];
        int[] count = new int[100];
        int wordCount = 0;
        int prevI = 0;
        int i;

        //for i = 0 is less than the total array length, add i
        for (i = 0; i < arr.length - 1; i++) {

            //if the array word is not the same as the next array word
            if (!arr[i].equals(arr[i + 1])) {

                words[wordCount] = arr[i];

                count[wordCount] = i - prevI;

                prevI = i;

                wordCount++;

            }
        }

        //if the last word is the same as the second to last word
        if (arr[i].equals(arr[i - 1])) {

            count[wordCount]++;

        } else {

            words[wordCount] = arr[i];

            count[wordCount] = 1;
        }

        //while word count is greater than or equal to zero, subtract word count
        for (; wordCount >= 0; wordCount--) {

            int largest = indexOfLargestInArray(count);

            System.out.printf("%-10s%s ", words[largest], ":");

            //while the largest count of a word is greater than zero, subtract from the count
            for (; count[largest] > 0; count[largest]--) {

                System.out.printf("%s", "*");
            }

            System.out.print("\n");

            count[largest] = 0;
        }
    }

    //finds the index of the largest integer in an array
    public static int indexOfLargestInArray(int[] arr) {

        int largest = 0;

        //for i less than the array length, add i
        for ( int i = 1; i < arr.length; i++ )
        {
            //if int at index is larger than previous largest, make index int new largest
            if ( arr[i] > arr[largest] ) {
                largest = i;
            }
        }
        return largest;
    }

    //calls methods
    public static void main (String[] args) throws IOException {

        String str = fileToSingleLineString("exercise46_input.txt");

        String[] strArr = sortAndSeparate(str);

        histoPrint(strArr);

    }
}
