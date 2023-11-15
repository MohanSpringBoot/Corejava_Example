package com.practice.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class String_Counting {

	public static  void Stringcount(String st) {
		
		
		Map<Character, Integer> mp=new HashMap<Character, Integer>();
		
		for(int i=0;i<st.length()-1;i++){
			char c = st.charAt(i);
			if(mp.containsKey(c)){
				Integer count = mp.get(c);
				
				mp.put(c, ++count);
			}else{
				mp.put(c, 1);
			}
			
		}
		for( Entry<Character, Integer> mm:mp.entrySet()){
			System.out.println("the key"+mm.getKey()+":"+mm.getValue());
			
		
		}
	}
	public static void main(String[] args) {
		String st="mohankumar";
		Stringcount(st);
	}

}
