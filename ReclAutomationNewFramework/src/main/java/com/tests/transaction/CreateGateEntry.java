package com.tests.transaction;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class CreateGateEntry extends StartTest{
	
	
	@Test
	public void creteGateInEntry() throws IOException {
		
		test= extent.createTest("Create New PO");
		
		homePage.gate();
		
		homePage.createGateInEntry();
		
		createGateInEntryPage.tokenNoInput();
		
		createGateInEntryPage.submit();
		
		createGateInEntryPage.driverNameInput();
		
		createGateInEntryPage.vanStatusSelect();
		
		createGateInEntryPage.re11StatusSelect();
		
		createGateInEntryPage.re11OkYes();
		
		createGateInEntryPage.submitFinal();
		
		
	}
	
	

}
