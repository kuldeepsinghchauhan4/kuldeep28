package com.cg.customer.main;

import java.util.Scanner;

import com.cg.customer.bean.Customer;

import com.cg.customer.bean.Customer;
import com.cg.customer.bean.Wallet;
import com.cg.customer.exception.ExceptionHandler;
import com.cg.customer.exception.NumberNotfoundException;
import com.cg.customer.repo.CustomerDetImp;
import com.cg.customer.repo.CustomerDetInt;
import com.cg.customer.service.CustomerImp;

public class Main {

	public static void main(String[] args) {
		//Customer c1 = new Customer();
		//Scanner s = new Scanner(System.in);
		CustomerImp c=new CustomerImp();
		try {
		System.out.println(c.createAccount("kuldeep","7500800149", 50000));
		System.out.println(c.createAccount("abc","1234567890",100));
		} catch(ExceptionHandler e){
			System.out.println("handled");
			
		}
// System.out.println(c.showBal("7500800149"));
//
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
		try {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
//System.out.println(c2.save(c1));
System.out.println(c.findByPhone("7500800149"));
System.out.println(c.findByPhone("1234567890"));
}catch(NumberNotfoundException e1) {
	System.out.println("resolved");
}
		
		/*
		 * System.out.println("enter your name");
		 * 
		 * c.setName(s.next()); System.out.println("enter ur mobno");
		 * c.setMobno(s.next()); Wallet w=new Wallet(); System.out.println("enter amt");
		 * w.setBal(s.nextDouble()); w.setId(s.next()); c.setWallet(w);
		 */
		/*
		 * CustomerImp c2=new CustomerImp (); c2.createAccount(name, mobno, bal);
		 */
		/*
		 * CustomerDetImp c1=new CustomerDetImp(); c1.save(c);
		 * 
		 * if(c1.save(c)){
		 *  System.out.println("hi"); }
		 * 
		 * //c1.findByPhone("7500800149"); CustomerImp c2=new CustomerImp();
		 * c2.showBal("7500800149");
		 */
	}

}