package com.tests.transaction;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class Intemation extends StartTest{
	
	
	@Test
	public void sendIntemation() throws InterruptedException {
		
		test= extent.createTest("Send Itemation");
		Thread.sleep(2000);
		
		homePage.intemationClick();
		
		homePage.sendPoIntemationClick();
		
		Thread.sleep(3000);
		
		poIntemationPage.lastCheckboxselect();
		
		poIntemationPage.submit();
		
	

		
		
	}
	
	
	
	

}
