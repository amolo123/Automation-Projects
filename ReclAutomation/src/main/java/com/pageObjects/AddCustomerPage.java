package com.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage {
	
	WebDriver driver;
	
	
	By customerName = By.xpath("//input[@formcontrolname='customerName']");
	
	By email = By.xpath("//input[@formcontrolname='email']");
	
	By telephone = By.xpath("//input[@formcontrolname='telephone']");
	
	By mobileno  = By.xpath("//input[@formcontrolname='mobileNo']");
	
	By address = By.xpath("//textarea[@formcontrolname='address']");
	
	By state = By.xpath("//ng-select[@formcontrolname='state']");
	
	By soption = By.xpath("//span[text()='Gujarat']");
	
	By district = By.xpath("//ng-select[@formcontrolname='district']");
	
	By doption= By.xpath("//div/span[text()='Bharuch']");
	
	By taluka = By.xpath("//input[@formcontrolname='taluka']");
	
	By bankname = By.xpath("//input[@formcontrolname='bankName']");
	
	By accountNo = By.xpath("//input[@formcontrolname='accountNo']");
	
	By branchName = By.xpath("//input[@formcontrolname='branchName']");
	
	By ifscCode= By.xpath("//input[@formcontrolname='ifsc']");
	
	By panNo = By.xpath("//input[@formcontrolname='panNumber']");
	
	By gst = By.xpath("//input[@formcontrolname='gst']");
	
	
	By submit = By.xpath("//button[@type='submit']");
	
	By chk = By.xpath("//div[@aria-label='Customer created successfully']");
	
	By chk2 = By.xpath("//div[@aria-label='Customer Updated successfully ']");
	
	
	public AddCustomerPage(WebDriver driver) {
		
		
		this.driver=driver;
		
	}
	
	
	
	//----------------------Actions----------------
	
	
	public void customerName(String custname) {
		
		
		driver.findElement(customerName).sendKeys(custname);
		
	}
	
	
	public void email(String emailin) {
		
		Random rand = new Random();
		
		int num = rand.nextInt(10000);
		driver.findElement(email).sendKeys(emailin);
		
	}
	
	
	public void telephone(String tele) {
		
		
		driver.findElement(telephone).sendKeys(tele);
		
	}
	
	
	public void mobileNo(String mob) {
		
		driver.findElement(mobileno).sendKeys(mob);
		
	}
	
	public void address(String add) {
		
		driver.findElement(address).sendKeys(add);
	}
	
	public void state(String stat) {
		
		
		driver.findElement(state).click();
		
		String str1= stat;
		String str2= "//span[text()='"+str1+"']";
		
		
		driver.findElement(By.xpath(str2)).click();
		
		
		
	}
	
	public void district(String dist) {
		
		driver.findElement(district).click();
		
		
		String str1= dist;
		String str2= "//span[text()='"+str1+"']";
		
		
		driver.findElement(By.xpath(str2)).click();
		
		
	}
	
	public void taluka(String talukainp) {
		
		driver.findElement(taluka).sendKeys(talukainp);
		
	}
	
	public void bankName(String banknam) {
		
		driver.findElement(bankname).sendKeys(banknam);
	}
	
	public void accountNo(String accno) {
		
		driver.findElement(accountNo).sendKeys(accno);
	}

	public void branchName(String branchname) {
	
	  driver.findElement(branchName).sendKeys(branchname);
	}

	public void ifscCode(String ifsc) {
	
	  driver.findElement(ifscCode).sendKeys(ifsc);
	}
	
	public void panNo(String panno ) {
		
		driver.findElement(panNo).sendKeys(panno);
		
	}
	
	public void gstNo(String gstno) {
		
		driver.findElement(gst).sendKeys(gstno);
	}
	
	
	
	
	public void submit() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");	
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> myElements=driver.findElements(submit);
		
		System.out.println(myElements.size());
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
	
		((WebElement) myElements.get(0)).click();
		
		
	}
	
	public void chekSubmit() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk));
		
		String actual = driver.findElement(chk).getText();
		System.out.println(actual);
		
		String message = "Customer created successfully";
		Assert.assertEquals(actual, message); 
		
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	//================Edit Actions================
	
	
	public void editCustomerName() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(customerName).clear();
		
		driver.findElement(customerName).sendKeys("Viudhuri");
	
	}
	
	
	
	
	
	public void chekEditSubmit() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk2));
		
		String actual2 = driver.findElement(chk2).getText();
		System.out.println(actual2);
		
		String message = "Customer Updated successfully";
		Assert.assertEquals(actual2, message);
		
	
	}
	
	
	
	
	
	
	
	
	
}