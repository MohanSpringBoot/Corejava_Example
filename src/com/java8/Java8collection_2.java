package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Java8collection_2 {
	
	public static void main(String[] args)
    {
        // Data Source
 
        // Creating an arrayList object
        // Declaring object of String type
        TreeSet<Integer> al = new TreeSet<>();
        
       /* al.add("10");
        al.add("1");
        al.add("5");
        al.add("44");
        al.add("55");
        al.add("31");
        al.add("28");*/
        al.add(10);
        al.add(1);
        al.add(5);
        al.add(44);
        al.add(55);
        al.add(40);
        al.add(32);
       // al.add("4");
Optional<Integer> max = al.stream().sorted().max(Integer::compare);
System.out.println(max);

Stream<Integer> sort =al.stream().sorted();
System.out.println(sort);
    }
       

}
