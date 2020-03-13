package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class EditDriverTest extends StartTest{
	
	@Test(priority = 1)
	public void addDriver() throws InterruptedException {
		
		test = extent.createTest("Edit Driver");
		
		homePage = new HomePage(driver);
		
	
		homePage.masterClick();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.vanDriver();

		driverPage.editLast();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editDriverPage.driverLicenceInput("DL2345901BR334466643");

		editDriverPage.driverNameInput("Vinod Jhirade");

		//editDriverPage.transpTypeSelect("Company");

		editDriverPage.licenceVAlidDate("07/20/2023");

		editDriverPage.hazardLicenceValiDAte("07/23/2022");

		editDriverPage.addressInput("204 Nipane Bhavan Sharda Nivas");

		editDriverPage.mobileInput("9338456431");

		editDriverPage.stateSelect("Odisha");

		editDriverPage.districtSelect("Balasore");

		editDriverPage.submit();	
		
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
