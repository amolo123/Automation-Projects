package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;

import com.pageObjects.HomePage;

public class EditTransporterTest extends StartTest {
	
	 @Test(priority=1)
		public void addTransporter() {
		 
		 homePage = new HomePage(driver);
		 
		 test= extent.createTest("Add Transporter Test");
		 
		 homePage.masterClick();
		 
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 homePage.transportClick();
		 
		 
		 transporterPage.editLast();
		 try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 
		 editTransporterPage.transporterNameInp("Ritwik Transport");
		 editTransporterPage.contactPersonInp("Nishant Mohan");
		 editTransporterPage.mobileInp("9404950930");
		 editTransporterPage.emailInp("dnishant@gmail.com");
		 editTransporterPage.address1Inp("204 Shradhannad Apartment Baraskantha");
		 editTransporterPage.address2Inp("M G Road Delhi");
		 editTransporterPage.pincodeInp("440022");
		 editTransporterPage.stateInp("Maharashtra");
		 editTransporterPage.districtInp("Beed");
		 editTransporterPage.submit();
		 
		 editTransporterPage.editSubmitchk();
		 
			 
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
