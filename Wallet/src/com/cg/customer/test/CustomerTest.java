package com.cg.customer.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cg.customer.bean.Customer;
import com.cg.customer.bean.Wallet;
import com.cg.customer.service.CustomerImp;
import com.cg.customer.service.CustomerInter;

public class CustomerTest {
	@Before
	public void runEveryTimeBeforeTest() {
		System.out.println("test run before create account");

	}
	@Test
	public void test() {
		Wallet wallet = new Wallet();
		wallet.setBal(1000);
		Customer c=new Customer();
		CustomerInter c1=new CustomerImp();
         c.setName("kuldeep");
         c.setMobno("7500800149");
         //c.getWallet().setId("7500800149");
        c.setWallet(wallet);
         assertEquals(c, c1.createAccount("kuldeep", "7500800149", 1000));
	}
	
	
}
