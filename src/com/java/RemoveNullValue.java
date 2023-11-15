package com.java;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class RemoveNullValue {

	public static void main(String[] args) {

		
		
	        Map<String, String> hashMap = new HashMap<>();
	 
	        hashMap.put("RED", "100");
	        hashMap.put("BLACK", null);
	        hashMap.put("BLUE", "200");
	        hashMap.put("GREEN", "5000");
	        hashMap.put("WHITE", null);
	        
	       // while (hashMap.values().remove(null));
	       
	        System.out.println(hashMap);
	        
	        int sum = 0;
	        String sm ="";
	        for (Map.Entry<String, String> entry:hashMap.entrySet()){
	        	if(!entry.getValue().equalsIgnoreCase("null")){
	        		sum+=Integer.parseInt(entry.getValue());
	        	}
	        }
	        
	        
	        System.out.println("Sum of numbers in the list: " + sum); // print the sum

	        }
	     }
	        
	    
	


