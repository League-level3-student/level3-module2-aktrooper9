package _00_Intro_to_Sorting_Algorithms;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */
	public static boolean intArraySorted(int[] arr) {
		

			for (int k = 0; k < arr.length - 1; k++) {

				if (arr[k] > arr[k + 1]) {

					return false;
				}
			
		}
		return true;

	}

	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */
	static boolean doubleArraySorted(double[] sorted) {
		

		
			for (int k = 0; k < sorted.length - 1; k++) {

				
				if (sorted[k] > sorted[k + 1]) {
					return false;
				} 
					
				
			
		}
			return true;
		

	}
	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */
	static boolean charArraySorted(char[] sorted) {

		for (int k = 0; k < sorted.length - 1; k++) {

			
			if (sorted[k] > sorted[k + 1]) {
				return false;
			} 
				
			
		
	}
		return true;
	
		
		
	}
	/*
	 * 4. Write a static method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */
	static boolean StringArraySorted(String[] sorted) {

		for (int k = 0; k < sorted.length - 1; k++) {
		
		int i = sorted[k].compareTo(sorted[k+1]);
			if (i>0) {
				return false;
			} 
		
	
		}
		return true;
		
		
	
	}
}
