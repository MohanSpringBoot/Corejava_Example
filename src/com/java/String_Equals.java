package com.java;

public class String_Equals {
	public static void main(String[] args) {
		System.out.println("equalsss");
		
		String s1="mohan";
		String s2="mohan";
		String s3="mohankumar";
		//s1=s2;
		
		String s4= new String("mohan");
		String s5= new String("mohan");
		String s6= new String("mango");
		//s4=s6;
		
		System.out.println("==equals:::1:::"+ s1==s2);
		System.out.println("doubleequals:::2:::"+ s2==s3);
		System.out.println("doubleequals:::3:::"+ s1==s4);
		System.out.println("doubleequals:::4:::"+ s3==s4);
		
		System.out.println("EncloseEquals:::1:::"+ s1.equals(s2));
		System.out.println("EncloseEquals:::2:::"+ s2.equals(s3));
		System.out.println("EncloseEquals:::3:::"+ s1.equals(s4));
		System.out.println("EncloseEquals:::4:::"+ s3.equals(s4));
		
		
		System.out.println("Enclos_doubleeeequals:::1:::"+ s1==s2);
		System.out.println("Enclose_doubleequals:::2:::"+ s2==s3);
		System.out.println("Enclose_doubleequals:::3:::"+ s1==s4);
		
		System.out.println("eequals:::1:::"+s4.equals(s5));
		System.out.println("eequals:::2:::"+s4.equals(s6));
		System.out.println("eequals:::3:::"+s5.equals(s6));
	}

}
