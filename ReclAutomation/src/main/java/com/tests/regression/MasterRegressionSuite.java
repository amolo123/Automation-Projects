package com.tests.regression;

import java.io.IOException;
import java.util.Random;


import org.testng.annotations.Test;

import com.pageObjects.AddCompanyPage;
import com.pageObjects.AddCustomerPage;
import com.tests.AddCustomerTest;
import com.tests.AddVehicleTest;
import com.tests.StartTest;


public class MasterRegressionSuite extends StartTest{
	
	
	
	

	@Test(priority = 2)
	public void customerAdding() throws IOException, InterruptedException {
		
		test= extent.createTest("Add Customer Test");

		System.out.println("Before Master Click");

		homePage.masterClick();
		System.out.println("After Master Click");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.customerClick();
		customerPage.addcustomerClick();
		System.out.println("Customer clicked");
		addCustomerPage.customerName("Dinesh Mahale");
		Random rand = new Random();
		int num= rand.nextInt(100000);
		
		int num2 = rand.nextInt(100000);
		addCustomerPage.email("Dinesh"+"tg"+num+"@gmail.com");
		addCustomerPage.mobileNo("9734569"+num2);
	

		addCustomerPage.telephone("9404950930");
	

		addCustomerPage.address("231 Divya apartment Lodhi Road");
		Thread.sleep(2000);
		
		addCustomerPage.state("Maharashtra");
		Thread.sleep(2000);

		addCustomerPage.district("Akola");
		addCustomerPage.taluka("Rahamala");

		addCustomerPage.submit();
		addCustomerPage.chekSubmit();

	}

	@Test(priority = 3)
	public void addItem() {
		
		test= extent.createTest("Add ITEM Test");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.itemClick();

		itemPage.addItemClick();
		addItemPage.typeSelectDrop("Detonators"); // Detonators or Explosive
		addItemPage.shortNameInput("Kamov KA");
		addItemPage.categoryInput();
		

		addItemPage.uom();
		addItemPage.dispOrderInp("3000");
		addItemPage.nameInp("KAMOV BOMBER KA");


		addItemPage.pesocodeInp("23456");
		addItemPage.itemcartageInp("KCCX BDD 234 mm");
		addItemPage.tokenNoInp("0");
	

		addItemPage.itemCatInp("DET");
		addItemPage.qtyInp("10");
		addItemPage.classAndDivInp("3 2");
	

		addItemPage.kgmtrnosuom("24");
		addItemPage.groupDesc("0");
		addItemPage.status();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addItemPage.submit();

		addItemPage.chekItemSubmit();

	}

	@Test(priority = 4)
	public void addMagazine() throws InterruptedException {
		
		test= extent.createTest("Add Magazine Test");

		homePage.magZineClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("magazine clicked");

		magzinePage.addMagzineClick();

		

		addMagazinePage.magazineTypeSelect(2); // 1 for detonators 2 for explosives
		
		Random rand3 = new Random();
        int num= rand3.nextInt(10000);
		addMagazinePage.licenceNoInput("BRBT234597"+num);

		addMagazinePage.magazineDetailInput("Mag/Det/3456");

		

		addMagazinePage.licenceExpiryInput("08/28/2020");

	

		addMagazinePage.customerCodeSelect("60003");

		addMagazinePage.customerNameSelect("GANPATI ENTERPRISES");

		

		addMagazinePage.contactNameInput("Rahul Bajaj");

		addMagazinePage.contactNoInput("9730134501");

		addMagazinePage.addressInput("204 Himalkar Road Kashikar");

		addMagazinePage.pinInput("40025");

		

		addMagazinePage.stateSelect("Gujarat");

		addMagazinePage.districtSelect("Amreli");

	

		addMagazinePage.talukaInput("Mahalkhera");

		addMagazinePage.itemNameSelect("R-Cord S");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		addMagazinePage.submit();

		addMagazinePage.submitchk();

	}

	@Test(priority = 5)

	public void addVehicle() throws InterruptedException {
		
		test= extent.createTest("Add vehicle Test");
		
		Thread.sleep(2000);

		homePage.vehicleClick();

		vehiclePage.addVehiclePageClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		addVehiclePage.vehicleOwnerSelect("Company"); // 0-company 1- transporter 2-infactory
		

		
		addVehiclePage.vehicleNoInput("MB34-AD-");
		

		addVehiclePage.vehicleDescription("Tatra Truck Six Wheeler");

		addVehiclePage.capacityInput("50000");
	
		
		Random rand =new Random();
		int num=rand.nextInt(10000);

		addVehiclePage.licenceNoInput("DL23567P"+num);
		addVehiclePage.licenceExpDateSelect("03/15/2024");
		

		addVehiclePage.insuranceUpto("04/15/2023");
		addVehiclePage.form38date("04/24/2020");
		

		addVehiclePage.nationalPermitdate("07/24/2020");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		addVehiclePage.submit();
		
		addVehiclePage.submitchk();

	}

