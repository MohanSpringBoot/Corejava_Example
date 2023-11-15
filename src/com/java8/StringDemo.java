package com.java8;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {
	public static void main(String[] args) {
		String st= "java";
		List<String> al= new ArrayList<String>();
		al.add(st);
		for(String s:al){
			System.out.println(s);
		}
	}

}
