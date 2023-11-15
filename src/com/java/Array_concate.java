package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array_concate {

	  public static void main(String[] args) {
		  
		  int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};
	       //Stream.of(array1,array2).flatMap(arr->arr.length);
	        
	        int lenght=array1.length+array2.length;
	        
	        
	        int[] result= new int[lenght];
	        int count = 0;
	        for (int element : array1) {
	            result[count] = element;
	            count++;
	        }

	        for (int element : array2) {
	            result[count] = element;
	            count++;
	        }
	        System.out.println("result"+Arrays.toString(result));
	    }
	}

