package com.tests.transaction;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class GateOutClick extends StartTest{
	
	@Test
	public void gateOut() throws InterruptedException, IOException {
		
		test= extent.createTest("gate out");
		
		homePage.gate();
		
		Thread.sleep(2000);
		
		//homePage.gateInList();
		
		gateInList.gateOutClick();
		
		
		gateInList.vehNoInput();
		
		gateInList.submit1();
		
		gateInList.securityGuardSelect();
		
		//gateInList.loadedWeight();
		
		gateInList.vanStatusSelect();
		
		gateInList.submitClick();
	}
	
	

}
