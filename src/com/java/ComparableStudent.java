package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableStudent {

	public static void main(String[] args) {
		
		List <Student> al= new ArrayList<Student>();
		
		al.add(new Student(10,"jerry",3400.0));
		al.add(new Student(19,"mohan",4400.0));
		al.add(new Student(11,"kite",6500.0));
		al.add(new Student(10,"vijay",1500.0));
		al.add(new Student(14,"gunna",1700.0));
		al.add(new Student(13,"riya",5600.0));
		//al.sort(Comparable(Student::getStFee).thenComparing(Student::getsId));
		al.stream().sorted().forEach(System.out::println);
		//System.out.println(al);
		List< Student> ac = al.stream().sorted((o1,o2)->o1.getStName().compareTo(o2.getStName())).collect(Collectors.toList());
		System.out.println("AC"+ac);
	}

}
