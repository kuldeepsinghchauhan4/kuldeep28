package com.cg.eis.pl;
import com.cg.eis.service.*;
public class Main {

	public static void main(String[] args) {
		Service se=new Service();
		se.employeUser();
		se.insSch("manager",20000);
		se.displayDet();
	}

}
