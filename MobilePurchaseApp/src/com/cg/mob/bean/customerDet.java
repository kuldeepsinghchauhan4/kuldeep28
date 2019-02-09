package com.cg.mob.bean;

public class customerDet {
String cusName;
String cusMailId;
String cusMob;
int PurchaseId;
int PurchaseDate;
public String getCusName() {
	return cusName;
}
public void setCusName(String cusName) {
	this.cusName = cusName;
}
public String getCusMailId() {
	return cusMailId;
}
public void setCusMailId(String cusMailId) {
	this.cusMailId = cusMailId;
}
public String getCusMob() {
	return cusMob;
}
public void setCusMob(String cusMob) {
	this.cusMob = cusMob;
}
public int getPurchaseId() {
	return PurchaseId;
}

public int getPurchaseDate() {
	return PurchaseDate;
}
public void setPurchaseDate(int purchaseDate) {
	PurchaseDate = purchaseDate;
}
public void setPurchaseId(int purchaseId) {
	PurchaseId = purchaseId;
	
}
}
