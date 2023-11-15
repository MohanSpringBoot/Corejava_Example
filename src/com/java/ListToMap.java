package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap {

	public static void main(String[] args) {

		
		 List<Studentmap>
         lt = new ArrayList<Studentmap>();

     // add the member of list
     lt.add(new Studentmap(1, "Geeks"));
     lt.add(new Studentmap(2, "For"));
     lt.add(new Studentmap(3, "Geeks"));

     // create map with the help of
     // Object (stu) method
     // create object of Map class
     Map<Integer, String> map = new HashMap<>();

     // put every value list to Map
     for (Studentmap stu : lt) {
         map.put(stu.getId(), stu.getName());
     }

     // print map0
     System.out.println("Map  : " + map);
	}

}
