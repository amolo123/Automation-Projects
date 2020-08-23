package com.tests.regression;
    
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.tests.StartTest;

public class CreateNewExFactoryPoRegressionSuite extends StartTest{

	
	@Test(priority=2)
	public void createNewPO() throws  InterruptedException, IOException{
		
		test = extent.createTest("Create New Ex Factory Po");
	 
	 homePage.transactionClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	 homePage.createNewPoClick();
	 
	 //createNewPoPage.companyNameSelect("Maharashtra Explosives Pvt Ltd");
	 
	 createNewPoPage.customerNameSelect("CHARBHUJA NATH");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 
	 createNewPoPage.exfactoryRadioButtonSelect();
	 
	 createNewPoPage.vehicleNoSelect();
	 
	 
	 createNewPoPage.magazineCode("E/HQ/RJ/21/177(E-2734)");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.re11No("454677");
	 
	 createNewPoPage.browseSelect("/home/ankita/Desktop/int issue.pdf");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

	 //------Date Before 5 days-----
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	 
	 Date date = new Date();
	
	 Calendar c = Calendar.getInstance();
     c.setTime(date);
     c.add(Calendar.DATE, -5);
     Date currentDatePlusOne = c.getTime();
	
     String date1= dateFormat.format(currentDatePlusOne);
	 System.out.println(date1);
	 
	 createNewPoPage.re11DateSelect(date1);
	 
	 createNewPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.orderBox();
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.submit();
	 
	 createNewPoPage.submitchk();
	 
 }
	
	
	@Test(priority = 3)
	public void updatePoStatusApproveAdmin() throws InterruptedException, IOException {

		test = extent.createTest("Update Po Approve");


		Thread.sleep(2000);
		
		homePage.allPoClick();

		allPoPage.firstRecordClick();

		//createNewPoPage.vehicleNoSelect();
		
		 //------Date Before 5 days-----
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		 
		 Date date = new Date();
		
		 Calendar c = Calendar.getInstance();
	     c.setTime(date);
	     c.add(Calendar.DATE, 6);
	     Date currentDatePlusOne = c.getTime();
		
	     String date1= dateFormat.format(currentDatePlusOne);
		 System.out.println(date1);

		createNewPoPage.availabilityDateSelect(date1);

		createNewPoPage.poStatusSelect("Approved");

		createNewPoPage.re11Verify();

		createNewPoPage.submit();

		createNewPoPage.updateSubmitchk();

	}

	@Test(priority=4)
	public void sendIntemation() throws InterruptedException {
		
		Thread.sleep(2000);
		homePage.transactionClick();
		test= extent.createTest("Send Itemation");
		Thread.sleep(2000);
		
		homePage.intemationClick();
		
		homePage.sendPoIntemationClick();
		
		Thread.sleep(3000);
		
		poIntemationPage.lastCheckboxselect();
		
		poIntemationPage.submit();
		
	
		
	}
	
	
	
	@Test(priority=5)
	public void updateStatusDispatch() throws InterruptedException {
		
		Thread.sleep(3000);
		test = extent.createTest("Dispatch Status Test");
		
		homePage.transactionClick();
		
		Thread.sleep(3000);
		
		homePage.allPoClick();
		
		
		
		allPoPage.firstRecordClick();
		Thread.sleep(2000);
		
		createNewPoPage.poStatusSelect("Dispatched");
		System.out.println("Dispatched Clicked");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1000)");
		
		 //------Date Before 5 days-----
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		 
		 Date date = new Date();
		
		 Calendar c = Calendar.getInstance();
	     c.setTime(date);
	     c.add(Calendar.DATE, -2);
	     Date currentDatePlusOne = c.getTime();
		
	     String date1= dateFormat.format(currentDatePlusOne);
		 System.out.println(date1);
		
		
		createNewPoPage.invNoInput("ARM2345");
		System.out.println("Invoice inputted ");
		
		createNewPoPage.invDateInput(date1);
		System.out.println("invoice date Clicked");
		
		createNewPoPage.submit();
		
		createNewPoPage.updateSubmitchk();
		
	
	}
	
	
	@Test(priority=6)
	public void creteGateInEntry() throws IOException, InterruptedException {
		
		Thread.sleep(3000);
		homePage.transactionClick();
		
		Thread.sleep(2000);
		
		
		test= extent.createTest("Create Gate In");
		
		homePage.gate();
		
		homePage.createGateInEntry();
		
		createGateInEntryPage.tokenNoInput();
		
		createGateInEntryPage.submit();
		
		createGateInEntryPage.driverNameInput();
		
		createGateInEntryPage.vanStatusSelect();
		
		createGateInEntryPage.re11StatusSelect();
		
		createGateInEntryPage.re11OkYes();
		
		createGateInEntryPage.submitFinal();
		
		
	}
	
	
	@Test(priority=7)
	public void gateOut() throws InterruptedException, IOException {
		
		test= extent.createTest("gate out");
		
		//homePage.gate();
		
		Thread.sleep(2000);
		
		//homePage.gateInList();
		
		gateInList.gateOutClick();
		
		
		gateInList.vehNoInput();
		
		gateInList.submit1();
		
		gateInList.securityGuardSelect();
		
		//gateInList.loadedWeight();
		
		gateInList.vanStatusSelect();
		
		gateInList.submitClick();
	}
	
	@Test(priority = 8)
	public void completedTest() throws InterruptedException {

		test = extent.createTest("Complete status Test");

		homePage.transactionClick();

		Thread.sleep(2000);

		homePage.allPoClick();

		allPoPage.firstRecordClick();

		Thread.sleep(2000);

		createNewPoPage.poStatusSelect("Completed");

		 //------Date Before 5 days-----
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		 
		 Date date = new Date();
		
		 Calendar c = Calendar.getInstance();
	     c.setTime(date);
	     c.add(Calendar.DATE, 0);
	     Date currentDatePlusOne = c.getTime();
		
	     String date1= dateFormat.format(currentDatePlusOne);
		 System.out.println(date1);

		createNewPoPage.goodsReceiptDateSelect(date1);

		createNewPoPage.submit();

		createNewPoPage.updateSubmitchk();
		
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
