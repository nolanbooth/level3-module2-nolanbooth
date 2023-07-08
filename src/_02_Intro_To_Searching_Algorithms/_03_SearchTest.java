package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
       String[] array = {"A", "B", "C", "D", "E", "F", "G"};
       
    	
    	assertEquals(0, _01_LinearSearch.linearSearch(array, "A"));
    	assertEquals(6, _01_LinearSearch.linearSearch(array, "G"));
    	assertEquals(-1,  _01_LinearSearch.linearSearch(array, "L"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    	assertEquals(-1, _02_BinarySearch.binarySearch(array, 0, 9, 11));
    	assertEquals(0,  _02_BinarySearch.binarySearch(array, 0, 9, 1));
    	assertEquals(9,  _02_BinarySearch.binarySearch(array, 0, 9, 10));
    }
}
