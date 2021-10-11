/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex45;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WordFinder {

    public static void fileCreator (String str, String file) throws FileNotFoundException {

        PrintWriter out = new PrintWriter(file + ".txt");

        out.println(str);
        out.close();
    }

    public static String replaceInString(String str) {

        str = str.replaceAll("tiliz", "s");

        return str;
    }

    public static void main (String[] args) throws IOException {

        System.out.println("What is the name of the new file (do not include .txt at end)? ");
        Scanner input = new Scanner(System.in);
        String file = input.nextLine();

        String content = Files.readString(Path.of("exercise45_input.txt"), StandardCharsets.US_ASCII);

        String revised = replaceInString(content);

        fileCreator(revised, file);

}

}
