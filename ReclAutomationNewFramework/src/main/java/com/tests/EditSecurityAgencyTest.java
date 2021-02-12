package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class EditSecurityAgencyTest extends StartTest{

	 @Test(priority=1)
		public void addSecurityAgency() throws InterruptedException {
		 
		 homePage = new HomePage(driver);
		 
		 test= extent.createTest("Edit Customer Test");
		 
		 homePage.masterClick();
		 
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 homePage.securityAgencyClick();
		 
		 Thread.sleep(2000);
		 System.out.println("Before Edit Last");
		 
		 securityAgencyPage.editLast();
		 
		 System.out.println("After Edit Last");
		 Thread.sleep(4000);
		
		 editSecurityAgencyPage.agencyNameInp("Remanisanca Security Services");
		 
		 editSecurityAgencyPage.contactPersonInp("Girdhar Vir Gokhale");
		 
		 editSecurityAgencyPage.mobileInp("9404950930");
		 
		 editSecurityAgencyPage.emailInp("girdhar@gmail.com");
		 
		 editSecurityAgencyPage.address1Inp("543 vishant Bagh");
		 
		 editSecurityAgencyPage.address2Inp("East Parliament Road");
		 
		 
		 editSecurityAgencyPage.stateSelect("Maharashtra");
		 
		 editSecurityAgencyPage.districtSelect("Beed");
		 
		 
		 
		 editSecurityAgencyPage.pinCodeInp("410023");
		 
		 //addSecurityAgencyPage
		 
		 editSecurityAgencyPage.submit();
		 
		 editSecurityAgencyPage.editSubmit();
	
		 
		 //driver.quit();
			 
		 
		 
		 
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
	         
	    		//driver.quit();

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
