package com.tests.regression;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;



public class CreatePoCompanyRegressionSuite extends StartRegressionTest{
	
	
	@Test(priority = 1)
	public void createNewPO() throws InterruptedException {
		test=extent.createTest("Create New PO");

		homePage.transactionClick();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.createNewPoClick();

		createNewPoPage.companyNameSelect("Maharashtra Explosives Pvt Ltd");

		createNewPoPage.customerNameSelect("GANPATI ENTERPRISES");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		createNewPoPage.companyRadioButtonSelect();

		createNewPoPage.magazineCode("E/HQ/RJ/21/206(E25018)");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		createNewPoPage.re11No("454677");

		createNewPoPage.browseSelect("/home/ankita/Downloads/sample.pdf");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// driver.quit();
		createNewPoPage.re11DateSelect("03/04/2020");

		createNewPoPage.re11QtyInp();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		createNewPoPage.orderBox();

		// createNewPoPage.orderQty();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		createNewPoPage.submit();

		createNewPoPage.submitchk();

	}

	@Test(priority = 2)
	public void updatePoStatusApproveAdmin() throws InterruptedException, IOException {

		test=extent.createTest("Approve New PO");
		
		//homePage.transactionClick();

		homePage.allPoClick();

		allPoPage.firstRecordClick();

		createNewPoPage.vehicleNoSelect();

		createNewPoPage.availabilityDateSelect("03/19/2020");
		
		
		createNewPoPage.poStatusSelect("Approved");
		
		createNewPoPage.re11Verify();
		

		createNewPoPage.submit();

		createNewPoPage.updateSubmitchk();

	}
	
	
	@Test(priority=3)
	public void updatePoStatusDispatchAdminTest() throws InterruptedException {
		
		test=extent.createTest("Dispartch New PO");
		
		//homePage.transactionClick();
		
		homePage.allPoClick();
		
		allPoPage.firstRecordClick();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		createNewPoPage.poStatusSelect("Dispatched");
		
		System.out.println("Status changed to dispatched dispatched");
		
		createNewPoPage.invNoInput("NDF123231");
		
		createNewPoPage.invDateInput("03/22/2020");
		
		createNewPoPage.submit();
		
		createNewPoPage.updateSubmitchk();
		
		
		
	}
	
	
	@Test(priority=4)
	public void creteGateInEntry() throws IOException, InterruptedException {
		
		test= extent.createTest("Create New PO");
		homePage.transactionClick();
		Thread.sleep(1500);
		homePage.gate();
		Thread.sleep(1500);
		
		homePage.createGateInEntry();
		
		createGateInEntryPage.tokenNoInput();
		
		createGateInEntryPage.submit();
		
		createGateInEntryPage.driverNameInput();
		
		createGateInEntryPage.vanStatusSelect();
		
		createGateInEntryPage.re11StatusSelect();
		
		createGateInEntryPage.re11OkYes();
		
		createGateInEntryPage.submitFinal();
		
		
	}
	
	
	
	@Test(priority=5)
	public void gateOut() throws InterruptedException {
		
		test= extent.createTest("gate out");
		
		//homePage.gate();
		
		Thread.sleep(2000);
		
		homePage.gateInList();
		
		gateInList.gateOutClick();
		
		gateInList.securityGuardSelect();
		
		//gateInList.loadedWeight();
		
		gateInList.vanStatusSelect();
		
		gateInList.submitClick();
		
	}
	
	
	@Test(priority = 6)
	public void statusComplete() throws InterruptedException {

		test = extent.createTest("Complete status Test");

		homePage.transactionClick();

		Thread.sleep(2000);

		homePage.allPoClick();

		allPoPage.firstRecordClick();

		Thread.sleep(2000);

		createNewPoPage.poStatusSelect("Completed");



		createNewPoPage.goodsReceiptDateSelect("3/12/2020");

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
	         
	    		//driver.quit();

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
