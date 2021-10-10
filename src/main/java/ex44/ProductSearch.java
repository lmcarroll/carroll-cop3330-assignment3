/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex44;

import java.util.Scanner;

public class ProductSearch {

    public static boolean searcher (String search) {

        int ii = 0;

        Scanner fileReader = new Scanner("exercise44_input.json");

        while (ii < 7) {
            fileReader = new Scanner("exercise44_input.json");
            String temp = fileReader.nextLine();

            if (temp.contains(search)) {

                temp = fileReader.nextLine();

                System.out.println("Name: " + search);

                int i = 0;
                while (!Character.isDigit(temp.charAt(i))) {

                    i++;
                }

                if (temp.charAt(i) == '2') {
                    System.out.println("Price: 25.00\nQuantity: 5");
                }
                if (temp.charAt(i) == '1') {
                    System.out.println("Price: 15.00\nQuantity: 5");
                }
                if (temp.charAt(i) == '5') {
                    System.out.println("Price: 5.00\nQuantity: 10");
                }

                return true;
            } else {
                ii++;
            }
        }
        System.out.println("Sorry, that product was not found in our inventory.");
        return false;
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("What is the product name? ");

            Scanner input = new Scanner(System.in);

            String search = input.nextLine();

            if (searcher(search)) {
                break;
            }
        }
    }
}
