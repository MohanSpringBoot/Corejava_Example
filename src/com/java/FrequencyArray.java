package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequencyArray {

	public static void main(String[] args) {
		String[] str = {"google","maping"};  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> mp = new HashMap<>();
		/*
		 int size = str.length;
		 
        countFrequency(str, size);
        
	}
	private static void countFrequency(String[] str, int n) {
		 Arrays.sort(str);

	        // Traverse the sorted array
	        for (int i = 0; i < n; i++)
	        {
	            int count = 1;

	            // Move the index ahead whenever
	            // you encounter duplicates
	            while (i < n - 1 && str[i] == str[i + 1]) {
	                i++;
	                count++;
	            }

	            System.out.println(str[i] + ": " + count);


	            count++;	
	}
		*/
		
		
	Map<String, Long> mpar=	Arrays.stream(str).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	System.out.println(mpar);
	}
	}


