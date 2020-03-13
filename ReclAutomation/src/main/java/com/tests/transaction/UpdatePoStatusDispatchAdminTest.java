package com.tests.transaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class UpdatePoStatusDispatchAdminTest extends StartTestTransaction {
	
	@Test(priority=1)
	public void firstRecordClick() throws InterruptedException {
		
		homePage.transactionClick();
		
		homePage.allPoClick();
		
		
		
		
	}
	
	
	@Test(priority=2)
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
	

}
