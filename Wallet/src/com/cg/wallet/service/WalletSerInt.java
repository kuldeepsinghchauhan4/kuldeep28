package com.cg.wallet.service;
import com.cg.customer.bean.*;
public abstract class WalletSerInt {
	abstract  Customer createAccount(String name,double mobno,double bal);
	  abstract Customer showBal(double mobno);

}
