package com.cg.customer.service;

import com.cg.customer.bean.Customer;
import com.cg.customer.bean.Wallet;
import com.cg.customer.repo.CustomerDetImp;

public abstract class CustomerImp implements CustomerInt {

	//private String mobno;
	@Override
		 public Customer createAccount(String name,String mobno,double bal) {
		Customer c=new Customer();
		c.setName(name);
		c.setMobno(mobno);
		Wallet w=new Wallet();
	w.setBal(bal);
		//w.setBal(bal);
	
		c.getWallet().getBal();
		return c;
	}
	@Override
	public Customer showBal(String mobno) {
		 CustomerDetImp c=new  CustomerDetImp();
		 
		 Customer temp= c.findByPhone(mobno);
		if(temp==null) {
			System.out.println("customer doesnot exist");
			return null;
		}
		else {
			System.out.println(temp.getWallet().getBal());
			return temp;
		}
		
	}
	
}