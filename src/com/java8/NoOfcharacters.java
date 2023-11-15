package com.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class NoOfcharacters {

	public static void main(String[] args) {
		  String str = "Hello Manash";
		    Map<Character,Long> hm = str.chars().mapToObj(c-> 
		    (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		    System.out.println(hm);
		    
	}

}
