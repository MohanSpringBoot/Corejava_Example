package com.java;

import java.util.Arrays;

public class Test {
	


	    public static void main(String[] args)
	    {
	        //array of Employee objects
	        /*Employee[] employees = { new Employee("Rick", 1), new Employee("Sam", 20),
	                    new Employee("Adi", 5), new Employee("Ben", 10) };*/
	    	Arrays_Employee[] employees= new Arrays_Employee[3];
	    	employees[0]=new Arrays_Employee("mohan", 5);
	    	employees[1]=new Arrays_Employee("sai", 10);
	    	employees[2]=new Arrays_Employee("kumar", 3);
	        //print original array
	        System.out.println("Original Array of Employee objects:");
	        System.out.println(Arrays.toString(employees));
	        //sort array on empId
	        Arrays.sort(employees);
	        //display sorted array
	        System.out.println("\nSorted Array of Employee objects:");
	        System.out.println(Arrays.toString(employees));
	    }
	} 

