package com.tests.transaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;





	public class UpdatePoStatusCompletedAdminTest extends StartTestTransaction {
	
	
	@Test(priority =1)
	public void firstRecordClick() {
		

		homePage.transactionClick();
		
		homePage.allPoClick();
		
		allPoPage.firstRecordClick();
		
	}
	
	
	@Test (priority=2)
	public void updatePoStatusCompleted() throws InterruptedException {
		
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
