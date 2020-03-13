package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateGateInEntryPage {
	
	public WebDriver driver;
	
	By tokenNo = By.xpath("//ng-select[@formcontrolname='tokenNo']");
	
	By submit = By.xpath("//button[@type='submit']");
	
	By drivername = By.xpath("//ng-select[@formcontrolname='driver']");
	
	By re11status = By.xpath("//select[@formcontrolname='re11Status']");
	
	By yes = By.xpath("//input[@formcontrolname='re11Ok']");
	
	By no = By.xpath("//input[@formcontrolname='re11Ok']");
	
	By submitinnerform = By.xpath("//button[text()=' Submit ']");
	
	
	public CreateGateInEntryPage (WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	
	//======================Actions==================
	
	
	
	public void tokenNoInput() {

		driver.findElement(tokenNo).click();

	}

	public void submit() {

		driver.findElement(submit).click();

	}

	public void driverNameInput() {

		driver.findElement(drivername).click();

	}

	public void re11StatusSelect() {

		driver.findElement(re11status).click();

	}

	public void re11OkYes() {

		driver.findElement(yes).click();

	}

	public void submitFinal() {

		driver.findElement(submitinnerform).click();

	}
	
	
	

}
