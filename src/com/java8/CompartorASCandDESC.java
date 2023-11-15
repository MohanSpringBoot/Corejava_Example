package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.Employee;

public class CompartorASCandDESC {

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
		
		al.stream().sorted((o1,o2)->o1.getEmpid().compareTo(o2.getEmpid())).collect(Collectors.toList());
		
	     // ascending order
        Collections.sort(al, (o1, o2) -> (o1.getEmpName().compareTo(o2.getEmpName())));
        System.out.println("Ascending order => " + al);
        
        // descending order
        Collections.sort(al, (o1, o2) -> (o2.getEmpName().compareTo(o1.getEmpName())));
        System.out.println("Descending order => " + al);
        
     // using Comparator.comparing() method
        Collections.sort(al, Comparator.comparing(Employee::getEmpName));
        System.out.println("Comaparator order => " + al);
        
        //calculate
        
         //Stream<Object> sumId = al.stream().map(Integer::); 
         //System.out.println("Sum of id's: "+sumId); 
		
	}

}
