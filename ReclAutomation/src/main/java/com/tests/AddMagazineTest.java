package com.tests;

import java.util.Random;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;



public class AddMagazineTest extends StartTest {
	
	
//	 public AddMagazineTest(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		 
//		 this.driver = driver;
//	}
	
	
    @Test(priority=1)
	public void addMagazine() throws InterruptedException {
    	
    	homePage = new HomePage(driver);
    	
    	test= extent.createTest("Add Magazine Test");
    	
    	homePage.masterClick();
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	homePage.magZineClick();
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	System.out.println("magazine clicked");
    	
    	magzinePage.addMagzineClick();
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.magazineTypeSelect(2);     //1 for detonators 2 for explosives 
    	
    	Random rand = new Random(10000);
    	int num = rand.nextInt();
    	
    	addMagazinePage.licenceNoInput("BRD232BT234597"+num);
    	
    	addMagazinePage.magazineDetailInput("Mag/Det/3456");
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.licenceExpiryInput("04/28/2020");
    	
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.customerCodeSelect("60003");
    	
    	//addMagazinePage.customerNameSelect("GANPATI ENTERPRISES");
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.contactNameInput("Rahul Bajaj");
    	
    	addMagazinePage.contactNoInput("9730134501");
    	
    	addMagazinePage.addressInput("204 Himalkar Road Kashikar");
    	
    	addMagazinePage.pinInput("40025");
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.stateSelect("Gujarat");
    	
    	addMagazinePage.districtSelect("Amreli");
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.talukaInput("Mahalkhera");
    	
    	addMagazinePage.itemNameSelect("R-Cord S");
    	
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addMagazinePage.submit();
    	
    	
    	addMagazinePage.submitchk();
    	
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
