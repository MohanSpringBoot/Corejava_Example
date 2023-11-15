package com.java8;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupicateCharacterString {
	public static void main(String[] args) {
		
		String str="java";
		
		
		
		Map<Object, Long> st = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	
		Stream<Entry<Object, Long>> dp = st.entrySet().stream().filter(c->c.getValue()>1);
		System.out.println(st);
	System.out.println(dp);
	}

}
