package com.pageEditObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.library.CalenderHandle;

public class EditDriverPage {

	WebDriver driver;

	By driverLicence = By.xpath("//input[@formcontrolname='driverLicence']");

	By driverName = By.xpath("//input[@formcontrolname='driverName']");

	By transpType = By.xpath("//select[@formcontrolname='transpType']");

	By liceValidDate = By.xpath("//input[@formcontrolname='driverLicenceValid']");

	By datevalue = By.xpath("//span[text()='24']");

	By hazardLicValueDate = By.xpath("//input[@formcontrolname='hazardLicenceValidityDate']");

	By address = By.xpath("//textarea[@formcontrolname='address']");

	By mobileNo = By.xpath("//input[@formcontrolname='mobileNo']");

	By state = By.xpath("//ng-select[@formcontrolname='state']");

	By district = By.xpath("//ng-select[@formcontrolname='district']");

	By submit = By.xpath("//span[text()=' Submit']");
	
	By submitChk = By.xpath("//div[@role='alertdialog']");

	public EditDriverPage(WebDriver driver) {

		this.driver = driver;
	}

	public void driverLicenceInput(String dlice) {

		Random rand = new Random(1000);
		int ranno = rand.nextInt();

		driver.findElement(driverLicence).clear();
		driver.findElement(driverLicence).sendKeys(dlice + ranno);

	}

	public void driverNameInput(String dname) {

		driver.findElement(driverName).clear();
		driver.findElement(driverName).sendKeys(dname);

	}

	public void transpTypeSelect(String ttype) {

		Select sel1 = new Select(driver.findElement(transpType));
		sel1.selectByValue(ttype);
	}

	public void licenceVAlidDate(String licvaldt) throws InterruptedException {

		driver.findElement(liceValidDate).click();

		CalenderHandle.calenderHandleDate(driver, licvaldt);

	}

	public void hazardLicenceValiDAte(String hazlicevaldt) throws InterruptedException {

		driver.findElement(hazardLicValueDate).click();

		CalenderHandle.calenderHandleDate(driver, hazlicevaldt);

	}

	public void addressInput(String add) {

		driver.findElement(address).clear();
		driver.findElement(address).sendKeys(add);

	}

	public void mobileInput(String mob) {

		driver.findElement(mobileNo).clear();
		driver.findElement(mobileNo).sendKeys(mob);
	}

	public void stateSelect(String stat) {

		driver.findElement(state).click();

		String str1 = stat;
		String str2 = "//span[text()='" + str1 + "']";
		System.out.println(str2);

		driver.findElement(By.xpath(str2)).click();

	}

	public void districtSelect(String dist) {

		driver.findElement(district).click();

		String str1 = dist;
		String str2 = "//span[text()='" + str1 + "']";
		System.out.println(str2);

		driver.findElement(By.xpath(str2)).click();

	}

	public void submit() {

		driver.findElement(submit).click();

	}

public void submitchk() {
		

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(submitChk));
		
		String actual = driver.findElement(submitChk).getText();
		System.out.println(actual);
		
		String message = "Driver updated successfully";
		Assert.assertEquals(actual, message); 
		

	}

}
