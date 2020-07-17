package com.tests.transaction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;

public class UpdatePoStatusCompletedAdminTest extends StartTestTransaction {

	@Test(priority = 1)
	public void firstRecordClick() throws InterruptedException {

		test = extent.createTest("Complete status Test");

		homePage.transactionClick();

		Thread.sleep(2000);

		homePage.allPoClick();

		allPoPage.firstRecordClick();

		Thread.sleep(2000);

		createNewPoPage.poStatusSelect("Completed");

		

//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//		LocalDate localDate = LocalDate.now();
//		String dt = dtf.format(localDate); // 2016/11/16
//		System.out.println(dt);

		createNewPoPage.goodsReceiptDateSelect("3/12/2020");

		createNewPoPage.submit();

		createNewPoPage.updateSubmitchk();
		
		driver.quit();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		try {
			if (result.getStatus() == ITestResult.SUCCESS) {

				// Do something here
				System.out.println(result.getName() + "" + "passed **********");
			}

			else if (result.getStatus() == ITestResult.FAILURE) {
				// Do something here
				System.out.println(result.getName() + "" + "Failed ***********");
				Utility.captureScreenshot(driver, result.getName());

				driver.quit();

			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
