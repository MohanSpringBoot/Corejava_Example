package com.java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_Java8 {

	public static void main(String[] args) {

	int[] ar=	{10,50,67,48,44,32,23};
	
OptionalInt max = Arrays.stream(ar).max();
OptionalInt min = Arrays.stream(ar).min();
System.out.println("The max"+max);
System.out.println("The max"+min);
	}

}
