package com.cg.customer.service;

import com.cg.customer.bean.Customer;
import com.cg.customer.exception.ExceptionHandler;

public interface CustomerInter {
	Customer createAccount(String name,String mobno,double bal) throws ExceptionHandler;
	double showBal(String mobno);
	
}
