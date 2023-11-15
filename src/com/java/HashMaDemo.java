package com.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaDemo {
	
	public static void main(String args[]){
		
		HashMap<Integer,Employee> hm= new HashMap();
		
		hm.put(1, new Employee(10,"mohan","1000"));
		hm.put(2, new Employee(11,"sai","1010"));
		hm.put(3, new Employee(10,"sai2","1020"));
		hm.put(4, new Employee(10,"sai3","1030"));
		hm.put(5, new Employee(10,"sai4","1040"));
		
		hm.put(6, new Employee(10,"sai5","1050"));
		
		for (Entry<Integer, Employee> map:hm.entrySet()){
			
			System.out.println("The records ::::  "+map.getKey()+":"+map.getValue());
			
		}
		
	}

}
