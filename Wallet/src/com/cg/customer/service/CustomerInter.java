package com.cg.customer.service;

import com.cg.customer.bean.Customer;

public interface CustomerInter {
	Customer createAccount(String name,String mobno,double bal);
	Customer showBal(String mobno);
	
}
