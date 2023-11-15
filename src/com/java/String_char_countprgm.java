package com.java;

import java.util.HashMap;

public class String_char_countprgm {

	public static void main(String[] args) {
		
		String str = "google";  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> mp = new HashMap<>();
		
		for (int i = 0; i <=str.length()-1; i++)   
		{  
		char ch = str.charAt(i);// string to convert char
		System.out.println(ch);
		
		if(mp.containsKey(ch)){  
			
		int count = mp.get(ch);  //get  chars from map 
		mp.put(ch, ++count);  
		}else{  
		mp.put(ch,1);  
		
		//mp.put(ch, (count==0)?1:count++);
		}  
		}  
		System.out.println(mp);  
		}  
		

	}


