package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;

public class EditCustomerTest extends StartTest {

//    public EditCustomerTest(WebDriver driver) {
//	this.driver =driver;
//   	// TODO Auto-generated constructor stub
//	}	

	@Test(priority = 1)
	public void editCustomerTest() {
		
		test = extent.createTest("Edit Customer Test");

		homePage.masterClick();
		homePage.customerClick();

		System.out.println("Customer clicked");

		customerPage.editLast();

		System.out.println("Customer in Edit Mode");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editCustomerPage.customerName("Rohan Shirsh Sathe");

		editCustomerPage.email("rss11223344@gmail.com");

		editCustomerPage.telephone("7878787877");

		editCustomerPage.mobileNo("9847474743");

		editCustomerPage.address("33 L sukhasin Apartment Pune");

		editCustomerPage.state("Odisha");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editCustomerPage.district("Balasore");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editCustomerPage.taluka("Falsaguda");
		
		

		editCustomerPage.submit();

		addCustomerPage.chekEditSubmit();

		

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		try {
			if (result.getStatus() == ITestResult.SUCCESS) {

				// Do something here
				System.out.println(result.getName() + "" + "passed **********");
				driver.quit();
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
