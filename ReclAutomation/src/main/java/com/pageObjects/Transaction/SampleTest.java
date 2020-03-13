package com.pageObjects.Transaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	
	
	public final String driverPath = "/usr/bin/chromedriver";
	public WebDriver driver;
	//public WebDriver driver2;
	
	String baseurl="http://recl-qa-web.s3-website.ap-south-1.amazonaws.com/index.html";
	
	By sub = By.xpath("//p[text()='Explosive Expertise since 1979']");
	
	@BeforeMethod
	public void openBrowser(){
		 
		
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver=new ChromeDriver();
	   // driver2=new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS ); 
	   
	    //driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	    System.out.println("Successfully opened the browser");
	    driver.navigate().to(baseurl);
	    driver.manage().window().maximize();
	    
	}
	
	
	@Test(priority=1)
	public void login() {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
 		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(sub));
 		
 		String actual3 = driver.findElement(sub).getText();
 		System.out.println(actual3);
 		
 		String message = "Explosive Expertis";
 		Assert.assertEquals(actual3, message);
 		System.out.println("Assert success submit success");
		
		
	}
	
	
	

}
