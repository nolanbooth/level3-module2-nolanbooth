package _04_JavaClassSearchAndSort;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr);
    	
    	
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
    	
    	
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        Arrays.sort(arr);
    	int index = -1;
        index = Arrays.binarySearch(arr, key);
    	System.out.println(index);
        if(index < 0) {
    		return false;
    	}else {
        return true;
    	}
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        Collections.sort(list);
    	int index = 0;
    	index = Collections.binarySearch(list, key);
    	if(index < 0) {
    		return false;
    	
    	}else {
    		return true;
    	}

    }
}
