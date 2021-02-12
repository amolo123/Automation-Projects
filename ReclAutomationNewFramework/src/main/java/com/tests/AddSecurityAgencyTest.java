package com.tests;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class AddSecurityAgencyTest extends StartTest {
	
	
//	 public AddSecurityAgencyTest(WebDriver driver) {
//		 
//		 this.driver = driver;
//	}
	
	 @Test(priority=1)
		public void addSecurityAgency() {
		 
		 homePage = new HomePage(driver);
		 
		 test= extent.createTest("Add Customer Test");
		 
		 homePage.masterClick();
		 
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 homePage.securityAgencyClick();
		 
		 securityAgencyPage.addSecurityAgencyClick();
		 
		 addSecurityAgencyPage.agencyNameInp("Voltaise Security Services");
		 
		 addSecurityAgencyPage.contactPersonInp("Ravindra Vir Singh");
		 
		 addSecurityAgencyPage.mobileInp("9730134501");
		 
		 addSecurityAgencyPage.emailInp("ravindra@gmail.com");
		 
		 addSecurityAgencyPage.address1Inp("645 Karol Bagh");
		 
		 addSecurityAgencyPage.address2Inp("West Parliament Road");
		 
		 
		 addSecurityAgencyPage.stateSelect("Gujarat");
		 
		 addSecurityAgencyPage.districtSelect("Anand");
		 
		 
		 
		 addSecurityAgencyPage.pinCodeInp("410033");
		 
		 //addSecurityAgencyPage
		 
		 addSecurityAgencyPage.submit();
		 
		 addSecurityAgencyPage.submitchk();
	
		 
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
