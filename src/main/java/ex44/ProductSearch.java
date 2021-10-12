/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex44;

import org.json.JSONObject;

import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;


public class ProductSearch {

    //reads the JSON file and places it in an object
    public static void readJSON() throws Exception {

        File file = new File("./exercise44_input.json");
        String content = FileUtils.readFileToString(file, "utf-8");

        JSONObject object = new JSONObject(content);
    }

    //determines the quantity based on the search
    public static int searcherQuantity(int search) {

        //returns the quantity if search value matches
        if (search == 1 || search == 2) {
            return 5;
        }

        //returns the quantity if search value matches
        if (search == 3) {
            return 10;
        }

        return 0;
    }

    //determines the price based on the search
    public static float searcherPrice(int search) {

        //returns the price if search value matches
        if (search == 1) {
            return 25;
        }

        //returns the price if search value matches
        if (search == 2) {
            return 15;
        }

        //returns the price if search value matches
        if (search == 3) {
            return 5;
        }
        return 0;
    }

    //checks if the inputted string is a product
    public static int checkIfProduct(String search) {

        //if the search matches product, return value
        if (search.equals("Widget")) {
            return 1;
        }

        //if the search matches product, return value
        if (search.equals("Thing")) {
            return 2;
        }

        //if the search matches product, return value
        if (search.equals("Doodad")) {
            return 3;
        }

        return 0;
    }

    //asks for user input, calls methods, and prints output
    public static void main(String[] args) throws Exception {

        int searchInt = 0;

        readJSON();

        //loop until broken
        while (true) {

            System.out.println("What is the product name? ");
            Scanner input = new Scanner(System.in);
            String search = input.nextLine();

            searchInt = checkIfProduct(search);

            //if the search int has changed, call methods
            if (searchInt != 0) {

                System.out.println("Name: " + search);

                System.out.printf("Price: %.2f\n", searcherPrice(searchInt));

                System.out.println("Quantity: " + searcherQuantity(searchInt));

                break;
            }

            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }
}
