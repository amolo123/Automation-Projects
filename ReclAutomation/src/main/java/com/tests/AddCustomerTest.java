package com.tests;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import com.library.Utility;


public class AddCustomerTest extends StartTest {
	
	
	
    @Test(priority=1)
	public void customerAdding() {
    	
    	test= extent.createTest("Add Customer Test");
    	
    	homePage.masterClick();
    	homePage.customerClick();
    	customerPage.addcustomerClick();
    	System.out.println("Customer clicked");
    	addCustomerPage.customerName("Mahendra Bhalkar");
    	addCustomerPage.email("Mahendra@gmail.com");
    	addCustomerPage.mobileNo("9730134501");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addCustomerPage.telephone("9404950930");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addCustomerPage.address("204 kartode bhavan west high court");
    	addCustomerPage.state("Maharashtra");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
    	addCustomerPage.district("Akola");
    	addCustomerPage.taluka("Ramnathkhera");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    	
    	addCustomerPage.bankName("DBS Bank");
    	addCustomerPage.accountNo("220033405");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    	
    	addCustomerPage.branchName("MG ROAD");
    	addCustomerPage.ifscCode("DBDB2904");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    	
    	
    	addCustomerPage.panNo("BXGPG2908H");
    	addCustomerPage.gstNo("TREG12324");
    	try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    	
    	
    	addCustomerPage.submit();
    	addCustomerPage.chekSubmit();
   	
    	
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
