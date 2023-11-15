package com.java;

public class Employee {
	
	
private Integer empid;
private String empName;
private String sal;

public Integer getEmpid() {
	return empid;
}
public void setEmpid(Integer empid) {
	this.empid = empid;
}
public Employee(Integer empid, String empName, String sal) {
	super();
	this.empid = empid;
	this.empName = empName;
	this.sal = sal;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getSal() {
	return sal;
}
public void setSal(String sal) {
	this.sal = sal;
}
public Object compareTo(Employee o2) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", sal=" + sal + "]";
}

}
