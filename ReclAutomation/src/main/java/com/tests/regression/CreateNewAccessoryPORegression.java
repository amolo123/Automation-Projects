package com.tests.regression;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CreateNewAccessoryPORegression extends StartRegressionTest{
	
	
	@Test(priority=1)
	public void createNewPO() {
		
	test=extent.createTest("Create New PO");
	 
	 homePage.accessoryClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	 homePage.createNewAccessory();
	 
	 createNewAccessoryPoPage.companyNameSelect("Maharashtra Explosives");
	 
	 createNewAccessoryPoPage.customerNameSelect("GANPATI ENTERPRISES");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.companyRadioButtonSelect();
	 
	 
	 
	 createNewAccessoryPoPage.magazineCode("Explo-E/HQ/RJ/21/206(E25019)");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.re11No("454677");
	 
	 createNewAccessoryPoPage.browseSelect("/home/ankita/Pictures/jpeg43.jpg");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewAccessoryPoPage.re11DateSelect("12-02-2020");
	 
	 createNewAccessoryPoPage.itemSelect("SUPER ELECTRIC  DETONATOR(Red) 1.5 Mtrs");
	 
	 
	 createNewAccessoryPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.submit();
	 
	 createNewAccessoryPoPage.submitchk();
	 
	 
	 
 }
	
	@Test(priority=2)
	public void updatePoStatusAdmin() throws InterruptedException, IOException {
		
		
		
		homePage.allPoClick();
		
		allPoPage.firstRecordClick();
		
		createNewPoPage.vehicleNoSelect();
		
		createNewPoPage.availabilityDateSelect("03/19/2020");
		
		createNewPoPage.poStatusSelect("Approved");
		
		createNewPoPage.sub();
		
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
	
	
	@Test (priority=4)
	public void updatePoStatusCompleted() throws InterruptedException {
		
		
		allPoPage.firstRecordClick();
		Thread.sleep(2000);
		
		createNewPoPage.poStatusSelect("Completed");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1000)");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String dt =dtf.format(localDate); //2016/11/16
		System.out.println(dt);
		
		createNewPoPage.goodsReceiptDateSelect("2/22/2020");
		
		createNewPoPage.submit();
		
		createNewPoPage.submitchk();
		
	}
	
	
	
	
	

}
