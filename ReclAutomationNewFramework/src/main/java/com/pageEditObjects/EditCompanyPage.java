package com.pageEditObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditCompanyPage {

	WebDriver driver;

	By code = By.xpath("//input[@formcontrolname='code']");

	By name = By.xpath("//input[@formcontrolname='name']");

	By contactPerson = By.xpath("//input[@formcontrolname='contactPerson']");

	By contactNo = By.xpath("//input[@formcontrolname='contactNo']");

	By address = By.xpath("//textarea[@formcontrolname='address']");

	By state = By.xpath("//ng-select[@formcontrolname='state']");

	By stateValue = By.xpath("//span[text()='Haryana']");

	By district = By.xpath("//ng-select[@formcontrolname='district']");

	By districtValue = By.xpath("//span[text()='Fatehabad']");

	By taluka = By.xpath("//input[@formcontrolname='taluka']");

	By submit = By.xpath("//span[text()=' Submit']");

	By chk6 = By.xpath("//div[@role='alertdialog']");

	By chk7 = By.xpath("//div[@role='alertdialog']");
	
	//=========== Constructor ==================

	public EditCompanyPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	//============Actions===========================

	public void codeInput() {

		Random rand = new Random();

		int random1 = rand.nextInt(1000000);
		String random2 = String.valueOf(random1);
		driver.findElement(code).clear();
        
		driver.findElement(code).sendKeys(random2);
	}

	public void nameInput() {

		Random rand = new Random();

		int random1 = rand.nextInt(10000);
		String random2 = String.valueOf(random1);

		String newString = "Matihar" + random2;
		
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys(newString);
	}

	public void contactPersonInput(String contname) {
		
		driver.findElement(contactPerson).clear();
		driver.findElement(contactPerson).sendKeys(contname);
	}

	public void contactNoInput(String mobno) {
		
		driver.findElement(contactNo).clear();
		driver.findElement(contactNo).sendKeys(mobno);
	}

	public void addressInput(String addInp) {
		
		driver.findElement(address).clear();
		driver.findElement(address).sendKeys(addInp);
	}

	public void stateSelect(String stat) {

		driver.findElement(state).click();
		String str1 = stat;
		String str2 = "//span[text()='" + str1 + "']";
        
		driver.findElement(By.xpath(str2)).click();
	}

	public void districtSelect(String dist) {

		driver.findElement(district).click();
		String str1 = dist;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();
		
	}

	public void talukaInput(String talinp) {
		
		driver.findElement(taluka).clear();

		driver.findElement(taluka).sendKeys(talinp);
	}

	public void submit() {

		driver.findElement(submit).click();
	}
	

	public void submitchk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk6));

		String actual3 = driver.findElement(chk6).getText();
		System.out.println(actual3);

		String message = "Company created successfully";
		Assert.assertEquals(actual3, message);
		System.out.println("Assert success submit success");

	}

	public void submitEditchk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk7));

		String actual3 = driver.findElement(chk7).getText();
		System.out.println(actual3);

		String message = "Company Updated successfully";
		Assert.assertEquals(actual3, message);
		System.out.println("Assert success submit success");
	

	}

}
