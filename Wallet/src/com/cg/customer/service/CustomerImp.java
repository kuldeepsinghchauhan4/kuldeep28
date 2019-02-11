package com.cg.customer.service;

import java.io.ObjectInputStream.GetField;

import com.cg.customer.bean.Customer;
import com.cg.customer.bean.Wallet;
import com.cg.customer.exception.ExceptionHandler;
import com.cg.customer.repo.*;
import com.cg.customer.bean.Wallet;

public  class CustomerImp implements CustomerInter {
	
	CustomerDetImp repo=new CustomerDetImp();
	@Override
		 public Customer createAccount(String name,String mobno,double bal) throws ExceptionHandler {
		Customer c=new Customer();
		c.setName(name);
		if(name=="") {
			 throw new ExceptionHandler("not valid");
		}
		else {
		c.setMobno(mobno);
		Wallet wallet=new Wallet();
		wallet.setBal(bal);
		//c.setBal(bal);
		c.setWallet(wallet);
		
		if(repo.save(c))
			return c;
		return null;
		}
	}
	public Customer findByPhone(String mobno) {
		// CustomerImp repo = null;
		 Customer c = (repo.findByPhone(mobno));
		return c;
	}
	@Override
	public double showBal(String mobno) {
		CustomerDetImp c=new CustomerDetImp();
		Customer c1=c.findByPhone(mobno);
	    return c1.getWallet().getBal();
		
	}
}
