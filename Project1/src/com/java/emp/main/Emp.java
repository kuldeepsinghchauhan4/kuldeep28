package com.java.emp.main;

import com.java.emp.bean.Employee;
import com.java.emp.service.EmpDetails;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[] = new Employee[7];
		e[0] = new Employee("Ashish", 1001, "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
		e[1] = new Employee("Sushma", 1002, "23/08/2012", 'c', "PM", 30000, 9000, 12000);
		e[2] = new Employee("Rahul", 1003, "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
		e[3] = new Employee("Chahat", 1004, "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
		e[4] = new Employee("Ranjan", 1005, "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
		e[5] = new Employee("Suman", 1006, "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400);
		e[6] = new Employee("Tanmay", 1007, "12/06/2006", 'c', "PM", 29000, 12000, 10000);
				
		int x = Integer.parseInt(args[0]);
		System.out.println(x);
		EmpDetails emp = new EmpDetails();
		
		int count = emp.setDesignation(e,x);
		if(count == 0)
			System.out.println("There is no employee with empid:" + x);

	}

}
