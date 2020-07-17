package com.tests.transaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class UpdatePoStatusDispatchAdminTest extends StartTest{
	
	@Test(priority=1)
	public void firstRecordClick() throws InterruptedException {
		
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
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		String dt =dtf.format(localDate); //2016/11/16
		System.out.println(dt);
		
		
		createNewPoPage.invNoInput("ARM2345");
		System.out.println("Invoice inputted ");
		
		createNewPoPage.invDateInput("07/17/2020");
		System.out.println("invoice date Clicked");
		
		createNewPoPage.submit();
		
		createNewPoPage.updateSubmitchk();
		
		driver.quit();
		
	
	}
	

}
