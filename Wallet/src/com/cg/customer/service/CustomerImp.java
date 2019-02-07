package com.cg.customer.service;

import com.cg.customer.bean.Customer;
import com.cg.customer.bean.Wallet;

public abstract class CustomerImp implements CustomerInter {

	@Override
		 public Customer createAccount(String name,String mobno,double bal) {
		Customer c=new Customer();
		c.setName(name);
		c.setNo(mobno);
		Wallet wallet=new Wallet();
		wallet.setBal(bal);
		//c.setBal(bal);
		c.getWallet().getBal();
		return c;
	}
	public Customer showBal(String mobno) {
		Customer c2=new Customer();
	c2.setNo(mobno);
	
		return c2;
	}
}
