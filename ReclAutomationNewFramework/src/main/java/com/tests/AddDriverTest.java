package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.library.Utility;
import com.pageObjects.HomePage;

public class AddDriverTest extends StartTest {
	

//	public AddDriverTest(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//	}

	@Test(priority = 1)
	public void addDriver() throws InterruptedException {
		
		homePage = new HomePage(driver);
		
		test= extent.createTest("Add Driver Test");

		homePage.masterClick();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.vanDriver();

		driverPage.addDriverClick();

		addDriverPage.driverLicenceInput("DL2345901BR1223");

		addDriverPage.driverNameInput("Nikhil Damle");

		addDriverPage.transpTypeSelect("Company");

		addDriverPage.licenceVAlidDate("05/22/2023");

		addDriverPage.hazardLicenceValiDAte("06/23/2022");

		addDriverPage.addressInput("204 Das Auto systems");

		addDriverPage.mobileInput("9404950930");

		addDriverPage.stateSelect("Maharashtra");

		addDriverPage.districtSelect("Beed");

		addDriverPage.submit();	
		
		addDriverPage.submitchk();
		
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
