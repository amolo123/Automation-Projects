package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class EditSecurityGuardTest extends StartTest {
	
	
	@Test(priority=1)
	public void addSecurityGuard() throws InterruptedException {
		
		homePage = new HomePage(driver);
		
		test= extent.createTest("Add SecurityGuard Test");
		
		homePage.masterClick();
		 
		 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
			
		 homePage.securityGuardClick();
		 
		 securityGuardPage.editLast();
		 
		 Thread.sleep(3000);
		 
		 editSecurityGuardPage.guardNameInp("Nirmal Bapat");
		 
		 editSecurityGuardPage.agencySelect("Vixen Transports");
		 
		 editSecurityGuardPage.address1Inp("546 Nirmala Building");
		 
		 editSecurityGuardPage.address2Inp("Vidhya Vilah Krishna Nagar");
		 
		 editSecurityGuardPage.stateSelect("Gujarat");
		 
		 
		 editSecurityGuardPage.districtSelect("Anand");
		 
		 System.out.println("State District Selected");
		 
		 editSecurityGuardPage.pincodeInp("440033");
		 
		 editSecurityGuardPage.mobileInp("9730134501");
		 
		 editSecurityGuardPage.emailInp("vidhya@gmail.com");
		 
		 editSecurityGuardPage.typeInp("9773323211");
		 
		 
		 
		 editSecurityGuardPage.idNoInp("LE 23567");
		 
		 System.out.println("Pincode Mobile Typeinput Success id no inp");
		 
		 
		 
		 editSecurityGuardPage.submit();
		 
		
		 editSecurityGuardPage.editSubmitChk();
		 
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
