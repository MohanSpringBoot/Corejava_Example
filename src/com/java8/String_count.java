package com.java8;

import java.util.Map;
import java.util.stream.Collectors;

import jdk.nashorn.internal.objects.annotations.Function;

public class String_count {

	public static void main(String[] args) {
		String word = "AAABBB";
		Map<String, Long> charCount = word.chars().mapToObj(c->(char)c)
		        .collect(Collectors.groupingBy(c->c.toString(), Collectors.counting()));
		
		System.out.println(charCount);
	}

}
