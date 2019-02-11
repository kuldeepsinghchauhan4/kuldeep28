package com.cg.mra.ui;

import java.util.Scanner;
import com.cg.mra.servivce.*;
import com.cg.mra.beans.*;
import com.cg.mra.dao.*;

public class MainUI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for Account Balance Enquiry");
		System.out.println("enter 2 for Recharge Account");
		System.out.println("enter 3 for exit");
System.out.println("enter ur choice");
int choice=sc.nextInt();
switch(choice){
	case 1:
		getAccountDetails();		
	    break;
	case 2:
		rechargeAccount();
	    break;
	case 3:
		System.exit(0);
	default:
	    System.out.println("u entered a wrong choice");


	}

}
