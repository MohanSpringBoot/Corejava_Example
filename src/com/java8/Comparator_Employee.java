package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.Employee;

public class Comparator_Employee   {
	public static void main(String[] args) {
		
	

	Employee e1 = new Employee(22, "Red", "51000");
	Employee e2 = new Employee(23, "Green", "71600");
	Employee e3 = new Employee(44, "Black", "35187");

	Employee e4 = new Employee(55, "Yellow", "47100");
	Employee e5 = new Employee(56, "Pink", "62001");
	Employee e6 = new Employee(65, "Blue", "32001 ");
	Employee e7 = new Employee(77, "Brown", "42361");
	
	
	ArrayList<Employee> al= new ArrayList<Employee>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	al.add(e6);
	al.add(e7);
	
	
	   
	 al.sort(Comparator.comparing(Employee::getSal).thenComparing(Employee::getEmpid));
	 
	 
	 
	  // ascending order
	 al.stream().sorted((o1,o2)->o1.getEmpid().compareTo(o2.getEmpid())).collect(Collectors.toList());
     System.out.println("Ascending order => " + al);
     // descending order
     al.stream().sorted((o1,o2)->o2.getEmpid().compareTo(o1.getEmpid())).collect(Collectors.toList());
     System.out.println("Descending order => " + al);
	 // al.sort(Comparator.comparing(Employee::getEmpName));
	  
	  System.out.println(al);
	  al.sort(Comparator.comparing(Employee::getEmpid));
	  System.out.println(al);
	  al.sort(Comparator.comparing(Employee::getSal).reversed());
	  System.out.println("list of values "+al);
	  
	  
	List<String> emp = al.stream().map(Employee::getSal).collect(Collectors.toList());
	 // System.out.println(l.sort(Collections.reverseOrder()));
 Stream<String> h = emp.stream().sorted(Collections.reverseOrder());
 h.forEach(System.out::println);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
