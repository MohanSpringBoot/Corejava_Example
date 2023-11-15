package com.java;

import java.util.HashMap;
import java.util.Map;

import javax.crypto.Mac;

public class GroupOfWordFrequency {

	public static void main(String[] args) {

		String str="mohan is good and mohan is bad";
		
		HashMap<String, Integer> map= new HashMap<>();
		String[] st=str.split(" ");
		
		for(int i=0;i<=st.length-1;i++){
			String s = st[i];
			if (map.containsKey(s)){
				Integer count=map.get(s)+1;
				map.put(s, count);
				
			}else{
				map.put(s, 1);
			}
		
		}
		for( Map.Entry<String, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() +""+ entry.getValue());
			
			
			
		}
		//.out.println(map);
	}

}
