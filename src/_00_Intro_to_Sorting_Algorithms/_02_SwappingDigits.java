package _00_Intro_to_Sorting_Algorithms;

class _02_SwappingDigits {

    // 1. Complete the method so that the first two elements of the array are
    //    swapped.
    public static void swapArrayOfTwo(int[] arr) {
    	int bucket = 0;
    	bucket = arr[0];
    	arr[0] = arr[1];
    	arr[1] = bucket;
    	
    	
    }

    // 2. Complete the method so that it sorts the array using a bubble sort.
    //    Iterate through the array and when you find two elements that are out
    //    of order, swap them. Repeat this until the array is in order.
    public static void sortIntArray(int[] arr) {
    	for(int i = 0; i < arr.length; i ++) {
    		for(int k=0; k < arr.length-1; k++) {
    			if(arr[k] > arr[k+1]) {
    				int bucket = 0;
    				bucket = arr[k];
    				arr[k] = arr[k+1];
    				arr[k+1] = bucket;
    			}
    		}
    	}
    	
    	
    }

    // 3. Complete the method so that it finds the middle number in the array.
    //    *Hint* it helps to sort it first.
    //    *Double Hint* Use the method you already wrote in step 2 to sort it
    public static int findMiddle(int[] arr) {
    	for(int i = 0; i < arr.length; i ++) {
    		for(int k=0; k < arr.length-1; k++) {
    			if(arr[k] > arr[k+1]) {
    				int bucket = 0;
    				bucket = arr[k];
    				arr[k] = arr[k+1];
    				arr[k+1] = bucket;
    			}
    		}
    	}
    	int middle = arr.length/2;
    	
    	return arr[middle];
    }
}
