/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParsingADataFile {

    //reads file and writes it into a String array.
    public static String[] makeArray(String file) {

    File inputFile = new File(file);
    Scanner fileReader = null;
    //try to read file. catch FileNotFoundException
        try {
        fileReader = new Scanner(inputFile);
    } catch (
    FileNotFoundException e) {
        System.out.println("ERROR: FILE NOT FOUND");
        e.printStackTrace();
    }

    //creates file reader and initializes String array.
    String[] parsed = new String[15];
    String temp = fileReader.nextLine();

    int n = 0;
    //while Scanner hasNextLine, set n array index to Scanner line
        while (fileReader.hasNextLine()) {

        parsed[n] = temp;

        n++;

        temp = fileReader.nextLine();
    }

    parsed[n] = temp;

        return parsed;

    }

    //prints the array into table format
    public static void printParsed(String[] parsed) {

        System.out.println("Last      First     Salary\n--------------------------");

        String[] arrOfStr = new String[10];

        //print array in proper format. removes commas and splits strings.
        for (int i = 0; i < 7; i++) {

            arrOfStr = parsed[i].split(",", 5);
            System.out.printf("%-10s%-10s%s\n", arrOfStr[0], arrOfStr[1], arrOfStr[2]);
        }
    }

    //calls methods
    public static void main(String[] args) {

        String[] parsed = makeArray("exercise42_input.txt");

        printParsed(parsed);
    }
}
