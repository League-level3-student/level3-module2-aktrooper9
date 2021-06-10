package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for(int i =0; i<eggs.size();i++) {
    		if (eggs.get(i).equalsIgnoreCase("Cracked")) {
    			return i;
    		}
    	}    	
        return 0;
    } public static int countPearls(List<Boolean> pearls) {
    	int amount=0;
    	for(int i =0; i<pearls.size();i++) {
    		if (pearls.get(i).equals(true)) {
    			amount +=1;
    		}
    	}    	
        return amount;
    }
    public static double findTallest(List<Double> height) {
    	double tallest=0.0;
    	for(int i =0; i<height.size();i++) {
    		if (height.get(i)>tallest) {
    			tallest=height.get(i);
    		}
    	}    	
        return tallest;
    }
    public static String findLongestWord(List<String> words) {
    	String longest="";
    	for(int i =0; i<words.size();i++) {
    		if (words.get(i).length()>longest.length()) {
    			longest=words.get(i);
    		}
    	}    	
        return longest;
    }
    public static Boolean containsSOS(List<String> words) {
    	 
    	for(int i =0; i<words.size();i++) {
    		if (words.contains("... --- ...")) {
    			return true;
    		}
    	}    	
        return false;
    }
    public static double sortScores(List<Double> scores) {
   	 double highest = 0;
    	for(int i =0; i<scores.size();i++) {
    		for (int k = 0; k < scores.length - 1; k++) {

    			if (scores[k] > scores[k + 1]) {

    			
    			}
    		
    	}
    	
        }    	
        return highest;
    }
}
