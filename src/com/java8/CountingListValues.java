package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingListValues {

	public static void main(String[] args) {
		//public void checkDuplicateOccurance() {
	        List<String> duplicateList = new ArrayList<String>();
	        duplicateList.add("Cat");
	        duplicateList.add("Dog");
	        duplicateList.add("Cat");
	        duplicateList.add("cow");
	        duplicateList.add("Cow");
	        duplicateList.add("Goat"); 
	        //both are similar list and string 
	        // list of elements then using stream()
	        Map<String, Long> couterMap = duplicateList.stream().
	        		collect(Collectors.groupingBy(e -> e,Collectors.counting()));
	        System.out.println(couterMap);
	        // the  elements from string then using mapToObj()
	        
	      /*  Map<Character,Long> hm = str.chars().mapToObj(c-> 
		    (char)c).collect(Collecto
		    rs.groupingBy(c->c,Collectors.counting()));*/
	}
	

}
