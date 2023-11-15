package com.java;

public class SampleMultithread implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<=10; i++){
			System.out.println("this is childthread");
		}
	}

	public void runt() {
		for (int i=0; i<=10; i++){
			System.out.println("this is childthread");
		}
	}

	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++){
			System.out.println("this is mainthread");
		}
		SampleMultithread st= new SampleMultithread();
		Thread t =new Thread(st);
		//st.runt();
		t.start();
		st.run();
		
	}

	

}
