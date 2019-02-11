package com.cg.customer.bean;

public class Customer {
String name;
double mobno;
Wallet wallet;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMobno() {
	return mobno;
}
public void setMobno(double mobno) {
	this.mobno = mobno;
}
public Wallet getWallet() {
	return wallet;
}
public void setWallet(Wallet wallet) {
	this.wallet = wallet;
}
}