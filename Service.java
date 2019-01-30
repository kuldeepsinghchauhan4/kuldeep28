package com.cg.eis.service; 
import com.cg.eis.bean.*;
import java.util.Scanner;
public  class Service implements  EmployeService{
	

	 public void employeUser() {
		System.out.println("employee id");
		 Scanner s1=new Scanner(System.in);
		int id=s1.nextInt();
		System.out.println("employee name");
		String name=s1.next();
		System.out.println("employee destination");
		String dest=s1.next();
	    System.out.println("employee salary");
		float s=s1.nextInt();
		System.out.println();
	
	}
	 
public void insSch(String d,float sa) {
	if(d.equals("analyst") && (sa>80000)) {
		System.out.println(" scheme1 is available ");
	}
	else if(d.equals("trainee") && (sa>20000))
	{
		System.out.println(" scheme2 is available ");
	}
	
else {
	System.out.println("no scheme ");
}
	
}
public void displayDet() {
	System.out.println("name is");
	
}
}
