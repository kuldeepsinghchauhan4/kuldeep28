package com.cg.mob.service;
import com.cg.mob.bean.*;
public interface cusInt {
	//customerDet addCustDetails(String cusName,String cusMailId,String cusMob,int PurchaseId,int PurchaseDate);
	mobileDet addMobDetails(String mobName,int mobId,double MobPrice);
	//customerDet addCustDetails(String cusName, String cusMailId, String cusMob, int PurchaseId);
	customerDet addCustDetails(String cusName, String cusMailId, String cusMob, int PurchaseId, int PurchaseDate);

}
