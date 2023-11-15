package com.java;

public class SecondHighest {
	
	public static void main(String[] args) {

	    
	      int array[] = {10, 50, 30, 60, 40, 15};
	     int size = array.length;
      int max=0;
      int Secondmax=0;
	      for(int i = 0; i<size; i++ ){

	            if(max<array[i]){
	                Secondmax=max;	
	                max = array[i];
	               System.out.println(""+max);
	            
	            }else if(max!=array[i] && Secondmax<array[i]){
	               Secondmax=array[i] ;
	               //System.out.println("arr"+array[i]);
	            }
	         }
	      
	      System.out.println(" largest number is:: "+max);
	      System.out.println(" second largest number is:: "+Secondmax);

	   }

}
