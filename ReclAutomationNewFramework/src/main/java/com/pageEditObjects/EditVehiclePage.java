package com.pageEditObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.library.CalenderHandle;

public class EditVehiclePage {

	WebDriver driver;

	By vehicleOwner = By.xpath("//select[@formcontrolname='vehicleOwner']");

	By vehicleNo = By.xpath("//input[@formcontrolname='vehicleNo']");

	By vehicleDescrip = By.xpath("//input[@formcontrolname='vehicleDescription']");

	By customerSelect = By.xpath("//ng-select[@formcontrolname='customer']");

	By transporterSelect = By.xpath("//ng-select[@formcontrolname='transporter']");

	By capacity = By.xpath("//input[@formcontrolname='capacity']");

	By licenceNo = By.xpath("//input[@formcontrolname='licenceNo']");

	By licenceExpDate = By.xpath("//input[@formcontrolname='licenceExpiry']");

	By dateValue = By.xpath("//div[@class='bs-calendar-container']//span[text()='25']");

	By insUpto = By.xpath("//input[@formcontrolname='insuranceDate']");

	By form38date = By.xpath("//input[@formcontrolname='form38Date']");

	By customerList = By.xpath("//ng-select[@formcontrolname='customer']");

	By nationalPermitdate = By.xpath("//input[@formcontrolname='nationalPermitDate']");

	By submit = By.xpath("//span[text()=' Submit']");

	By chk = By.xpath("//div[@aria-label='Vehicle created successfully']");

	By editChk = By.xpath("//div[@aria-label='Vehicle Updated successfully ']");
	

	public EditVehiclePage(WebDriver driver) {
		
		this.driver= driver;
		
	}

	public void vehicleOwnerSelect(String comp) {

		Select sel = new Select(driver.findElement(vehicleOwner));

		sel.selectByVisibleText(comp);

	}

	public void vehicleNoInput(String rando) {

		Random rand = new Random();

		int random = rand.nextInt(100);
		String random1 = String.valueOf(random);
		String random2 = rando + random1;
        
		driver.findElement(vehicleNo).clear();
		driver.findElement(vehicleNo).sendKeys(random2);

	}

	public void vehicleDescription(String vehdesc) {

		driver.findElement(vehicleDescrip).clear();
		driver.findElement(vehicleDescrip).sendKeys(vehdesc);

	}

	public void customerSelect(String custname) {

		driver.findElement(customerList).click();

		String str1 = custname;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();
	}

	public void transporterSelect(String transp) {

		driver.findElement(transporterSelect).click();

		String str1 = transp;
		String str2 = "//span[text()='" + str1 + "']";

		driver.findElement(By.xpath(str2)).click();

	}

	public void capacityInput(String capaci) {
		
		driver.findElement(capacity).clear();

		driver.findElement(capacity).sendKeys(capaci);

	}

	public void licenceNoInput(String licno) {

		driver.findElement(licenceNo).clear();
		driver.findElement(licenceNo).sendKeys(licno);
	}

	public void licenceExpDateSelect(String liceexpdate) throws InterruptedException {

		driver.findElement(licenceExpDate).click();

		CalenderHandle.calenderHandleDate(driver, liceexpdate);
	}

	public void insuranceUpto(String liceinsup) throws InterruptedException {

		driver.findElement(insUpto).click();

		CalenderHandle.calenderHandleDate(driver, liceinsup);
	}

	public void form38date(String form38dt) throws InterruptedException {

		driver.findElement(form38date).click();

		CalenderHandle.calenderHandleDate(driver, form38dt);
	}

	public void nationalPermitdate(String nationperdt) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(nationalPermitdate).click();

		WebElement el = driver.findElement(dateValue);
		Actions actions = new Actions(driver);
		actions.moveToElement(el);

		try {
			CalenderHandle.calenderHandleDate(driver, nationperdt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void submit() {

		driver.findElement(submit).click();

	}

	public void submitchk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk));

		String actual = driver.findElement(chk).getText();
		System.out.println(actual);

		String message = "Vehicle created successfully";
		Assert.assertEquals(actual, message);

	}

	public void editSubmitChk() {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(editChk));

		String actual = driver.findElement(editChk).getText();
		System.out.println(actual);

		String message = "Vehicle Updated successfully";
		Assert.assertEquals(actual, message);
		System.out.println("Assertion passed");

	}

}
