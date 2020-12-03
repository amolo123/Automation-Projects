package com.tests;






import org.testng.annotations.Test;





public class AddCompanyTest extends StartTest {


	
 
	@Test(priority = 1)

	public void addCompanyTest() {
		//new AddCompanyTest(driver);
		
		//HomePage homePage = new HomePage(driver);
		test= extent.createTest("Add Company Test");
	
		login.SignInButtonClick();
		
		homePage.masterClick();
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

		driver.quit();
	}

	

	
}
