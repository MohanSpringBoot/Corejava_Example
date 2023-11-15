package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,6,7));
		list1.retainAll(list2);
		System.out.println(list1);
	}

}
