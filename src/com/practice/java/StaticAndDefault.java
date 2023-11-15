package com.practice.java;

public interface StaticAndDefault {
	public default void getdefault(){
		System.out.println("default method");
		
	}
	public static void getStatic(){
		System.out.println("static method");
		
	}
   abstract void getAbstract();
}
