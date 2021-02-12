package com.tests.transaction;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.tests.StartTest;

public class CreateNewPOCompanyTest extends StartTest {
	
	
	
	@Test(priority=1)
	public void createNewPO() throws InterruptedException {
		
	test = extent.createTest("Create New PO");
	 
	 homePage.transactionClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	
	 
	 //createNewPoPage.companyNameSelect("Rajasthan Explosives Chemicals Limited");
	 
	
	
		homePage.createNewPoClick();	 
		 
	 createNewPoPage.customerNameSelect("GANPATI ENTERPRISES");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.companyRadioButtonSelect();
	 
	 createNewPoPage.magazineCode("E/HQ/RJ/21/206(E25018)");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.re11No("454677");
	 
	 createNewPoPage.browseSelect("/home/ankita/Downloads/sample.pdf");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewPoPage.re11DateSelect("07/07/2020");
	 
	 createNewPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.orderBox();
	 
	 
	 

	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.submit();
	 
	 createNewPoPage.submitchk();
	 
	 try {Thread.sleep(4000);} catch (InterruptedException e) {e.printStackTrace();}
 
	 
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
