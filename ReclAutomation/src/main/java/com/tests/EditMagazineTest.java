package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class EditMagazineTest extends StartTest {

	@Test(priority=1)
	public void editMagazine() throws InterruptedException {

		homePage = new HomePage(driver);

		test = extent.createTest("Add Magazine Test");

		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.magZineClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("magazine clicked");

		magzinePage.editLast();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// addMagazinePage.magazineTypeSelect(2); //1 for detonators 2 for explosives

		editMagazinePage.licenceNoInput("BRD232BT234597UPD");

		editMagazinePage.magazineDetailInput("Mag/Det/3456/UPD");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editMagazinePage.licenceExpiryInput("05/24/2020");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// editMagazinePage.customerCodeSelect("60003");

		// editMagazinePage.customerNameSelect("GANPATI ENTERPRISES");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editMagazinePage.contactNameInput("Mohit Sinha");

		editMagazinePage.contactNoInput("9404950930");

		editMagazinePage.addressInput("204 Himalkar Road Kashikar");

		editMagazinePage.pinInput("40025");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editMagazinePage.stateSelect("Maharashtra");

		editMagazinePage.districtSelect("Beed");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editMagazinePage.talukaInput("Chipla");
		
		Thread.sleep(2000);
        
		editMagazinePage.deleteItem();

		editMagazinePage.itemNameSelect("R-Cord II");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editMagazinePage.submit();

		editMagazinePage.editsubmitchk();

		// driver.quit();

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