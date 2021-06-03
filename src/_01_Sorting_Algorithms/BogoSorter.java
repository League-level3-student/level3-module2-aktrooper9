package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
    	 
    	      Random rand = new Random();
    	      while (!isSorted(arr)) {
    	         for (int i = 0; i < arr.length; i++) {
    	            int r = rand.nextInt(arr.length);
    	            int temp = arr[i];
    	            arr[i] = arr[r];
    	            arr[r] = temp;
    	         }
    	      }
    	   
    }
    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
           if (arr[i] >= arr[i - 1]) {
           } else {
              return false;
           }
        }
        return true;
     }
  }

