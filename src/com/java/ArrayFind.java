package com.java;

public class ArrayFind {

	public static void main(String[] args) {

		int [] arr = {34, 2, 23, 100, 60};
	    int key = 34;
	    		
	    		int i,flag = 0;
	    
	    for(i = 0; i < arr.length; i++)
	    {
	        if(arr[i] == key)
	        {
	            flag = 1;
	            break;
	        }
	    }

	    if(flag == 1)
	        System.out.println("Element Found in Array\n" +key);
	    else
	    	System.out.println("Element Not Found in Array\n");

	  
	}
	}



