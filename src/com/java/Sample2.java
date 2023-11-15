package com.java;
import java.util.Scanner;


public class Sample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the value::");
		 int val=sc.nextInt();
		 System.out.println(" the value::"+val);
		 for ( int i = 0;i<=val;i++){
			 int mutival =  getmalti(i);
			 System.out.println(" the multiply value is::"+mutival);
				System.out.println(" the multiply more than value::"+mutival);	
				
		 }
		 

	}

	private static int getmalti(int s) {
	
		int mal=s+s;
		return mal;
		// TODO Auto-generated method stub
		
	}

}
