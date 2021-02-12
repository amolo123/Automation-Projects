package com.pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POIntemationPage {
	
	
	WebDriver driver;
	
	By checkbox= By.xpath("//input[@type='checkbox']");
	
	By submit = By.xpath("//span[text()=' Submit ']");
	
	
	

    public POIntemationPage(WebDriver driver) {
    	
    	this.driver = driver;
    }
    
	
	
	//==============Actions==============================
	
	public void lastCheckboxselect() {
		
		List <WebElement> myElements =   driver.findElements(checkbox);
		
		System.out.println(myElements.size());
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
	
		((WebElement) myElements.get(myElements.size()-1)).click();
	}
	
	
	
	public void submit() {
		
		driver.findElement(submit).click();
	}

}
