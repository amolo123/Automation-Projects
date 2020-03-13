package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;

public class EditVehicleTest extends StartTest {

	@Test(priority=1)
	public void editVehicle() throws InterruptedException {

		test = extent.createTest("Edit Vehicle Test");

		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.vehicleClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		vehiclePage.editLast();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editVehiclePage.vehicleNoInput("MH34 BT2334");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editVehiclePage.vehicleDescription("Tatra Truck Six Wheeler");

		editVehiclePage.capacityInput("50000");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editVehiclePage.licenceNoInput("DL23567PT4567");
		editVehiclePage.licenceExpDateSelect("4/22/2020");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editVehiclePage.insuranceUpto("4/22/2022");
		editVehiclePage.form38date("4/22/2023");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editVehiclePage.nationalPermitdate("4/22/2018");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editVehiclePage.submit();

		editVehiclePage.editSubmitChk();

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
