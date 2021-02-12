package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddSecurityAgencyPage {
	
	WebDriver driver;
	
	By agencyName = By.xpath("//input[@formcontrolname='agencyName']");
	
	By contactPerson = By.xpath("//input[@formcontrolname='contactPerson']");
	
	By mobileNo = By.xpath("//input[@formcontrolname='mobileNo']");
	
	By email = By.xpath("//input[@formcontrolname='email']");
	
	By address1 = By.xpath("//input[@formcontrolname='address1']");
	
	By address2 = By.xpath("//input[@formcontrolname='address2']");
	
	By state = By.xpath("//ng-select[@formcontrolname='state']");
	
	By district = By.xpath("//ng-select[@formcontrolname='district']");
	
	By pincode = By.xpath("//input[@formcontrolname='pincode']");
	
	By submit = By.xpath("//span[text()=' Submit']");
	
	By chk6 = By.xpath("//div[@aria-label='Security agency  created successfully']");
	
	//By agencyName = By.xpath("");
	
	
	public AddSecurityAgencyPage(WebDriver driver) {
		
		
		this.driver=driver;
		
	}
	
	
	
	public void agencyNameInp(String agenNam) {

		driver.findElement(agencyName).sendKeys(agenNam);
	}

	public void contactPersonInp(String contPer) {

		driver.findElement(contactPerson).sendKeys(contPer);
	}

	public void mobileInp(String mob) {

		driver.findElement(mobileNo).sendKeys(mob);
	}

	public void emailInp(String emai) {

		driver.findElement(email).sendKeys(emai);
	}

	public void address1Inp(String add1) {

		driver.findElement(address1).sendKeys(add1);
	}

	public void address2Inp(String add2) {

		driver.findElement(address2).sendKeys(add2);
	}

	public void stateSelect(String sta) {
		
		
		driver.findElement(state).click();
		
		String str1= sta;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();
		
		
	}

	public void districtSelect(String dis) {
		
		

		driver.findElement(district).click();
		
		String str1= dis;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();
		
	}

	public void pinCodeInp(String pin) {

		driver.findElement(pincode).sendKeys(pin);
	}
	
	
	public void submit() {
		
		driver.findElement(submit).click();
	}
	
	
	public void submitchk() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
 		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk6));
 		
 		String actual3 = driver.findElement(chk6).getText();
 		System.out.println(actual3);
 		
 		String message = "Security agency created successfully";
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
