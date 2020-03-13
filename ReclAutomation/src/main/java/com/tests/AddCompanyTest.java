package com.tests;



import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;



import com.library.Utility;


public class AddCompanyTest extends StartTest {


	
	 public AddCompanyTest() { // TODO Auto-generated constructor
	
		 
	 }
//	 
	
	
	
 
	@Test(priority = 1)

	public void addCompanyTest() {
		//new AddCompanyTest(driver);
		
		//HomePage homePage = new HomePage(driver);
		test= extent.createTest("Add Company Test");
	
		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.companyClick();

		companyPage.addCompany();

		addCompanyPage.codeInput();

		addCompanyPage.nameInput();

		addCompanyPage.contactPersonInput("Anil Sole");

		addCompanyPage.contactNoInput("9730134501");

		addCompanyPage.addressInput("Address");

		addCompanyPage.stateSelect("Maharashtra");

		addCompanyPage.districtSelect("Akola");

		addCompanyPage.talukaInput("Ramkharadi");

		addCompanyPage.submit();

		addCompanyPage.submitchk();

		driver.quit();
	}

	
	@AfterMethod
	 public void afterMethod(ITestResult result)
	 {
	     try
	  {
	     if(result.getStatus() == ITestResult.SUCCESS)
	     {

	         //Do something here
	         System.out.println(result.getName()+""+"passed **********");
	     }

	     else if(result.getStatus() == ITestResult.FAILURE)
	     {
	          //Do something here
	         System.out.println(result.getName()+""+"Failed ***********");
	         Utility.captureScreenshot(driver, result.getName());
	         
	    		driver.quit();

	     }

	      else if(result.getStatus() == ITestResult.SKIP ){

	         System.out.println(result.getName()+""+"Skiped***********");

	     }
	     
	     
	 }
	    catch(Exception e)
	    {
	      e.printStackTrace();
	    }

	 }
	
}
