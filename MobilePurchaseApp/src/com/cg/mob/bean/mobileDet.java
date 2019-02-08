package com.cg.mob.bean;

public class mobileDet {
	String mobName;
	int mobId;
	double mobPrice;
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}
	@Override
	public String toString() {
		return "Mobiledetails [mobName=" + mobName + ", mobId=" + mobId + ", mobPrice=" + mobPrice + "]";
	}
	

}