package com.cg.mob.main;

import java.util.Scanner;

import com.cg.mob.bean.customerDet;

public class main {
public static void man(String arg[]) {
	customerDet c=new customerDet();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter customer name");
	c.setCusName(sc.next());
	System.out.println("enter customer name");
	
}
}
