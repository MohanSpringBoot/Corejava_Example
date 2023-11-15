package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
List<String> ls = lines.stream().map(String::toUpperCase).collect(Collectors.toList());
ls.forEach(System.out::println);

	}

}
