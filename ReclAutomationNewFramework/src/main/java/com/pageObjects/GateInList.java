package com.pageObjects;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GateInList {
	
	public WebDriver driver;
	
	By gateOutClick = By.xpath("//a[text()=' Create Gate Out Entry ']");
	
	By vehNoInput = By.xpath("//input[@formcontrolname='tokenNo']");
	
	By submit1 = By.xpath("//span[text()='Submit']");
	
	By subChk = By.xpath("");
	
	//=====================Manage Van gate Out==============
	
	
	By securityguard = By.xpath("//ng-select[@formcontrolname='securityGuard']");
	
	By secGfirstVal= By.xpath("//div[@class='ng-option ng-star-inserted']");
	
	By loadedWeight = By.xpath("//input[@formcontrolname='loadedWeight']");
	
	By vanStatus = By.xpath("//select[@formcontrolname='vanStatus']");
	
	By submit = By.xpath("//button[@type='submit']");
	
	public GateInList(WebDriver driver) {
		
		this.driver =driver;
	}
	
	
	public void gateOutClick() {
		
		List <WebElement> myElements = driver.findElements(gateOutClick);
		
		((WebElement) myElements.get(0)).click();
	}
	
	
	public void vehNoInput() throws IOException {
		
		driver.findElement(vehNoInput).click();
		
		File file = new File("out.txt");//full file path URL
		String absolutePath = file.getAbsolutePath();
		
		
		String content = FileUtils.readFileToString(new File(absolutePath), StandardCharsets.UTF_8);
		
		System.out.println(content);
		
		driver.findElement(vehNoInput).sendKeys(content);
		
	}
	
	
	public void submit1() {
		
		driver.findElement(submit1).click();
	}
	
	
	public void securityGuardSelect() {
		
		driver.findElement(securityguard).click();
		
		List <WebElement> myElements = driver.findElements(secGfirstVal);
		
		((WebElement) myElements.get(0)).click();
		
		//sel1.selectByIndex(1);
		
	}
	
	
	public void loadedWeight() {
		
		driver.findElement(loadedWeight).sendKeys("3000");
	}
	
	
	public void vanStatusSelect() {
		
		Select sel1 = new Select(driver.findElement(vanStatus));
		sel1.selectByIndex(1);
	}
	
	
	public void submitClick() {
		
	   driver.findElement(submit).click();
	}

	
	
}
