package com.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestItem {


		 public static<T> void removeNulls(List<T> list)
		    {
		List<Item> items = Arrays.asList(new Item("apple", 10L), 
                new Item("banana", 20L),
				new Item("orange", 10L), 
				new Item("papaya", null),
				new Item(null, 10L), 
				new Item("banana", 10L), 
				new Item("apple", 20L));
		
		     int sum=0;
		    
		
			
		
		
		
		  Iterator<T> itr = (Iterator<T>) items.iterator();
	        while (itr.hasNext())
	        {
	            T curr = itr.next();
	            System.out.println("curr::::::curr:::::::"+curr);
	            if (curr == null) {
	                itr.remove(); // remove nulls
	                
	                System.out.println("curr::::::curr:::::::"+itr);
	            }
	            
	        }
	}
		 

			public static void main(String[] args) {
				
	}

}
