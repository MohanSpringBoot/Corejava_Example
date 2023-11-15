package com.java;

import com.google.gson.Gson;

public class Array_to_Json {
		   public static void main(String args[]) {
		      String [] myArray = {"JavaFX", "HBase", "JOGL", "WebGL"};// Array
		    //  Gson gson = new Gson();
		   // Convert numbers array into JSON string.
		   String numbersJson = gson.toJson(myArray); //from array to json
		   // Convert strings array into JSON string
		   //String fruitsJson = gson.toJson(fruits);
		   System.out.println("numbersJson = " + numbersJson);//json
		   
		   Employee emp1 =new Employee(10, "mohan", "900");
		   Employee emp2 =new Employee(11, "m2", "500");
		   Employee emp3 =new Employee(12, "m3", "600");
Employee[] e1={emp1,emp2,emp3};
String js = gson.toJson(e1);
System.out.println("object to json = " + js);//json
		   
		 String json =  "{\"empid\":\"100\",\"empName\":\"Mohan\",\"sal\":\"3000\"}";
	Employee j = gson.fromJson(json, Employee.class);
		   System.out.println("jsontoString = " + j.toString());//json
		      
		   }
		   
		}


