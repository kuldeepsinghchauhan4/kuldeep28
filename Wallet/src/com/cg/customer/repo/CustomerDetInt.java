package com.cg.customer.repo;

import com.cg.customer.bean.Customer;
import com.cg.customer.exception.NumberNotfoundException;

public interface CustomerDetInt {
	
	Customer findByPhone(String mobno) throws NumberNotfoundException;
	boolean save(Customer c);

}
