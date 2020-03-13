package com.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;

public class EditItemTest extends StartTest{

	@Test(priority = 1)
	public void editItem() {

		homePage = new HomePage(driver);
		test = extent.createTest("Edit Item Test");

		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.itemClick();

		itemPage.editLast();
		
		editItemPage.typeSelectDrop("Detonators"); // Detonators or Explosive
		editItemPage.shortNameInput("RAMIREZ EXP");
		editItemPage.categoryInput();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//editItemPage.uom();
		editItemPage.dispOrderInp("2000");
		editItemPage.nameInp("RAMIREZ EXP");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editItemPage.pesocodeInp("324242");
		editItemPage.itemcartageInp("KCCX BDD WE 234 mm");
		editItemPage.tokenNoInp("0");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editItemPage.itemCatInp("DET");
		editItemPage.qtyInp("20");
		editItemPage.classAndDivInp("2 2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editItemPage.kgmtrnosuom("24");
		editItemPage.groupDesc("0");
		editItemPage.status();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		editItemPage.submit();

		editItemPage.chekItemSubmit();

		//driver.quit();
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

				//driver.quit();

			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
