package com.cg.customer.bean;

public class Wallet {
//String id;
double bal;

	/*
	 * public String getId() { return id; } public void setId(String string) {
	 * this.id = string; }
	 */
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
	/*
	 * public Wallet(int id, double bal) { super(); this.id = id; this.bal = bal; }
	 */
@Override
public String toString() {
	return "Wallet [ bal=" + bal + "]";
}

}
