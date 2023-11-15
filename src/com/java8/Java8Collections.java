package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Java8Collections {
	
	 public static void main(String[] args)
	    {
	        // Data Source
	 
	        // Creating an arrayList object
	        // Declaring object of String type
	        ArrayList<String> al = new ArrayList<>();
	 
	        // Custom input elements to above object
	        al.add("Dean");
	        al.add("castee");
	        al.add("robert");
	        al.add("robert");
	        // Creating object of Stream where Stream is created
	        // using arrayList and object as data source
	      // al.stream().distinct().forEach(System.out::println);
	        al.stream().forEach(System.out::println);
	        
	       /* al.stream()
            .sorted()
            .forEach(System.out::println);*/
	        // Print and display element
	        //System.out.print(streamOfNames);
	    }

}
