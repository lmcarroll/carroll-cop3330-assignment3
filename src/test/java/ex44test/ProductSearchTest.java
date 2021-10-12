/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex44test;

import ex44.ProductSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductSearchTest {

    @Test

    public void testProductSearch() {

        int result = ProductSearch.searcherQuantity(1);

        assertEquals(5, result, .001);

        float resultF = ProductSearch.searcherPrice(1);

        assertEquals(25.00, resultF, .001);

        result = ProductSearch.checkIfProduct("Widget");

        assertEquals(1, result, .001);
    }
}
