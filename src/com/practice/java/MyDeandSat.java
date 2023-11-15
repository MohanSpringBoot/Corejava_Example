package com.practice.java;

public class MyDeandSat implements StaticAndDefault {
	
	
	
	public static void main(String[] args) {
		MyDeandSat st= new MyDeandSat();
		st.getdefault();
		StaticAndDefault.getStatic();
	
		//StaticAndDefault::getStatic();
	}

	@Override
	public void getAbstract() {
		// TODO Auto-generated method stub
		
	}

}
