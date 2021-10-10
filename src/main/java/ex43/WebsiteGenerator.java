/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebsiteGenerator {

    //generates the html, java, and css files
    public static void generator (String site, String author, boolean java, boolean CSS) throws IOException {

        //generates html file and assigns its title and meta.
        File f1 = new File("index.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
        bw.write("<title> " + site + " </title>\n");
        bw.write("<meta> " + author + " </title>");

        bw.close();

        //if boolean java is true, generate java file.
        if (java) {
            File f2 = new File("index.java");
            bw = new BufferedWriter(new FileWriter(f2));
        }

        //if boolean CSS is true, generate CSS file.
        if (CSS) {
            File f3 = new File("index.css");
            bw = new BufferedWriter(new FileWriter(f3));
        }

    }

    //asks for input and calls method.
    public static void main(String[] args) throws IOException {

        //prompts for 'site name' from user.
        System.out.println("Site name: ");
        Scanner input = new Scanner (System.in);
        String site = input.nextLine();

        //prompts for 'author' from user.
        System.out.println("Author: ");
        input = new Scanner (System.in);
        String author = input.nextLine();

        //if user inputs 'yes', java boolean is made positive.
        boolean java = false;
        System.out.println("Do you want a folder for JavaScript? ");
        input = new Scanner (System.in);
        String javaStr = input.nextLine();
        if (javaStr.equals("y") || javaStr.equals("Y") || javaStr.equals("yes") || javaStr.equals("Yes")) {
            java = true;
        } else {
            java = false;
        }
        //if user inputs 'no', CSS boolean is made positive.
        boolean CSS = false;
        System.out.println("Do you want a folder for CSS? ");
        input = new Scanner (System.in);
        String CSSStr = input.nextLine();
        if (CSSStr.equals("y") || CSSStr.equals("Y") || CSSStr.equals("yes") || CSSStr.equals("Yes")) {
            CSS = true;
        } else {
            CSS = false;
        }

        generator (site, author, java, CSS);
    }
}