	@Test(priority = 6)

	public void addCompanyTest() {
		
		test= extent.createTest("Add Company Test");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.companyClick();

		companyPage.addCompany();

		addCompanyPage.codeInput();

		addCompanyPage.nameInput();

		addCompanyPage.contactPersonInput("Anil Sole");

		addCompanyPage.contactNoInput("9730134501");

		addCompanyPage.addressInput("Address");

		addCompanyPage.stateSelect("Maharashtra");

		addCompanyPage.districtSelect("Akola");

		addCompanyPage.talukaInput("Ramkharadi");

		addCompanyPage.submit();

		addCompanyPage.submitchk();

	}

	@Test(priority = 7)
	public void addTransporter() {
		
		test= extent.createTest("Add Transporter Test");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.transportClick();

		transporterPage.addTransporterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		addTransporterPage.transporterNameInp("Alankrita Transport");
		addTransporterPage.contactPersonInp("Vimal Agrawal");
		addTransporterPage.mobileInp("9730134501");
		addTransporterPage.emailInp("vagrawal@gmail.com");
		addTransporterPage.address1Inp("204 Shradhannad Apartment Baraskantha Road");
		addTransporterPage.address2Inp("M G Road Delhi");
		addTransporterPage.pincodeInp("440025");
		addTransporterPage.stateInp("Haryana");
		addTransporterPage.districtInp("Bhiwani");
		addTransporterPage.submit();

		addTransporterPage.submitchk();

	}

	@Test(priority = 8)
	public void addSecurityAgency() {
		
		test= extent.createTest("Add Security Test");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.securityAgencyClick();

		securityAgencyPage.addSecurityAgencyClick();

		addSecurityAgencyPage.agencyNameInp("Voltaise Security Services");

		addSecurityAgencyPage.contactPersonInp("Ravindra Vir Singh");

		addSecurityAgencyPage.mobileInp("9730134501");

		addSecurityAgencyPage.emailInp("ravindra@gmail.com");

		addSecurityAgencyPage.address1Inp("645 Karol Bagh");

		addSecurityAgencyPage.address2Inp("West Parliament Road");

		addSecurityAgencyPage.stateSelect("Gujarat");

		addSecurityAgencyPage.districtSelect("Anand");

		addSecurityAgencyPage.pinCodeInp("410033");

		// addSecurityAgencyPage

		addSecurityAgencyPage.submit();

		addSecurityAgencyPage.submitchk();

	}

	@Test(priority = 9)
	public void addSecurityGuard() {
		
		test= extent.createTest("Add Security Guard Test");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.securityGuardClick();

		securityGuardPage.addSecurityGuardClick();

		addSecurityGuardPage.guardNameInp("Vimal Dhoke");

		addSecurityGuardPage.agencySelect("Subhash Security Services");

		addSecurityGuardPage.address1Inp("546 Hasbanda Building");

		addSecurityGuardPage.address2Inp("Sai Krishna Nagar");

		addSecurityGuardPage.stateSelect("Bihar");

		addSecurityGuardPage.districtSelect("Arwal");

		System.out.println("State District Selected");

		addSecurityGuardPage.pincodeInp("440012");

		addSecurityGuardPage.mobileInp("9404950930");

		addSecurityGuardPage.emailInp("vimal@gmail.com");

		addSecurityGuardPage.typeInp("9404950930");

		addSecurityGuardPage.idNoInp("BE 23567");

		System.out.println("Pincode Mobile Type input Success id no inp");

		addSecurityGuardPage.submit();

		addSecurityGuardPage.submitChk();

		
	}
	
	
	@Test(priority=10)
	public void addDriver() throws InterruptedException {
		
		test= extent.createTest("Add Driver Test");
		
		homePage.vanDriver();
		
		driverPage.addDriverClick();
		
		addDriverPage.driverLicenceInput("DL2345901BR1223");
		
		addDriverPage.driverNameInput("Nikhil Damle");
		
		addDriverPage.transpTypeSelect("Company");
		
		addDriverPage.licenceVAlidDate("05/22/2023");
		
		addDriverPage.hazardLicenceValiDAte("06/23/2022");
		
		addDriverPage.addressInput("204 Das Auto systems");
		
		addDriverPage.mobileInput("9404950930");
		
		addDriverPage.stateSelect("Maharashtra");
		
		addDriverPage.districtSelect("Beed");
		
		addDriverPage.submit();
		
		
		driver.quit();
	}
	
   
	
	
	

}
