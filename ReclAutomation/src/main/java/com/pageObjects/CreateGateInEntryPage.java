package com.pageObjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateGateInEntryPage {
	
	public WebDriver driver;
	
	By tokenNo = By.xpath("//ng-select[@formcontrolname='tokenNo']");
	
	By submit = By.xpath("//button[@type='submit']");
	
	By drivername = By.xpath("//ng-select[@formcontrolname='driver']");
	
	By driveroptions = By.xpath("//div[@class='ng-option ng-star-inserted']");
	
	By re11status = By.xpath("//select[@formcontrolname='re11Status']");
	
	By yes = By.xpath("//input[@formcontrolname='re11Ok']");
	
	By no = By.xpath("//input[@formcontrolname='re11Ok']");
	
	By submitinnerform = By.xpath("//button[text()=' Submit ']");
	
	
	//====================Create Gate In Entry Page====================
	
	
	
	
	By vanStatus = By.xpath("//select[@formcontrolname='vanStatus']");
	
	By re11Ok = By.xpath("//input[@formcontrolname='re11Ok' and @value='1']");
	
	
	
	public CreateGateInEntryPage (WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	
	//======================Actions==================
	
	
	
	public void tokenNoInput() throws IOException {
	

		driver.findElement(tokenNo).click();
		
		File file = new File("out.txt");//full file path URL
		String absolutePath = file.getAbsolutePath();
		
		
		String content = FileUtils.readFileToString(new File(absolutePath), StandardCharsets.UTF_8);
		
		System.out.println(content);
//		BufferedReader br = new BufferedReader(new FileReader(absolutePath));
//		
//		String str1 = read
//		
//		String st; 
//		  while ((st = br.readLine()) != null) 
//		    System.out.println(st);
//		    String str1 = st;
		  
		  
//		  Scanner sc =new Scanner(absolutePath);
//		  String str1 = sc.nextLine();
//		  System.out.println(str1);
		 //br.close();
		  
		//String str1 = st;
		String str2 = "//span[text()='" + content + "']";
		System.out.println(str2);

		driver.findElement(By.xpath(str2)).click();

	}

	public void submit() {

		driver.findElement(submit).click();

	}

	public void driverNameInput() {

		driver.findElement(drivername).click();
		
		List<WebElement> myElements = driver.findElements(driveroptions);
		
		((WebElement) myElements.get(0)).click();

	}
	
	
	public void vanStatusSelect() {
		
		Select sel1 = new Select(driver.findElement(vanStatus));
		sel1.selectByIndex(1);
	}
	

	public void re11StatusSelect() {

		Select sel1 = new Select(driver.findElement(re11status));
		
         sel1.selectByIndex(1);
	}

	public void re11OkYes() {

		driver.findElement(yes).click();

	}

	public void submitFinal() {

		driver.findElement(submitinnerform).click();

	}
	
	
	

}
