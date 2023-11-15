package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSample {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		//List<String> list = Arrays.asList("mango", "apple", "orange", "grapes");
        List<Integer> listOfIntegers = listOfStrings.stream()
                        .map(Integer::valueOf)
                        .collect(Collectors.toList());
       // Stream<String> flist = list.stream().map(l->l.toUpperCase().);
      //  System.out.println(flist.toString());
        System.out.println(listOfIntegers);
	}

}
