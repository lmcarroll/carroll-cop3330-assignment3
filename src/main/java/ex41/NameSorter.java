/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex41;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {

    //transcribes file name list into String array. returns String array.
    public static String[] fileReader(String file) {

        File inputFile = new File(file);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: FILE NOT FOUND");
            e.printStackTrace();
        }

        //creates file reader and initializes String array.
        String[] names = new String[15];
        String temp = fileReader.nextLine();

        int n = 0;
        //while Scanner hasNextLine, set n array index to Scanner line
        while (fileReader.hasNextLine()) {

            names[n] = temp;

            n++;

            temp = fileReader.nextLine();
        }

        names[n] = temp;

        return names;
    }

    //transcribes file name list into String array. returns String array length.
    public static int fileArrayLength(String file) {

        File inputFile = new File(file);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: FILE NOT FOUND");
            e.printStackTrace();
        }

        //initializes String array and Scanner.
        String[] names = new String[15];
        assert fileReader != null;
        String temp = fileReader.nextLine();

        int n = 0;

        //while Scanner hasNextLine, set n array index to Scanner line
        while (fileReader.hasNextLine()) {

            names[n] = temp;

            n++;

            temp = fileReader.nextLine();
        }

        names[n] = temp;

        return n;
    }

    //alphabetizes String array
    public static String[] alphArr(String[] names, int n) {

        String[] newNames = new String[n + 1];

        //for i is less than or equal to n, set the newNames index String to the names index String.
        for (int i = 0; i <= n; i++) {
            newNames[i] = names[i];
        }
        Arrays.sort(newNames);
        return newNames;
    }

    //writes String array into file, along with the array's length.
    public static void writeArrayFile(String[] newNames, int n, String file) throws IOException {

        //initialize writer.
        Writer writer = new FileWriter(file);

        writer.write("Total of " + n + " names\n-----------------\n");

        //for i is less than or equal to n, write an index of the String array to the input file.
        for (int i = 0; i <= n; i++) {
            writer.write(newNames[i] + "\n");
        }
        writer.close();
    }

    //calls methods
    public static void main(String[] args) throws IOException {


        String[] names = fileReader("exercise41_input.txt");

        int n = fileArrayLength("exercise41_input.txt");
        
        String[] newNames = alphArr(names, n);

        writeArrayFile(newNames, n, "exercise41_output.txt");

    }
}
