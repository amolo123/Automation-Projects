package com.pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllPoPage {

	WebDriver driver;
	
	
	By firstRecord= By.xpath("//td[@data-label='Po No']/a");
	
	
	public AllPoPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	//================Actions==================
	
	
	
	public void firstRecordClick() {
		
		//driver.findElement(firstRecord).click();
		
		List <WebElement> myElements =   driver.findElements(firstRecord);
		
		System.out.println(myElements.size());
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
	
		((WebElement) myElements.get(0)).click();
	}
	
	
	
	
}
