package com.pageEditObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.library.CalenderHandle;

public class EditMagazinePage {
	
	
	WebDriver driver;
	
	By magazineType = By.xpath("//select[@formcontrolname='type']");
	
	By licenceNo = By.xpath("//input[@formcontrolname='licenceNo']");
	
	By licenceExpiry = By.xpath("//input[@formcontrolname='licenceExpiryDate']");
	
	By magazineDetail = By.xpath("//input[@formcontrolname='magazineDetail']");
	
	By dateSelect = By.xpath("//div[@class='bs-calendar-container']//span[text()=25]");
	
	By customerCode = By.xpath("//ng-select[@formcontrolname='customerCd']");
	
	By customerCodeValue = By.xpath("//ng-select[@formcontrolname='customerCd']//div[@class='ng-option ng-star-inserted']/span[text()='60004']");
	
	By customerName = By.xpath("//ng-select[@formcontrolname='customerName']");
	
	By customerNameValue = By.xpath("//ng-select[@formcontrolname='customerName']//div[@class='ng-dropdown-panel-items scroll-host']//span[text()='GANPATI ENTERPRISES']");
	
	By contactName = By.xpath("//input[@formcontrolname='contactName']");
	
	By contactNumber = By.xpath("//input[@formcontrolname='contactNumber']");
	
	By address = By.xpath("//input[@formcontrolname='address']");
	
	
	By pinCode = By.xpath("//input[@formcontrolname='pinCode']");
	
	
	By state = By.xpath("//ng-select[@formcontrolname='state']");
	
	By statevalue = By.xpath("//ng-select[@formcontrolname='state']//div[@class='ng-option ng-star-inserted']/span[text()='Chhattisgarh']");
	
	By district = By.xpath("//ng-select[@formcontrolname='district']");
	
	By districtValue = By.xpath("//ng-select[@formcontrolname='district']//div[@class='ng-option ng-star-inserted']//span[text()='Bastar']");
	
	
	By taluka = By.xpath("//input[@formcontrolname='taluka']");
	
	
	By itemName = By.xpath("//ng-select[@formcontrolname='itemName']//span[@class='ng-arrow-wrapper']");
	
	By itemnameclk= By.xpath("//ng-select[@formcontrolname='itemName']//span[@class='ng-arrow-wrapper']");
	
	By itemNameValue = By.xpath("//ng-select[@formcontrolname='itemName']//span[text()='R-Cord S']");
	
	
	By deleteItem = By.xpath("//button[@class='btn btn-outline-danger border-0 ng-star-inserted' and @type='button']/i");
	
    By addButton = By.xpath("//button[@class='btn btn-outline-primary border-0 ng-star-inserted']");	
	
	By submit = By.xpath("//span[text()=' Submit']");
	
	By chk4 = By.xpath("//div[@aria-label='Magazine created successfully']");
	
	By chk5 = By.xpath("//div[@aria-label='Magazine Updated successfully ']");
	
	
	public EditMagazinePage(WebDriver driver) {

		this.driver = driver;

	}

	public void magazineTypeSelect(int value) {

		Select sel1 = new Select(driver.findElement(magazineType));
		sel1.selectByIndex(value);
	}

	public void licenceNoInput(String lice) {

		driver.findElement(licenceNo).clear();
		driver.findElement(licenceNo).sendKeys(lice);
	}

	public void licenceExpiryInput(String licexpdate) throws InterruptedException {

		driver.findElement(licenceExpiry).click();
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		CalenderHandle.calenderHandleDate(driver, licexpdate);
	}
	
	

	public void magazineDetailInput(String mgzde) {

		driver.findElement(magazineDetail).clear();
		driver.findElement(magazineDetail).sendKeys(mgzde);
	}

	public void customerCodeSelect(String ccode) {

		driver.findElement(customerCode).click();
		String str1= ccode;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();
	}

	public void customerNameSelect(String custname) {

		driver.findElement(customerName).click();
		
		
		String str1= custname;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();
	}

	public void contactNameInput(String cont) {

		driver.findElement(contactName).clear();
		driver.findElement(contactName).sendKeys(cont);
	}
	
	public void contactNoInput(String contactnum) {

		driver.findElement(contactNumber).clear();
		driver.findElement(contactNumber).sendKeys(contactnum);
	}
	

	public void addressInput(String addressin) {
		
		driver.findElement(address).clear();
		driver.findElement(address).sendKeys(addressin);
	}
	
	public void pinInput(String pinin) {
		
		driver.findElement(pinCode).clear();
		driver.findElement(pinCode).sendKeys(pinin);
	}
	
	
	public void stateSelect(String stat) {

		
		driver.findElement(state).click();
		
		
		String str1= stat;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();
		
		
	}

	public void districtSelect(String distr) {

		driver.findElement(district).click();
		
		String str1= distr;
		String str2= "//span[text()='"+str1+"']";
		
		
		driver.findElement(By.xpath(str2)).click();
	}

	public void talukaInput(String talukain) {

		driver.findElement(taluka).clear();
		driver.findElement(taluka).sendKeys(talukain);
	}

	public void itemNameSelect(String ite) {
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		System.out.println("Moved to the item");
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		driver.findElement(itemnameclk).click();
		System.out.println();
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		
		String str1= ite;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();
		
	}

	
	public void deleteItem() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		
		driver.findElement(deleteItem).click();
	}
	
	
	
	public void addItem() {
		
		driver.findElement(addButton).click();
	}
	
		public void submit() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");

		driver.findElement(submit).click();
	}



     public void submitchk() {
    	 
    	WebDriverWait wait = new WebDriverWait(driver, 5);
 		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk4));
 		
 		String actual3 = driver.findElement(chk4).getText();
 		System.out.println(actual3);
 		
 		String message = "Magazine created successfully";
 		Assert.assertEquals(actual3, message);
 		System.out.println("Assert success submit success");
 		try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
    	 
     }
		
     
     public void editsubmitchk() {
    	 
    	 WebDriverWait wait = new WebDriverWait(driver, 5);
 		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk5));
 		
 		String actual3 = driver.findElement(chk5).getText();
 		System.out.println(actual3);
 		
 		String message = "Magazine Updated successfully";
 		Assert.assertEquals(actual3, message);
 		System.out.println("Assert success submit success");
 		try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
    	 
     }

}
