package com.java.emp.service;

import com.java.emp.bean.Employee;

public class EmpDetails {
	public int setDesignation(Employee e[], int x) {
		int i, count = 0;
		for(i = 0; i <= 6; i++) {
			if(e[i].getEid() == x) {
				switch(e[i].getDesCode()) {
				case 'e':
					e[i].setDes("Engineer");
					e[i].setDa(20000);
					break;
				case 'c':
					e[i].setDes("Consultant");
					e[i].setDa(32000);
					break;
				case 'k':
					e[i].setDes("Clerk");
					e[i].setDa(12000);
					break;
				case 'r':
					e[i].setDes("Receptionist");
					e[i].setDa(15000);
					break;
				case 'm':
					e[i].setDes("Manager");
					e[i].setDa(40000);
					break;
				}
				this.display(e[i]);
				count++;
			}
		}
		return count;
		
	}
	
	public void display(Employee e) {
		double sal = this.salary(e);
		e.setSalary(sal);
		System.out.format("%-15s %-15s %-15s %-15s %-15s\n", "Emp No", "Name", "Department", "Designation", "Salary");
		System.out.format("%-15s %-15s %-15s %-15s %-15s\n", e.getEid(),e.getName(),e.getDept(),e.getDes(),e.getSalary());
		
	}
	
	double salary(Employee e) {
		return(e.getBasic()+e.getHra()+e.getDa()+e.getIt());
	}

}
