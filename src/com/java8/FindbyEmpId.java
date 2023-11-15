package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.Employee;

public class FindbyEmpId {

	public static void main(String[] args) {

		
		Employee e1 = new Employee(22, "Red", "51000");
		Employee e2 = new Employee(23, "Green", "71600");
		Employee e3 = new Employee(44, "Black", "35187");

		Employee e4 = new Employee(55, "Yellow", "47100");
		Employee e5 = new Employee(56, "Pink", "62001");
		Employee e6 = new Employee(65, "Blue", "32001 ");
		Employee e7 = new Employee(77, "Green", "42361");
		
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		
		 List<Employee> emp = al.stream()
.filter(employee -> "Green".equals(employee.getEmpName())).collect(Collectors.toList());
		
		System.out.println(emp);
	}

}
