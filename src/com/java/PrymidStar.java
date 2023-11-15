package com.java;

public class PrymidStar {

	public static void main(String[] args) {

		/*for(i=1;i<=5;i++){
			for(j=4;j<=i;j--){
				System.out.println("");
			}
			for(k=1;k<=(2*i-1);k++){
				System.out.println("*");
			}
			System.out.println("");

		}*/

	
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" "); 
				} 
			for (int k = 0; k <= i; k++) {
					System.out.print(" *"); 
					}
			System.out.println(); 
					}

	}

}
