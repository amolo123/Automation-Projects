package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class AddVehicleExFactoryTest extends StartTest{
	
 @Test(priority=1)
	
	public void addVehicle() throws InterruptedException {
		
		homePage = new HomePage(driver);
		
		test= extent.createTest("Add Vehicle Test");
		
		homePage.masterClick();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		homePage.vehicleClick();
		
		vehiclePage.addVehiclePageClick();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.vehicleOwnerSelect("Ex-factory");  //0-company   1- transporter  2-Ex-factory
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addVehiclePage.customerSelect("DYNEX EXPLOSIVES");
		
		addVehiclePage.vehicleNoInput("MH34 BT2334");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addVehiclePage.vehicleDescription("Tatra Truck Six Wheeler");  
		
		addVehiclePage.capacityInput("50000");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.licenceNoInput("DL23567PT4567");
		addVehiclePage.licenceExpDateSelect("4/22/2020");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.insuranceUpto("4/22/2022");
		addVehiclePage.form38date("4/22/2023");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.nationalPermitdate("4/22/2018");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addVehiclePage.submit();
		
		addVehiclePage.submitchk();
		
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
