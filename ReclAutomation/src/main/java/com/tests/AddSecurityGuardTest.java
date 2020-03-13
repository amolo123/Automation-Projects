package com.tests;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class AddSecurityGuardTest extends StartTest{
	
//	 public AddSecurityGuardTest(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		 
//		 this.driver=driver;
//	}

	
	@Test(priority=1)
	public void addSecurityGuard() {
		
		homePage = new HomePage(driver);
		
		test= extent.createTest("Add SecurityGuard Test");
		
		homePage.masterClick();
		 
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 homePage.securityGuardClick();
		 
		 securityGuardPage.addSecurityGuardClick();
		 
		 addSecurityGuardPage.guardNameInp("Vimal Dhoke");
		 
		 addSecurityGuardPage.agencySelect("Ahmedi Security Services");
		 
		 addSecurityGuardPage.address1Inp("546 Hasbanda Building");
		 
		 addSecurityGuardPage.address2Inp("Sai Krishna Nagar");
		 
		 addSecurityGuardPage.stateSelect("Bihar");
		 
		 
		 addSecurityGuardPage.districtSelect("Arwal");
		 
		 System.out.println("State District Selected");
		 
		 addSecurityGuardPage.pincodeInp("440012");
		 
		 addSecurityGuardPage.mobileInp("9404950930");
		 
		 addSecurityGuardPage.emailInp("vimal@gmail.com");
		 
		 addSecurityGuardPage.typeInp("9404950930");
		 
		 
		 
		 addSecurityGuardPage.idNoInp("BE 23567");
		 
		 System.out.println("Pincode Mobile Typeinput Success id no inp");
		 
		 
		 
		 addSecurityGuardPage.submit();
		 
		
		 addSecurityGuardPage.submitChk();
		 
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
