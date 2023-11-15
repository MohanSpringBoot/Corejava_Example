package com.java;

public class StringPrgm1 {

	public static void main(String[] args) {
		String input = "aaabbbcc"; //count number of "a" on this String.
	     
        //
     
        //counting occurrence of character with loop
        int charCount = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == 'a'){
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for loop  " + charCount);
	}

}
