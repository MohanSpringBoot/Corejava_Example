package com.java;

public class String_Reverse {

	public static void main(String[] args) {
		String Str = "Hello";
		String reversedStr = "";

		for (int i = 0; i < Str.length(); i++) {
		  reversedStr += Str.charAt(i) + reversedStr;
		}
		
		

		System.out.println("Reversed string: "+ reversedStr);
	}

}
