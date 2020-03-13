package com.pageEditObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditTransporterPage {

	public WebDriver driver;

	By transporterName = By.xpath("//input[@formcontrolname='transporterName']");

	By contactPerson = By.xpath("//input[@formcontrolname='contactPerson']");

	By mobile = By.xpath("//input[@formcontrolname='mobileNo']");

	By email = By.xpath("//input[@formcontrolname='email']");

	By address1 = By.xpath("//input[@formcontrolname='address1']");

	By address2 = By.xpath("//input[@formcontrolname='address2']");

	By pincode = By.xpath("//input[@formcontrolname='pincode']");

	By state = By.xpath("//ng-select[@formcontrolname='state']");

	By district = By.xpath("//ng-select[@formcontrolname='district']");

	By submit = By.xpath("//span[text()=' Submit']");

	By chk6 = By.xpath("//div[@aria-label='Transporter created successfully']");

	By chk7 = By.xpath("//div[@role='alertdialog']");
	public EditTransporterPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public void transporterNameInp(String name) {

		driver.findElement(transporterName).clear();
		driver.findElement(transporterName).sendKeys(name);
	}

	public void contactPersonInp(String contapers) {

		driver.findElement(contactPerson).clear();
		driver.findElement(contactPerson).sendKeys(contapers);
	}

	public void mobileInp(String mob) {

		driver.findElement(mobile).clear();
		driver.findElement(mobile).sendKeys(mob);
	}

	public void emailInp(String email1) {

		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(email1);
	}

	public void address1Inp(String add1) {
		driver.findElement(address1).clear();
		driver.findElement(address1).sendKeys(add1);
	}

	public void address2Inp(String add2) {

		driver.findElement(address2).clear();
		driver.findElement(address2).sendKeys(add2);
	}

	public void pincodeInp(String pin) {

		driver.findElement(pincode).clear();
		driver.findElement(pincode).sendKeys(pin);
	}

	public void stateInp(String stat) {

		driver.findElement(state).click();

		String str1 = stat;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();

	}

	public void districtInp(String dist) {

		driver.findElement(district).click();

		String str1 = dist;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();

	}

	public void submit() {

		driver.findElement(submit).click();

	}

	public void submitchk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk6));

		String actual3 = driver.findElement(chk6).getText();
		System.out.println(actual3);

		String message = "Transporter created successfully";
		Assert.assertEquals(actual3, message);
		System.out.println("Assert success submit success");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void editSubmitchk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk7));

		String actual3 = driver.findElement(chk7).getText();
		System.out.println(actual3);

		String message = "Transporter updated successfully";
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
