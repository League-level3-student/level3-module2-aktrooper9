package _03_More_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
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

   
    public static List<Double> sortScores(List<Double> scores) {
    	double temp = 0;  
    	for (int i=0; i < scores.size()  - 1; i++) {
    		for (int k = 0; k < scores.size() -i- 1; k++) {

    			if ((scores.get(k)>(scores.get(k+1)) ) ){

                    temp = scores.get(k);
                    scores.set(k,scores.get(k+1) );
                    scores.set(k+1, temp);

    			
    			}
    		
    	}
    	
        }   
   // 	Collections.reverse(score);
        return scores;
    }
    public static List<String> sortDNA(List<String> words) {

    	String temp = "";  
    	for (int i=0; i < words.size()  - 1; i++) {
    		for (int k = 0; k < words.size() -i- 1; k++) {

    			if ((words.get(k).length()>(words.get(k+1).length()) ) ){

                    temp = words.get(k);
                    words.set(k,words.get(k+1) );
                    words.set(k+1, temp);

    			
    			}
    		
    	}
    	
        }   
        return words;
   
    	
    }
    public static List<String> sortWords(List<String> words) {
    	String temp = "";  
    	for (int i=0; i < words.size()  - 1; i++) {
    		for (int k = 0; k < words.size() -i- 1; k++) {

    			if (words.get(k).compareTo(words.get(k)+1)>0){

                    temp = words.get(k);
                    words.set(k,words.get(k+1) );
                    words.set(k+1, temp);

    			
    			}
    		
    	}
    	
        }   
        return words;
   
    	
	
	
    }
}
