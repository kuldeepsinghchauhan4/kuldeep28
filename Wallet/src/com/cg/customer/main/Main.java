package com.cg.customer.main;

import java.util.Scanner;

import com.cg.customer.bean.Customer;

public class Main {

	public static void main(String[] args) {
		Customer c=new Customer();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.next();
		c.addname(name);
	}

}
