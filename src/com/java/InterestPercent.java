package com.java;
import java.util.Scanner;


public class InterestPercent {

	public static void main(String[] args) {
		double val,amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount::");
		double rate = sc.nextDouble();
		System.out.println("the value"+rate);
	val=	InterestPercent.getInterest(rate);
	
	amount=rate-val;
	System.out.println("the value of interst"+val);
	System.out.println("the amount value "+amount);
	
	}

	private static double getInterest(double rate) {
double per=12; double t=1;
double value = per*t*rate/100;
return value ;

	}

}
