package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class AddItemTest extends StartTest {

	
//	public AddItemTest(WebDriver driver) {
//		
//		this.driver= driver;
//	}
	
	
	
	@Test(priority=1)
	public void addItem() {
		
		homePage = new HomePage(driver);
		test= extent.createTest("Add Item Test");
		
		
		homePage.masterClick();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		homePage.itemClick();
		
		itemPage.addItemClick();
		addItemPage.typeSelectDrop("Detonators");     //Detonators or Explosive
		addItemPage.shortNameInput("Kamov KA");
		addItemPage.categoryInput();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addItemPage.uom();
		addItemPage.dispOrderInp("3000");
		addItemPage.nameInp("KAMOV BOMBER KA");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addItemPage.pesocodeInp("23456");
		addItemPage.itemcartageInp("KCCX BDD 234 mm");
		addItemPage.tokenNoInp("0");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addItemPage.itemCatInp("DET");
		addItemPage.qtyInp("10");
		addItemPage.classAndDivInp("3 2");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		addItemPage.kgmtrnosuom("24");
		addItemPage.groupDesc("0");
		addItemPage.status();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		addItemPage.submit();
		
		addItemPage.chekItemSubmit();
		
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
