package com.java;
import java.util.Scanner;

public class FirstName {

	 public static void main(String[] args)
	 {
	   String n;
	   Scanner c=new Scanner(System.in);
	   System.out.print("Enter the user name:");
	   n=c.nextLine();
	   String [] t=n.split(" ");
	   int l=t.length;
	   System.out.print("Your Short name:");
	   for(int i=0;i<l-1;i++)
	  {
	   System.out.print(t[i].charAt(0)+".");
	  }
	   System.out.print(t[l-1]);
	  }
	 }


