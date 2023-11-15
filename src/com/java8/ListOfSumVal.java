package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.Item;

public class ListOfSumVal {

	public static void main(String[] args) {

		List<Integer> al= Arrays.asList(5,6,7,8,4);
		
		//Using mapToInt

		Integer sum = al.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		//Using reduce

		int reducesum = al.stream().reduce(Integer::sum).get();
		System.out.println(reducesum);
		
		OptionalDouble Avgsum =al.stream().mapToDouble(Integer::doubleValue)
			      .average();
		System.out.println(Avgsum);
		List<String> lal= Arrays.asList("5","6","7","8","4");
		OptionalDouble avg = lal.stream().map(Integer::valueOf).mapToInt(Integer::intValue).average();
		
		System.out.println(avg);
		
		
		Optional<String> max = lal.stream().max(String::compareTo);

		System.out.println(max);
//Using summingInt

Integer summing= al.stream().collect(Collectors.summingInt(Integer::intValue));
Emp[] arrayOfEmps = {
        new Emp(10, "hp1", 5656d), 
        new Emp(10, "hp1", 5656d), 
        new Emp(10, "hp1", 5656d)
    };

List<Emp> emp= Arrays.asList(new Emp(10, "hp1", 5656d),new Emp(10, "hp1", 5656d),new Emp(10, "hp1", 5656d));

////Avagarage avalue of salary
OptionalDouble AvgsSal =  emp.stream().filter(ep-> ep.getEmpSal()>0.0).mapToDouble(Emp::getEmpSal).average();
////Sum avalue of salary
Double sumSal =  emp.stream().filter(ep-> ep.getEmpSal()>0.0).map(Emp::getEmpSal).reduce(0.0, Double::sum);

System.out.println(sumSal);
////Sum avalue of salary
Double sSal =  emp.stream().filter(ep-> ep.getEmpSal()>0.0).map(Emp::getEmpSal).reduce(0.0, (ans,i)->ans+i);
System.out.println("Ssal:::"+sumSal);
	}
	

}
