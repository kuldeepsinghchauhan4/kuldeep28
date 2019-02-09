package com.cg.mob.repo;

import java.util.ArrayList;


import com.cg.mob.bean.customerDet;
import com.cg.mob.bean.mobileDet;

public class detailsImp implements details {
	ArrayList<customerDet> l=new ArrayList<customerDet>();
	@Override 
	public boolean saveCus(customerDet c) {
		l.add(c);
		return true;
	}
	ArrayList<mobileDet> li=new ArrayList<mobileDet>();
	@Override
	public boolean saveMob(mobileDet m) {
		li.add(m);
		return true;
	}
	
	
}
