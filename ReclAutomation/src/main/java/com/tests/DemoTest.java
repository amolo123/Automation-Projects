package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest extends StartTest {
	
	
	@Test(priority=1)
	public void pageTest() {
		
		test = extent.createTest("pageTest");
		
		driver.findElement(By.xpath("//a[text()='WebPageTest']"));
		
	
			
			WebDriverWait wait = new WebDriverWait(driver, 1);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='WebPageTest']")));
			
			String actual3 = driver.findElement(By.xpath("//a[text()='WebPageTest']")).getText();
	 		System.out.println(actual3);
	 		
	 		String message = "Explosive Expertise since 1973";
	 		Assert.assertEquals(actual3, message);
	 		System.out.println("Assert success submit success");
	 		

		
		
	}
	
	

}
