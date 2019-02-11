package com.cg.mra.beans;

public class Account {
private String accountType;
private String accountname;
private double accountBalance;

/*public Account(String accountType, String accountname, double accountBalance) {
	super();
	
}*/
public Account(String accountType, String accountname, int accountBalance) {
	// TODO Auto-generated constructor stub
	this.accountType = accountType;
	this.accountname = accountname;
	this.accountBalance = accountBalance;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getAccountname() {
	return accountname;
}
public void setAccountname(String accountname) {
	this.accountname = accountname;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
@Override
public String toString() {
	return "Account [accountType=" + accountType + ", accountname=" + accountname + ", accountBalance=" + accountBalance
			+ "]";
}

}
