package com.tests.regression;

import java.util.Random;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageObjects.HomePage;
import com.tests.StartTest;

public class MasterEditRegressionSuite extends StartTest {

	@Test(priority = 1)
	public void editCustomerTest() throws InterruptedException {

		test = extent.createTest("Edit Customer Test");

		homePage.masterClick();
		
		Thread.sleep(2000);
		homePage.customerClick();

		System.out.println("Customer clicked");

		customerPage.editLast();

		System.out.println("Customer in Edit Mode");
		

		editCustomerPage.customerName("M/S Mahesh Traders");
		
		Random rand = new Random();
		int num= rand.nextInt(10000);

		editCustomerPage.email("rss11223344"+num+"@gmail.com");

		editCustomerPage.telephone("7878712"+num);

		editCustomerPage.mobileNo("9847234"+num);

		editCustomerPage.address("33 L sukhasin Apartment Pune");

		editCustomerPage.state("Odisha");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editCustomerPage.district("Balasore");

		
		editCustomerPage.taluka("Falsaguda");

		editCustomerPage.submit();

		addCustomerPage.chekEditSubmit();

	}

	@Test(priority = 2)
	public void editItem() {

		homePage = new HomePage(driver);
		test = extent.createTest("Edit Item Test");

//		homePage.masterClick();
		try {
			Thread.sleep(3000);
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

		// editItemPage.uom();
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

		// driver.quit();
	}

	@Test(priority = 3)
	public void editMagazine() throws InterruptedException {

		homePage = new HomePage(driver);

		test = extent.createTest("Add Magazine Test");

//		homePage.masterClick();
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

		Random rand3 = new Random();
        int num= rand3.nextInt(10000);
		
		editMagazinePage.licenceNoInput("BRD232BT2"+num);

		editMagazinePage.magazineDetailInput("Mag/Det/3456/UPD");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editMagazinePage.licenceExpiryInput("05/24/2022");

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

	@Test(priority = 4)
	public void editVehicle() throws InterruptedException {

		test = extent.createTest("Edit Vehicle Test");

//		homePage.masterClick();
		try {
			Thread.sleep(3000);
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
		
		Random rand =new Random();
		int num=rand.nextInt(10000);

		editVehiclePage.licenceNoInput("DL23567P"+num);
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

		// driver.quit();

	}

	@Test(priority = 5)

	public void editCompanyTest() {

		test = extent.createTest("Edit Customer Test");

//		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.companyClick();

		companyPage.editLast();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editCompanyPage.codeInput();

		editCompanyPage.nameInput();

		editCompanyPage.contactPersonInput("Jeff Kiman");

		editCompanyPage.contactNoInput("9191919191");

		editCompanyPage.addressInput("Bikhani Building Sarvodaya nagar");

		editCompanyPage.submit();

		editCompanyPage.submitEditchk();

		// driver.quit();
	}

	@Test(priority = 6)
	public void editTransporter() {

		homePage = new HomePage(driver);

		test = extent.createTest("Add Transporter Test");

//		homePage.masterClick();
//
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.transportClick();

		transporterPage.editLast();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		editTransporterPage.transporterNameInp("Ritwik Transport");
		editTransporterPage.contactPersonInp("Nishant Mohan");
		editTransporterPage.mobileInp("9404950930");
		editTransporterPage.emailInp("dnishant@gmail.com");
		editTransporterPage.address1Inp("204 Shradhannad Apartment Baraskantha");
		editTransporterPage.address2Inp("M G Road Delhi");
		editTransporterPage.pincodeInp("440022");
		editTransporterPage.stateInp("Gujarat");
		editTransporterPage.districtInp("Anand");
		editTransporterPage.submit();

		editTransporterPage.editSubmitchk();

		// driver.quit();
	}

	@Test(priority = 7)
	public void editSecurityAgency() throws InterruptedException {

		homePage = new HomePage(driver);

		test = extent.createTest("Edit Customer Test");

//		homePage.masterClick();
//
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.securityAgencyClick();

		Thread.sleep(2000);
		System.out.println("Before Edit Last");

		securityAgencyPage.editLast();

		System.out.println("After Edit Last");
		Thread.sleep(4000);

		editSecurityAgencyPage.agencyNameInp("Remanisanca Security Services");

		editSecurityAgencyPage.contactPersonInp("Girdhar Vir Gokhale");

		editSecurityAgencyPage.mobileInp("9404950930");

		editSecurityAgencyPage.emailInp("girdhar@gmail.com");

		editSecurityAgencyPage.address1Inp("543 vishant Bagh");

		editSecurityAgencyPage.address2Inp("East Parliament Road");

		editSecurityAgencyPage.stateSelect("Gujarat");

		editSecurityAgencyPage.districtSelect("Anand");

		editSecurityAgencyPage.pinCodeInp("410023");

		// addSecurityAgencyPage

		editSecurityAgencyPage.submit();

		editSecurityAgencyPage.editSubmit();

		// driver.quit();

	}

	@Test(priority = 8)
	public void editSecurityGuard() throws InterruptedException {

		homePage = new HomePage(driver);

		test = extent.createTest("Add SecurityGuard Test");

//		homePage.masterClick();
//
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.securityGuardClick();

		securityGuardPage.editLast();

		Thread.sleep(3000);

		editSecurityGuardPage.guardNameInp("Nirmal Bapat");

		editSecurityGuardPage.agencySelect("Trust Security Services");

		editSecurityGuardPage.address1Inp("546 Nirmala Building");

		editSecurityGuardPage.address2Inp("Vidhya Vilah Krishna Nagar");

		editSecurityGuardPage.stateSelect("Maharashtra");

		editSecurityGuardPage.districtSelect("Beed");

		System.out.println("State District Selected");

		editSecurityGuardPage.pincodeInp("440033");

		editSecurityGuardPage.mobileInp("9730134501");

		editSecurityGuardPage.emailInp("vidhya@gmail.com");

		editSecurityGuardPage.typeInp("9773323211");

		editSecurityGuardPage.idNoInp("LE 23567");

		System.out.println("Pincode Mobile Typeinput Success id no inp");

		editSecurityGuardPage.submit();

		editSecurityGuardPage.editSubmitChk();

		//driver.quit();

	}

	@Test(priority = 9)
	public void editDriver() throws InterruptedException {

		test = extent.createTest("Edit Driver");

		homePage = new HomePage(driver);

//		homePage.masterClick();
//
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.vanDriver();

		driverPage.editLast();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Random rand = new Random();
		int num= rand.nextInt(10000);

		editDriverPage.driverLicenceInput("DL234590"+num);

		editDriverPage.driverNameInput("Vinod Jhirade");

		// editDriverPage.transpTypeSelect("Company");

		editDriverPage.licenceVAlidDate("07/20/2023");

		editDriverPage.hazardLicenceValiDAte("07/23/2022");

		editDriverPage.addressInput("204 Nipane Bhavan Sharda Nivas");

		editDriverPage.mobileInput("9338456431");

		editDriverPage.stateSelect("Gujarat");

		editDriverPage.districtSelect("Anand");

		editDriverPage.submit();
		
		editDriverPage.submitchk();
		
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

				// driver.quit();

			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
