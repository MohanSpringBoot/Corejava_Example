package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompartorASCandDESC2 {

	public static void main(String[] args) {


        List < String > fruits = new ArrayList < String > ();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
     // Ascending order
        List < String > sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        // Ascending order
        List < String > sortedList1 = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList1);
        // descending order
        List < String > sortedList3 = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList3);
     // descending order
        List < String > sortedList4 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList4);


        List < String > sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);
        
        
	}

}
