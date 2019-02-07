package com.cg.customer.repo;

import com.cg.customer.bean.Customer;

public class CustomerDetImp implements CustomerDetInt{
	@Override
	public boolean save() {
		
		
	}
@Override
public  void findByPhone(String mobno) {
	Customer c1=new Customer();
	if(c1.getNo()==this.mobno) {
		c1.showBal();
	}
	
	
}
}
