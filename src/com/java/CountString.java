package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("B", "A", "A", "C", "B", "A");
		 
        Map<String, Integer> mp = new HashMap<>();
       /* for (String s: list)
        {*/
        	
        	for (int i = 0; i <=list.size()-1; i++) {
        	String s	=list.get(i);
            Integer count = mp.get(s);
          /*  if (count == null) {
                count = 0;
            }
            mp.put(s, ++count);*/
              if(mp.containsKey(s))
              {
            	  mp.put(s, mp.get(s)+1);
              }else{
            mp.put(s, 1);
        }
        }
        for (Map.Entry<String, Integer> entry: mp.entrySet()) {
        	
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
