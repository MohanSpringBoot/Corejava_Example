package com.java;

public class SortStringPrgm {

	
	public String toFormat(String input) {
	    char inChar[] = input.toCharArray();
	    String output = "";
	    int i;
	    for(i=0;i<input.length();i++) {
	      int count = 1;
	      while(i+1<input.length() && inChar[i] == inChar[i+1]) {
	        count+=1;
	        i+=1;
	      }
	      output+=inChar[i]+String.valueOf(count);
	    }
	    return output;
	  }
	public static void main(String[] args) {
		SortStringPrgm sol = new SortStringPrgm();
	    String input = "aaabbbbcc";  
	    System.out.println("Formatted String is: " + sol.toFormat(input)); 
	}

}
