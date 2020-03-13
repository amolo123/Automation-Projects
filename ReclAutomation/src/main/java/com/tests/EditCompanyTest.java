package com.tests;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;

public class EditCompanyTest extends StartTest{
	
	
//	public EditCompanyTest(WebDriver driver) {
//	
//		this.driver =driver;
//		// TODO Auto-generated constructor stub
//	}
	
	@Test(priority=1)
	
	public void editCompanyTest() {
	
		
		test= extent.createTest("Edit Customer Test");
		
		homePage.masterClick();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		homePage.companyClick();
		
		
		
		companyPage.editLast();
		
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		
		editCompanyPage.codeInput();
		
		editCompanyPage.nameInput();
		
		editCompanyPage.contactPersonInput("Jeff Kiman");
		
		editCompanyPage.contactNoInput("9191919191");
		
		editCompanyPage.addressInput("Bikhani Building Sarvodaya nagar");
		
		editCompanyPage.submit();
		
		editCompanyPage.submitEditchk();
		
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
