package com.java8;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import com.java.Employee;

public class Arrays_Car {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "hp1", "5656");
		Employee e2 = new Employee(20, "hp2", "3434");

		Employee e3 = new Employee(30, "hp3", "2323");

		Employee e4 = new Employee(40, "hp4", "4565");
		Employee e5 = new Employee(50, "hp5", "36789");
		
		Employee[] emp={e1,e2,e3,e4,e5};				
		
		Arrays.stream(emp).forEach(System.out::println);
		
		
		  Optional<String> sumSal = Stream.of(emp).filter(ep->ep.getSal()!=null).map(Employee::getSal).reduce((ans,i)->ans+i);
			      

	}

	

}
