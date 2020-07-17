package com.library;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.CharMatcher;
import com.tests.StartTest;

public class CalenderHandle extends StartTest {

	WebDriver driver;

	public static void calenderHandleDate(WebDriver driver, String selectdate) throws InterruptedException {

		System.out.println("Clicked on the date field");

		// Please enter date in month/day/year : mm/dd/yy
		// String selectdate = "07/10/2018";
		
		//==============DATE CONVERSION=======================

		@SuppressWarnings("deprecation")
		Date d = new Date(selectdate);
		SimpleDateFormat dt = new SimpleDateFormat("MMMM/dd/yyyy");
		String date = dt.format(d);

		System.out.println(date);

		String split[] = date.split("/");
		System.out.println(split[0] + " " + split[1] + " " + split[2]);

		String month = split[0];
		System.out.println(month);

		String day = split[1];
		System.out.println(day);

		String year = split[2];
		System.out.println(year);
		
		//===================== CREATING DAY =========================
		
		String day2=CharMatcher.is('0').trimLeadingFrom(day);
		
        System.out.println("DAY IS");
		String firstpart = "//span[text()='";

		String secondpart = day2 +"']";

		String finalpart = firstpart + secondpart;
		System.out.println("Final PART :"+finalpart);
		
		// ------------------------------------------------
		
		//span[text()='22']

		//// select[@class='slds-select']

		// div[@class='slds-datepicker__filter slds-grid']//div//select
		
		
		////button[@class='current ng-star-inserted']
		
		
		
		//=========================MONTH CHECKING AND SELECTING=====================================
		
		Thread.sleep(2000);

		

		
		
		while (!driver.findElement(By.xpath("//button[@class='current ng-star-inserted']")).getText().equals(month)) {
			
			System.out.println("Inside LOOP");

			driver.findElement(By.xpath("//span[text()='›']")).click();
			Thread.sleep(1800);
			

		}
		
		
		//====================YEAR===========================
		
		String yearfirstPart = "//span[text()='";
		
		String yearSecondPart = year+"']";
		
		String finalYearPart = yearfirstPart+yearSecondPart;
		
		System.out.println(finalYearPart);
		
		
		String monthFirstPath = "//span[text()='";
		
		String monthSecondPath = month+"']";
		
		String finamMonthPath = monthFirstPath+monthSecondPath;
		
		System.out.println(finamMonthPath);

		WebElement yearelement = driver.findElement(By.xpath("//button[@class='current']"));
		System.out.println(yearelement.getText());
		
		if (!yearelement.getText().equals(year)) {
			
			yearelement.click();
			
			driver.findElement(By.xpath(finalYearPart)).click();
			
			driver.findElement(By.xpath(finamMonthPath)).click();
			
			System.out.println("//=======YEAR Clicked===========");
		}

		Thread.sleep(2000);
		
		
		//We
		List<WebElement> myElements=driver.findElements(By.xpath(finalpart));
		
		
		System.out.println("The size is:"+myElements.size());
		for(int i=0;i<myElements.size();i++){
		    System.out.println(myElements.get(i));
		} 
		
	  
		//int number = Integer.parseInt(s)
		//String day2=CharMatcher.is('0').trimLeadingFrom(day);
		//System.out.println(day2);
		if (myElements.size()>1 && Integer.parseInt(day2)>20) {
			
			System.out.println("Condition success!!");
			((WebElement) myElements.get(1)).click();
			
			
			Thread.sleep(1200);
			
			//driver.findElement(By.xpath(finalpart)).click();
			
		}
	
		else {
			
			((WebElement) myElements.get(0)).click();
		}
		
		
		
		//driver.findElement(By.xpath(finalpart)).click();
		
		System.out.println("Date Clicked");

		//// h2[@aria-live='assertive']

		// date pick
		//// table/tbody/tr/td[@aria-disabled='false']/span[text()=1]

	}
	
	
	
	
	
	
	
}
