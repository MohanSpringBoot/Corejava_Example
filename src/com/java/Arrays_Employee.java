package com.java;

import java.util.Arrays;

public class Arrays_Employee implements Comparable<Arrays_Employee> {
    private String name;
    private int empId;
    //constructor
    public Arrays_Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
 
    public String getName() {
        return name;
    }
 
    public int getempId() {
        return empId;
    }
     
    //overridden functions since we are working with array of objects
    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' +
                    ", EmpId=" + empId + '}';
    }
 
    //compareTo method overridden for sorting array of objects
    @Override
    public int compareTo(Arrays_Employee o) {
        if (this.empId != o.getempId()) {
            return this.empId - o.getempId();
        }
        return this.name.compareTo(o.getName());
    }

	
	
}
 
//main class
 
