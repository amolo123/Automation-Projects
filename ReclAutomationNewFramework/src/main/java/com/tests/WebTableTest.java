package com.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class WebTableTest extends StartTest {
	
	
	@Test
	public void getFinalName() {
		
		test = extent.createTest("Edit Driver");
		
	
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement ele = driver.findElement(by)
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@name='TableForm']//table[@border='1']//tr/td")));
		//Actions act = new Actions (driver);
		//act.moveToElement();
		List <WebElement> myelements = driver.findElements(By.xpath("//frame"));
		
		System.out.println(myelements.size());
		
		driver.switchTo().frame(2);
		
		
		List <WebElement> myelements2 = driver.findElements(By.xpath("//form[@name='TableForm']//table[@border='1']//tr/td"));
		
		//diffrence -7
		
		String last = ((WebElement) myelements2.get(35)).getText();
		
		System.out.println(last);
		
		//String last=((WebElement) myelements.get(35)).getText();
		
		//System.out.println(last);
		
		
		
		
		
	}
	
	
	

}
