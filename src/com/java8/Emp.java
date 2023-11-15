package com.java8;

public class Emp {
	private Integer eid;
	private String eName;
	private Double empSal;
	
	public Emp(Integer eid, String eName, Double empSal) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.empSal = empSal;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	
}
