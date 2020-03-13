package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	
	By username = By.xpath("//input[@type='email']");
	
	By password = By.xpath("//input[@type='password']");
	
	By signIn = By.xpath("//button[@type='submit']");
	
	By subck=By.xpath("//p[@class='ng-tns-c5-0']");
	
	
		public LoginPage(WebDriver driver) {
		
		
		this.driver = driver;
		
		
	}
	
	
		
	// -------------- Actions---------------------	
		
	
	public void usernameInput(String uname) {
		
		
		driver.findElement(username).sendKeys(uname);
		
		
	}	
	
		
	public void passwordInput(String pword) {
		
		
		driver.findElement(password).sendKeys(pword);
		
		
	}	
		
	
	public void SignInButtonClick() {
		
		
		driver.findElement(signIn).click();;
		
		
	}	
	
	
	public void submitChk() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(subck));
		
		String actual3 = driver.findElement(subck).getText();
 		System.out.println(actual3);
 		
 		String message = "Explosive Expertise since 1979";
 		Assert.assertEquals(actual3, message);
 		System.out.println("Assert success submit success");
 		
 		
 		
 		
	}
		
	
	
}
