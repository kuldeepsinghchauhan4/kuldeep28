package com.cg.mra.servivce;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService{
	Account account = new Account();
	AccountDao dao = new AccountDaoImpl();
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		account = dao.getAccountDetails(mobileNo);
		System.out.println(account.getAccountBalance());
		return account;
		
	}
	@Override
	public int rechargeAccount(String mobileNo,double rechargeAmount) {
		int d = dao.rechargeAccount(mobileNo, rechargeAmount);
		return d;
		
	}
}
