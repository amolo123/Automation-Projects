package com.pageObjects;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.library.CalenderHandle;


public class CreateNewPoPage {
	
	
	WebDriver driver;
	
	By companyName = By.xpath("//ng-select[@formcontrolname='companyId']/div");
	
	By customerName = By.xpath("//ng-select[@formcontrolname='customerId']/div");
	
	By company = By.xpath("//label[text()='Company']");
	
	By exfactory = By.xpath("//label[text()='Ex-factory']");
	
	By exfactVeh = By.xpath("//ng-select[@formcontrolname='vehicleNo']");
	
	By firstVal = By.xpath("//span[@class='ng-option-label ng-star-inserted']");
	
	By magazineCode = By.xpath("//ng-select[@formcontrolname='magazine']");
	
	By re11No = By.xpath("//div[@class='magazine-details card']//input[@formcontrolname='re11No']");
	
	By browse = By.xpath("//input[@type='file']");
	
	By dateValue = By.xpath("//span[text()='21']");
	
	By re11date = By.xpath("//input[@formcontrolname='re11Date']");
	
	By re11qty = By.xpath("//input[@formcontrolname='re11Qty']");
	
	By ordBox= By.xpath("//input[@formcontrolname='orderBox']");
	
	By ordQty= By.xpath("//input[@formcontrolname='orderQty']");
	
	
	By submit = By.xpath("//div[text()=' Submit ']");
	
	By accsub = By.xpath("//span[text()='Submit']");
	
	By subchk = By.xpath("//div[@role='alertdialog']");
	
	By updtsubchk= By.xpath("//div[@role='alertdialog']");
	
	//==========================================
	
	By re11Verify= By.xpath("//input[@formcontrolname='re11Verified']");
	
	By status = By.xpath("//select[@formcontrolname='status']");
	
	By vehicleno = By.xpath("//ng-select[@formcontrolname='vehicleNo']");
	
	By availabilityDate = By.xpath("//input[@formcontrolname='availabilityDate']");
	
	By invNo = By.xpath("//input[@formcontrolname='invoiceNo' ]");
	
	
	By invDate = By.xpath("//input[@formcontrolname='invoiceDate' ]");
	
	By firstVehicle = By.xpath("//ng-select[@formcontrolname='vehicleNo']//span[@class='ng-option-label ng-star-inserted']");
	
	By firstVehExfact= By.xpath("//div[@class='ng-option ng-option-marked ng-star-inserted']//span[@class='ng-option-label ng-star-inserted']");
	
	By goodsReceipt = By.xpath("//input[@formcontrolname='goodsReceiptDate']");
	
	public CreateNewPoPage(WebDriver driver) {
		
		this.driver= driver;
		
	}
	
	
	public void companyNameSelect(String compname) {
		
		
		List<WebElement> myElements=driver.findElements(companyName);
		
		System.out.println(myElements.size());
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
	
		((WebElement) myElements.get(0)).click();
		
		String str1= compname;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();

		//driver.findElement(companyName).sendKeys(compname);

	}

	public void customerNameSelect(String custname) {

		
		driver.findElement(customerName).click();
		
		
		List<WebElement> myElements=driver.findElements(customerName);
		
		System.out.println(myElements.size());
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
	
		((WebElement) myElements.get(0)).click();
		
		String str1= custname;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();

	}

	public void companyRadioButtonSelect() {

		driver.findElement(company).click();

	}

	public void exfactoryRadioButtonSelect() {

		driver.findElement(exfactory).click();

	}

	


	
	public void magazineCode(String magacode) {

		//driver.findElement(magazineCode).
		
		List<WebElement> myElements=driver.findElements(magazineCode);
		
		System.out.println(myElements.size());
		
		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
			
			
			System.out.println(itr.next().getText());
		}
	
		((WebElement) myElements.get(0)).click();
		
		String str1= magacode;
		String str2= "//span[text()='"+str1+"']";
		
