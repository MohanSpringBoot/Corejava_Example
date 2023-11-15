package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyNumbers {

	public static void main(String[] args) {
		//List<String> list = Arrays.asList("h", "j", "h", "g", "j", "o", "a", "r","t");
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 5, 13, 21,5);
	     // we can also use Function.identity() instead of c->c
	    Map<Integer ,Long > map = list.stream()
	            .collect(Collectors.groupingBy(c ->c , Collectors.counting()) ) ;


	    map.forEach(   (k , v ) -> System.out.println( k + " : "+ v ) );
		
	}

}
