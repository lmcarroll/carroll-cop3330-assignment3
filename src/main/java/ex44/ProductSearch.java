/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex44;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;


public class ProductSearch {

    public static void readJSON() throws Exception {

        File file = new File("./exercise44_input.json");
        String content = FileUtils.readFileToString(file, "utf-8");

        JSONObject object = new JSONObject(content);
    }

    public static int searcherQuantity(int search) {

        if (search == 1 || search == 2) {
            return 5;
        }

        if (search == 3) {
            return 10;
        }

        return 0;
    }

    public static float searcherPrice(int search) {

        if (search == 1) {
            return 25;
        }

        if (search == 2) {
            return 15;
        }

        if (search == 3) {
            return 5;
        }
        return 0;
    }

    public static int checkIfProduct(String search) {

        if (search.equals("Widget")) {
            return 1;
        }
        if (search.equals("Thing")) {
            return 2;
        }
        if (search.equals("Doodad")) {
            return 3;
        }

        return 0;
    }

    public static void main(String[] args) throws Exception {

        int searchInt = 0;

        readJSON();

        while (true) {

            System.out.println("What is the product name? ");
            Scanner input = new Scanner(System.in);
            String search = input.nextLine();

            searchInt = checkIfProduct(search);

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
