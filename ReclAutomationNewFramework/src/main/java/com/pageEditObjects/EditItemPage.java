package com.pageEditObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditItemPage {
	
WebDriver driver;
	
	By type = By.xpath("//select[@formcontrolname='type']");
	
	By shortName = By.xpath("//input[@formcontrolname='shortName']");
	
	By category= By.xpath("//input[@formcontrolname='code']");
	
	By uom = By.xpath("//ng-select[@formcontrolname='uom']");
	
	By kgSelect= By.xpath("//span[text()='KG']");
	
	By mtr = By.xpath("//span[text()='Mtr']");
	
	By box = By.xpath("//span[text()='Box']");

	By dispOrder = By.xpath("//input[@formcontrolname='dispOrder']");
	
	By name = By.xpath("//input[@formcontrolname='name']");
	
	By pesocode = By.xpath("//input[@formcontrolname='pesoCode']");
	
	By itemcartage = By.xpath("//input[@formcontrolname='itemCartage']");
	
	By tokennoprefix = By.xpath("//input[@formcontrolname='tokenNoPrefix']");
	
	By itemcategory = By.xpath("//input[@formcontrolname='itemCategory']");
	
	By qtyperbox = By.xpath("//input[@formcontrolname='qtyPerBox']");
	
	By classdivision = By.xpath("//input[@formcontrolname='classDivision']");
	
	By kgperuom = By.xpath("//input[@formcontrolname='kgPerUom']");
	
	By groupdesc = By.xpath("//input[@formcontrolname='groupDesc']");
	
	By active = By.xpath("//label[@for='active']");
	
	By inactive = By.xpath("//label[@for='InActive']");
	
	By submit = By.xpath("//span[text()=' Submit']");
	
	By chk3 = By.xpath("//div[@role='alertdialog']");
	
	
	public EditItemPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	//--------------------------Actions---------------------
	
	
	
	public void typeSelectDrop(String typename) {
		
		Select sel1 = new Select(driver.findElement(type));
		sel1.selectByValue(typename);
		
	}
	
	
	public void shortNameInput(String shortnam) {
		driver.findElement(shortName).clear();
		
		driver.findElement(shortName).sendKeys(shortnam);
	}
	
	
	public void categoryInput() {
		
		
		Random rand = new Random();
		
		int catnumb= rand.nextInt(10000);
		
		String catnum= Integer.toString(catnumb);
		
		driver.findElement(category).clear();
		driver.findElement(category).sendKeys(catnum);
		
	}
	
	
	public void uom() {
		
		driver.findElement(uom).click();
		
		driver.findElement(kgSelect).click();
		
		
	} 
	
	public void dispOrderInp(String dispOrdInp) {
		
		driver.findElement(dispOrder).clear();
		
		driver.findElement(dispOrder).sendKeys(dispOrdInp);
		
		
	} 


	public void nameInp(String naminp) {
		
		driver.findElement(name).clear();
		driver.findElement(name).sendKeys(naminp);
	
   } 

	public void pesocodeInp(String psedcd) {
	
		driver.findElement(pesocode).clear();
		driver.findElement(pesocode).sendKeys(psedcd);
		
	} 
	
	public void itemcartageInp(String itemcartinp) {
	
		driver.findElement(itemcartage).clear();
		driver.findElement(itemcartage).sendKeys(itemcartinp);
	}
	
	public void tokenNoInp(String tokinp) {
	
		driver.findElement(tokennoprefix).clear();
		driver.findElement(tokennoprefix).sendKeys(tokinp);

	} 


	public void itemCatInp(String itemcat) {
	
		driver.findElement(itemcategory).clear();
		driver.findElement(itemcategory).sendKeys(itemcat);
	
	} 
	public void qtyInp(String qty) {
	
		driver.findElement(qtyperbox).clear();
		driver.findElement(qtyperbox).sendKeys(qty);
	} 

	public void classAndDivInp(String classAndDiv) {
	
		driver.findElement(classdivision).clear();
		driver.findElement(classdivision).sendKeys(classAndDiv);
	} 
	
	public void kgmtrnosuom(String kg) {
		
		driver.findElement(kgperuom).clear();
		driver.findElement(kgperuom).sendKeys(kg);
	}
	
	public void groupDesc(String grpdesc) {
		
		driver.findElement(groupdesc).clear();
		driver.findElement(groupdesc).sendKeys(grpdesc);
	} 
	
	public void status() {
		
		driver.findElement(active).click();
	} 

   public void submit() {
	   
	   driver.findElement(submit).click();
	   
   }

   
   public void chekItemSubmit() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(chk3));
		
		String actual3 = driver.findElement(chk3).getText();
		System.out.println(actual3);
		
		String message = "Item updated successfully";
		Assert.assertEquals(actual3, message);
		System.out.println("Assert success submit success");
		
		
		
   }		 

}
