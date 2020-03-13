package com.pageEditObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditSecurityGuardPage {

	WebDriver driver;

	By guardName = By.xpath("//input[@formcontrolname='guardName']");

	By agency = By.xpath("//ng-select[@formcontrolname='agency']");

	By state = By.xpath("//ng-select[@formcontrolname='state']");

	By district = By.xpath("//ng-select[@formcontrolname='district']");

	By pincode = By.xpath("//input[@formcontrolname='pincode']");

	By address1 = By.xpath("//input[@formcontrolname='address1']");

	By address2 = By.xpath("//input[@formcontrolname='address2']");

	By uploadphoto = By.xpath("");

	By mobile = By.xpath("//input[@formcontrolname='mobileNo']");

	By email = By.xpath("//input[@formcontrolname='email']");

	By type = By.xpath("//input[@formcontrolname='idType']");

	By idno = By.xpath("//input[@formcontrolname='idNo']");

	By submit = By.xpath("//span[text()=' Submit']");

	By chk6 = By.xpath("//div[@aria-label='Security guard  updated successfully']");
	
	By chk7 = By.xpath("//div[@role='alertdialog']");

	// By guardName= By.xpath("");

	public EditSecurityGuardPage(WebDriver driver) {

		this.driver = driver;

	}

	public void guardNameInp(String guardNm) {

		driver.findElement(guardName).clear();
		driver.findElement(guardName).sendKeys(guardNm);

	}

	public void agencySelect(String agSel) {

		driver.findElement(agency).click();

		String str1 = agSel;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();

	}

	public void address1Inp(String add1) {

		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys(add1);

	}

	public void address2Inp(String add2) {

		driver.findElement(address2).clear();
		driver.findElement(address2).sendKeys(add2);

	}

	public void stateSelect(String statei) {

		driver.findElement(state).click();

		String str1 = statei;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();

	}

	public void districtSelect(String dist) {

		driver.findElement(district).click();

		String str1 = dist;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();

	}

	public void pincodeInp(String pinInp) {

		driver.findElement(pincode).clear();
		driver.findElement(pincode).sendKeys(pinInp);

	}

	public void mobileInp(String mobinp) {

		driver.findElement(mobile).clear();
		driver.findElement(mobile).sendKeys(mobinp);

	}

	public void emailInp(String emai) {

		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(emai);

	}

	public void typeInp(String typei) {

		driver.findElement(type).clear();
		driver.findElement(type).sendKeys(typei);

	}

	public void idNoInp(String id) {

		driver.findElement(idno).clear();
		driver.findElement(idno).sendKeys(id);

	}

	public void submit() {

		driver.findElement(submit).click();

	}

	public void submitChk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk6));

		String actual3 = driver.findElement(chk6).getText();
		System.out.println(actual3);

		String message = "Security guard created successfully";
		Assert.assertEquals(actual3, message);
		System.out.println("Assert success submit success");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void editSubmitChk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk7));

		String actual3 = driver.findElement(chk7).getText();
		System.out.println(actual3);

		String message = "Security guard updated successfully";
		Assert.assertEquals(actual3, message);
		System.out.println("Assert success submit success");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
