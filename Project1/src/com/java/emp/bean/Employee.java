package com.java.emp.bean;

public class Employee {
	private String name;
	private int eid;
	private String joinDate;
	private char desCode;
	private String dept;
	private String des;
	private double basic, hra, it, da;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(String name, int eid, String joinDate, char desCode, String dept, double basic, double hra,
			double it) {
//		super();
		this.name = name;
		this.eid = eid;
		this.joinDate = joinDate;
		this.desCode = desCode;
		this.dept = dept;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public char getDesCode() {
		return desCode;
	}

	public void setDesCode(char desCode) {
		this.desCode = desCode;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getIt() {
		return it;
	}

	public void setIt(double it) {
		this.it = it;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
