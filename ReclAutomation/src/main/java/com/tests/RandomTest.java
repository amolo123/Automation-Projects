package com.tests;

import org.testng.annotations.Test;

import com.pageObjects.HomePage;

public class RandomTest extends StartTest{

	HomePage homePage;
	@Test (priority=1)
	public void mytest() {
		
		 //homePage = new HomePage(driver);
		 
		 AddCompanyTest addcom = new AddCompanyTest();
		 
		 addcom.addCompanyTest();
		//InitializeContructor.initializeConstructor(driver, "AddCompanyTest");
		//AddCompanyTest add = new AddCompanyTest(driver);
		
		// AddCompanyTest add = new AddCompanyTest(driver);
		// add.addCompanyTest();
		
		//new AddCompanyTest(driver);
		
		
		
	}
	
	
}