package com.tests;

import java.util.Random;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class AddVehicleTest extends StartTest{
	

//	public AddVehicleTest(WebDriver driver) {
//	
//		this.driver =driver;
//		// TODO Auto-generated constructor stub
//	}
	
	
	@Test(priority=1)
	
	public void addVehicle() throws InterruptedException {
		
		homePage = new HomePage(driver);
		test= extent.createTest("Add Customer Test");
		
		homePage.masterClick();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		homePage.vehicleClick();
		
		vehiclePage.addVehiclePageClick();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.vehicleOwnerSelect("Company");  //0-company   1- transporter  2-infactory
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		Random rand = new Random();
		int num=rand.nextInt(10000);
		addVehiclePage.vehicleNoInput("MH34 BT2334"+num);
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addVehiclePage.vehicleDescription("Tatra Truck Six Wheeler");  
		
		addVehiclePage.capacityInput("50000");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		int num2=rand.nextInt(100000);
		addVehiclePage.licenceNoInput("DL23567PT4567"+num2);
		addVehiclePage.licenceExpDateSelect("5/28/2020");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.insuranceUpto("4/10/2022");
		addVehiclePage.form38date("4/1/2023");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		addVehiclePage.nationalPermitdate("4/5/2018");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addVehiclePage.submit();
		
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
