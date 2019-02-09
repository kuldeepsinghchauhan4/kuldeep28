package com.cg.mob.service;


import com.cg.mob.bean.*;
public abstract class cusImp implements cusInt{
	
@Override
public  customerDet addCustDetails(String cusName,String cusMailId,String cusMob,int PurchaseId,
int PurchaseDate) {
	customerDet c=new customerDet();
	c.setCusMailId(cusMailId);
	c.setCusMob(cusMob);
	c.setCusName(cusName);
    c.setPurchaseDate(PurchaseDate);
    c.setPurchaseId(PurchaseId);

	return c;
}



	@Override
	 public mobileDet addMobDetails(String mobName,int mobId,double MobPrice) {
		mobileDet m=new  mobileDet();
		m.setMobId(mobId);
		m.setMobName(mobName);
		m.setMobPrice(MobPrice);
return m;		
		
	}

}
