package com.tests.transaction;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class GateOutClick extends StartTest{
	
	@Test
	public void gateOut() throws InterruptedException {
		
		test= extent.createTest("gate out");
		
		homePage.gate();
		
		Thread.sleep(2000);
		
		//homePage.gateInList();
		
		gateInList.gateOutClick();
		
		gateInList.securityGuardSelect();
		
		//gateInList.loadedWeight();
		
		gateInList.vanStatusSelect();
		
		gateInList.submitClick();
	}
	
	

}
