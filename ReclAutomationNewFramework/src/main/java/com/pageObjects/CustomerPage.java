package com.pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerPage {
	
	
	WebDriver driver;
	
	
	By addCustomer = By.xpath("//span[text()=' Add Customer ']");
	
	By editLast = By.xpath("//i[@class='fas fa-pen-alt text-warning']");
	
	
	
	public CustomerPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	

	//--------------------- Actions---------------
	
	
	public void addcustomerClick() {
		
		driver.findElement(addCustomer).click();
		
	}
	
	public void editLast() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
			
		
		List<WebElement> myElements=driver.findElements(editLast);
		
		System.out.println(myElements.size());
		
		int last= myElements.size()-1;
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
		
		js.executeScript("arguments[0].scrollIntoView();",((WebElement) myElements.get(last)) );
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((WebElement) myElements.get(last)).click();
		

	}
	
	
}
