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
		
	 homePage.createNewPoClick();
	 
	 createNewPoPage.companyNameSelect("Maharashtra Explosives");
	 
	 createNewPoPage.customerNameSelect("Malti Bhagat");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.companyRadioButtonSelect();
	 
	 createNewPoPage.magazineCode("BRD232BT234597");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.re11No("454677");
	 
	 createNewPoPage.browseSelect("/home/ankita/Pictures/jpeg43.jpg");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewPoPage.re11DateSelect("03/04/2020");
	 
	 createNewPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.submit();
	 
	 createNewPoPage.submitchk();
	 
	 
	 
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
