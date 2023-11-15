package com.java;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created: ");
	      int size = sc.nextInt();
		//int size=4;
		  int[] myArray =new int[size];
	      //int[] myArray = {3,5,2,6,8,21,76,45};
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++){
	         myArray[i] = size;
	      }
	      System.out.println("Enter the value tobe searched: ");
	      int searchVal = sc.nextInt();;
	      for (int i =0 ; i<myArray.length; i++) {
	         if (myArray[i] == searchVal) {
	            System.out.println("The index of element "+searchVal+" is : " + i);
	         }
	      }
	}

}
