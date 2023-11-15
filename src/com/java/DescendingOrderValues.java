package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrderValues {

	public static void main(String[] args) {

		//creating an instance of an array  
		Integer[] arr =  {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		
		//List<int[]> list = Arrays.asList(arr);
		//Arrays.sort(arr);
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(" Descending order arrays value::::::::::::::::"+Arrays.toString(arr));
		/*for (int i = 0; i < arr.length; i++)   
		{  f c
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.println(arr[i]);  
		}  */
		}  
		}  