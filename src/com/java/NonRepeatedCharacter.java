package com.java;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {

	 public static char kthNonRepeatingChar(String str, int k) {
	        // Create an empty hash map to store the counts of each
	        // character in the string
	        Map<Character, Integer> map = new HashMap<>();
	 
	        // Loop through the string and store the counts of each
	        // character in the hash map
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	        if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
	        }
	        // Loop through the string and find the kth
	        // non-repeating character
	        int nonRepeatingCount = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (map.get(c) == 1) {
	                nonRepeatingCount++;
	                if (nonRepeatingCount == k) {
	                    // When the count of non-repeating
	                    // characters equals k, return the character
	                    return c;
	                }
	            }
	        }
	 
	        // If there is no kth non-repeating character in the
	        // string, return the null character
	        return '0';
	    }
	 
	    public static void main(String[] args) {
	        String str = "mohankumar";
	        int k = 2;
	 
	        char result = kthNonRepeatingChar(str, k);
	 
	        if (result == '0') {
	            System.out.println("There is no kth non-repeating character " +
	                "in the string.");
	        } else {
	            System.out.println("The " + k + "th non-repeating character " +
	                "in the string is :::" + result + ".");
	        }
	    }
	}

