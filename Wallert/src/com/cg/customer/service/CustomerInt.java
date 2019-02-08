package com.cg.customer.service;
import com.cg.customer.bean.*;
public  interface CustomerInt {
	Customer createAccount(String name,String mobno,double bal);
	Customer showBal(String mobno);
}
