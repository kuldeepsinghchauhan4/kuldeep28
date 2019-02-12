package com.capgemini.takehome.test;

import static org.junit.Assert.fail;

import org.junit.Before;

public class Test{
	@Before
	public void runBeforeEveryTestCase() {
		System.out.println("Run before  every testcase ");
	}
	@Test
	public  void test1() {
		fail("not executed");
	}
}