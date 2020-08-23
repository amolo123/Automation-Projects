package com.tests.transaction;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.tests.StartTest;

public class UpdatePOStatusApproverAdminTest extends StartTest {

	@Test(priority = 1)
	public void updatePoStatusAdmin() throws InterruptedException, IOException {

		test = extent.createTest("Update Po Approve");

		homePage.transactionClick();

		Thread.sleep(2000);
		
		homePage.allPoClick();

		allPoPage.firstRecordClick();

		//createNewPoPage.vehicleNoSelect();

		createNewPoPage.availabilityDateSelect("03/25/2020");

		createNewPoPage.poStatusSelect("Approved");

		createNewPoPage.re11Verify();

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
