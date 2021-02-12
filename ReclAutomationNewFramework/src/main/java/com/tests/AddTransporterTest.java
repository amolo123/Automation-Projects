package com.tests;


import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class AddTransporterTest extends StartTest{
	
//	 public AddTransporterTest(WebDriver driver) {
//	
//		 this.driver =driver;
//		 // TODO Auto-generated constructor stub
//	}
	
	
	 @Test(priority=1)
		public void addTransporter() {
		 
		 homePage = new HomePage(driver);
		 
		 test= extent.createTest("Add Transporter Test");
		 
		 homePage.masterClick();
		 
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 homePage.transportClick();
		 
		 
		 transporterPage.addTransporterClick();
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 
		 addTransporterPage.transporterNameInp("Alankrita Transport");
		 addTransporterPage.contactPersonInp("Vimal Agrawal");
		 addTransporterPage.mobileInp("9730134501");
		 addTransporterPage.emailInp("vagrawal@gmail.com");
		 addTransporterPage.address1Inp("204 Shradhannad Apartment Baraskantha Road");
		 addTransporterPage.address2Inp("M G Road Delhi");
		 addTransporterPage.pincodeInp("440025");
		 addTransporterPage.stateInp("Haryana");
		 addTransporterPage.districtInp("Bhiwani");
		 addTransporterPage.submit();
		 
		 addTransporterPage.submitchk();
		 
			 
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
