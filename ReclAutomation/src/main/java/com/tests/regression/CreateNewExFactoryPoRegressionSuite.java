package com.tests.regression;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class CreateNewExFactoryPoRegressionSuite extends StartTest{

	
	@Test(priority=1)
	public void createNewPO() throws  InterruptedException, IOException{
	 
	 homePage.transactionClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	 homePage.createNewPoClick();
	 
	 createNewPoPage.companyNameSelect("Maharashtra Explosives");
	 
	 createNewPoPage.customerNameSelect("CHARBHUJA NATH");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 
	 createNewPoPage.exfactoryRadioButtonSelect();
	 
	 createNewPoPage.vehicleNoSelect();
	 
	
	 
	 createNewPoPage.magazineCode("4545454");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.re11No("454677");
	 
	 createNewPoPage.browseSelect("/home/ankita/Pictures/jpeg43.jpg");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

	 createNewPoPage.re11DateSelect("03/04/2020");
	 
	 createNewPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.submit();
	 
	 createNewPoPage.submitchk();
	 
	 
	 
 }
	
	
	@Test(priority=2)
	public void updatePoStatusAdmin() throws InterruptedException, IOException {
		
		
		
		allPoPage.firstRecordClick();
		
		createNewPoPage.vehicleNoSelect();
		
		createNewPoPage.availabilityDateSelect("03/19/2020");
		
		createNewPoPage.poStatusSelect("Approved");
		
		createNewPoPage.submit();
		
		createNewPoPage.updateSubmitchk();
		
		
		
	
	}
	
	
	@Test(priority=3)
	public void updatePoStatusDispatchAdminTest() throws InterruptedException {
		
		allPoPage.firstRecordClick();
		Thread.sleep(2000);
		
		createNewPoPage.poStatusSelect("Dispatched");
		System.out.println("Dispatched Clicked");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1000)");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String dt =dtf.format(localDate); //2016/11/16
		System.out.println(dt);
		
		
		createNewPoPage.invNoInput("ARM2345");
		System.out.println("Invoice inputted ");
		
		createNewPoPage.invDateInput("03/22/2020");
		System.out.println("invoice date Clicked");
		
		createNewPoPage.submit();
		
		createNewPoPage.updateSubmitchk();
		
		
		
	
	}
	
	
//	@Test (priority=4)
//	public void updatePoStatusCompleted() throws InterruptedException {
//		
//		allPoPage.firstRecordClick();
//		
//		Thread.sleep(2000);
//		
//		createNewPoPage.poStatusSelect("Completed");
//		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		
//		jse.executeScript("window.scrollBy(0,1000)");
//		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//		LocalDate localDate = LocalDate.now();
//		String dt =dtf.format(localDate); //2016/11/16
//		System.out.println(dt);
//		
//		createNewPoPage.goodsReceiptDateSelect("2/22/2020");
//		
//		createNewPoPage.submit();
//		
//		createNewPoPage.submitchk();
//		
//	}
	
	
	
}
