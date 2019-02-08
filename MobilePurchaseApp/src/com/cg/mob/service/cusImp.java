package com.cg.mob.service;
import com.cg.mob.bean.*;
public abstract class cusImp implements cusInt{
@Override
public  customerDet addCustDetails(String cusName,String cusMailId,String cusMob) {
	customerDet c=new customerDet();
	c.setCusName(cusName);
	c.setCusMailId(cusMailId);
	c.getCusMob(cusMob);
	return c;
}
	
public PurchaseDet addPurDetails(int PurchaseId,int PurchaseDate) {
PurchaseDet p=new PurchaseDet();
p.setPurchaseId(PurchaseId);
p.setPurchaseDate(PurchaseDate);
}
