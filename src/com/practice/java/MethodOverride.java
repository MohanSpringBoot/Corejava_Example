package com.practice.java;

public class MethodOverride {

		
		public static void m1(int a,int b ){
			
		System.out.println("parent static method");

	}
		
	
}
 class ChildMethod extends MethodOverride{
	
	 public static void m1(int a,int b ){
			
			System.out.println("parent static method");

		}
			
	
}
