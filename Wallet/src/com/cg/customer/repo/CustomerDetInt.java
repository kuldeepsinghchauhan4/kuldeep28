package com.cg.customer.repo;

import com.cg.customer.bean.Customer;

public interface CustomerDetInt {
	boolean save( );
	Customer findByPhone(String mobno);

}
