package com.cg.mra.servivce;

import com.cg.mra.beans.Account;

public interface AccountService {
Account getAccountDetails(String mobileNo);
int rechargeAccount(String mobileo,double rechargeAmount);

}
