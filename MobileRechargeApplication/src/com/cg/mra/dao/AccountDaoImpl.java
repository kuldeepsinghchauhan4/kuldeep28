package com.cg.mra.dao;


import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao  {
	Map<String,Account> accountEntry;
	public void AccountDAOImpl() {
		accountEntry=new HashMap<String,Account>();
		accountEntry.put("9010210131",new Account("Prepaid","kuldeep",200));
		accountEntry.put("9010210131",new Account("Prepaid","kuldeep",200));
		accountEntry.put("9010210131",new Account("Prepaid","kuldeep",200));
		accountEntry.put("9010210131",new Account("Prepaid","kuldeep",200));
		accountEntry.put("9010210131",new Account("Prepaid","kuldeep",200));
	}
	@Override
	public  Account getAccountDetails(String mobileNo) {
		for(Map.Entry m:accountEntry.entrySet()) {
			if(m.getKey().equals(mobileNo)) {
				return (Account) m.getValue();
			}
			else {
				
			System.out.println("number not found");	
			}
		}
return (Account) null;
}
	@Override
	 public int rechargeAccount(String mobileNo,double rechargeAmount) {
		
		for (Map.Entry m : accountEntry.entrySet()) {
			if (m.getKey().equals(mobileNo)) {
				double x = (((Account) m.getValue()).getAccountBalance());
				((Account) m.getValue()).setAccountBalance(x + rechargeAmount);
				System.out.println("Account recharge successfully");
		
		
		
		
		
		
		
	 }
}
		return (Integer) null;
	}
}