		driver.findElement(By.xpath(str2)).click();

	}

	public void re11No(String re11no) {
		
		List <WebElement> ele = driver.findElements(re11No);

		((WebElement) ele.get(0)).sendKeys(re11no);

	}

	public void browseSelect(String pathofpicture) {
		
		List <WebElement> ele = driver.findElements(browse);
		
		((WebElement) ele.get(0)).sendKeys(pathofpicture);

	}
	
	
	public void re11DateSelect(String date) throws InterruptedException {

		driver.findElement(re11date).click();
		
		CalenderHandle.calenderHandleDate(driver, date);
		
		

	}
	
	
	public void re11QtyInp() {
		
		driver.findElement(re11qty).sendKeys("3000");
	}
	
	
	public void orderBox() {
		
		driver.findElement(ordBox).sendKeys("1");
	}
	
	
	public void orderQty() {
		
		driver.findElement(ordQty).sendKeys("3000");
	}
	
	public void submit() {
		
		driver.findElement(submit).click();
	}
	
	
	//=======Update accessory submit
	
	public void sub() {
		
		driver.findElement(accsub).click();
	}
	
	//======================used while update PO========
	
	
	public void re11Verify() {
		
		driver.findElement(re11Verify).click();
	}
	
	
	public void vehicleNoSelect() throws IOException {
		
//		
//		List <WebElement> myElements =   driver.findElements(vehicleno);
//		
//		System.out.println(myElements.size());
//		
//		Iterator<WebElement> itr = myElements.iterator(); while(itr.hasNext()) {
//			
//			
//			System.out.println(itr.next().getText());
//		}
	
		//((WebElement) myElements.get(0)).click();
		driver.findElement(vehicleno).click();
		
		
		List <WebElement> ele = driver.findElements(firstVehicle);
		
		String vehicle = ((WebElement) ele.get(0)).getText();
		
		System.out.println(vehicle);
		try{
		    // Create file 
		    FileWriter fstream = new FileWriter("out.txt");
		    BufferedWriter out = new BufferedWriter(fstream);
		    out.write(vehicle);
		    //Close the output stream
		    out.close();
		    }catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		    }
				((WebElement) ele.get(0)).click(); 
		
				
	}
	
	
	public void availabilityDateSelect(String avilab) throws InterruptedException {
		
		driver.findElement(availabilityDate).click();
		CalenderHandle.calenderHandleDate(driver, avilab);
		
		
	}
	
	public void poStatusSelect(String stat) {
		
		Select sel1 = new Select(driver.findElement(status));
		sel1.selectByVisibleText(stat);
		
	}
	
	
	public void invNoInput(String invno) {
		
		List <WebElement> ele =  driver.findElements(invNo);
		
		((WebElement) ele.get(0)).sendKeys(invno);
		
		
	}
	
	
	public void invDateInput(String date) throws InterruptedException {
		
		
		List <WebElement> ele2 =  driver.findElements(invDate);
		
		((WebElement) ele2.get(0)).click();
		
		CalenderHandle.calenderHandleDate(driver, date);
	}
	
	
	public void goodsReceiptDateSelect(String date) throws InterruptedException {
		
		driver.findElement(goodsReceipt).click();
		
		CalenderHandle.calenderHandleDate(driver, date);
		
	}
	
	
	
	public void submitchk() {
		
  		WebDriverWait wait = new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(subchk));
		
		String actual = driver.findElement(subchk).getText();
		System.out.println(actual);
		actual.length();
		
		Assert.assertEquals("has beed created successfully", actual.substring(actual.length()-"has beed created successfully".length()));
	
     	System.out.println("Assertion Passed");
		
		
	}
	
	public void updateSubmitchk() {
	
		WebDriverWait wait = new WebDriverWait(driver, 8);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(updtsubchk));
		
		String actual = driver.findElement(updtsubchk).getText();
		System.out.println(actual);
		actual.length();
		
		Assert.assertEquals("has beed updated successfully", actual.substring(actual.length()-"has beed updated successfully".length()));
	
     	System.out.println("Assertion Passed");
		
	}
	
	

}
