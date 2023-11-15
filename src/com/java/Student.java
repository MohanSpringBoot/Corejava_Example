package com.java;

import java.util.Comparator;

public class Student implements Comparable<Student>,Comparator<Student> {
	
	private int sId;
	private String stName;
	private Double stFee;
	
	

	public int getsId() {
		return sId;
	}



	public void setsId(int sId) {
		this.sId = sId;
	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", stName=" + stName + ", stFee=" + stFee + "]";
	}



	public Student(int sId, String stName, Double stFee) {
		super();
		this.sId = sId;
		this.stName = stName;
		this.stFee = stFee;
	}



	public String getStName() {
		return stName;
	}



	public void setStName(String stName) {
		this.stName = stName;
	}



	public Double getStFee() {
		return stFee;
	}



	public void setStFee(Double stFee) {
		this.stFee = stFee;
	}



	@Override
	public int compareTo(Student s) {
		if(this.stFee == s.stFee)
			return 0;
			else
			return this.stFee > s.stFee ? 1 : -1;
			
	}



	@Override
	public int compare(Student s1, Student s2) {
		if(s1.stFee == s2.stFee)
			return 0;
			else
		return s1.getStFee()>s2.getStFee()?1:-1;
	}

}
