package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	
	//=================MASTER=============================
	
	By master = By.xpath("//span[text()='Master']");
	
	By customer = By.xpath("//a[@href='/master/customer']");
	
	By item = By.xpath("//a[@href='/master/item']");
	
	By magzine = By.xpath("//a[@href='/master/magazine']");

	By vehicle = By.xpath("//a[@href='/master/vehicle']");
	
	By company = By.xpath("//a[@href='/master/company']");
	
	By transporter = By.xpath("//a[@href='/master/transporter']");
	
	By securityagency = By.xpath("//a[@href='/master/security-agency']");
	
	By securityceguard = By.xpath("//a[@href='/master/security-guard']");
	
	By vandriver = By.xpath("//a[@href='/master/van-driver']");
	
	By driverlink= By.xpath("//a[text()=' Driver ']");
	
	By usernavigation = By.xpath("//div[@class='user-nav__user']");
	
	By logout= By.xpath("//a[text()='Logout']");
	
	
//==========================TRANSACTION=====================================	
	
	
	By transaction = By.xpath("//span[text()='Transaction']");
	
	By createNewPO= By.xpath("//a[text()=' Create new po ']");
	
	By allPoPage = By.xpath("//li[@class='ng-tns-c5-0 ng-star-inserted active sidebar-dropdown']//a[text()=' All PO  ']");
	
    
	
//==========================Accessory Click========================
	
	By accessoryClick = By.xpath("//span[text()='Accessory']");
	
	By createNewAccessory = By.xpath("//a[text()=' Create new accessory po ']");
	
	
	
	//===========================Gate=================
	
	
	By gate = By.xpath("//span[text()='Gate']");
	
	By createGateInEnt = By.xpath("//a[text()=' Create Gate In Entry ']");
	
	By createGateInlist = By.xpath("//a[text()=' Gate In List ']");
	
	By gateOutList = By.xpath("//a[text()=' Gate Out List ']");
	
	
	
	
	public HomePage (WebDriver driver) {
		
		
		this.driver= driver;
		
		
	}
	
	
	
	//======================Logout Pane
	
	public void logout() throws InterruptedException {
		
		driver.findElement(usernavigation).click();
		
		Thread.sleep(2000);
		
		driver.findElement(logout).click();
	}
	
	
	
	//===================Master Actions===================
	
	
	
	public void masterClick() {
		
		
		driver.findElement(master).click();
		
	}
	
	public void companyClick() {
		
		driver.findElement(company).click();
	}
	
	
	
	public void customerClick() {
		
		driver.findElement(customer).click();
		
	}
	
	
	public void itemClick() {
		
		driver.findElement(item).click();
		
	}
	
	
	public void magZineClick() {
		
		driver.findElement(magzine).click();
		
	}

	public void vehicleClick() {
	
	driver.findElement(vehicle).click();
	
	}

	public void transportClick() {
		
		driver.findElement(transporter).click();
		
	}

	public void securityAgencyClick() {
	
	driver.findElement(securityagency).click();
	
	}

	public void securityGuardClick() {
	
	driver.findElement(securityceguard).click();
	
    }
	
	public void vanDriver() {
		
	driver.findElement(driverlink).click();	
		
	}
	
	
	
	
	//========================TRANSACTION ACTIONS============
	
	
	public void transactionClick() {
		
		driver.findElement(transaction).click();
		
	}
	
	
	public void createNewPoClick() {
		
		driver.findElement(createNewPO).click();
		
	}
	
	public void allPoClick() {
		
		driver.findElement(allPoPage).click();
	}
	
	
	public void accessoryClick() {
		
		driver.findElement(accessoryClick).click();
		
	}
	//By transporter = By.xpath("//a[@href='/master/company']");
	
	
	public void createNewAccessory() {
		
		driver.findElement(createNewAccessory).click();
	}
	
	
  //===========================Gate==================
	
	public void gate() {
		
		driver.findElement(gate).click();
	}
	
	public void createGateInEntry() {
		
		driver.findElement(createGateInEnt).click();
	}
	
    public void gateInList() {
		
		driver.findElement(createGateInlist).click();
	}
	
	public void gateOut() {
		
		driver.findElement(gateOutList).click();
	}
	
	
	
	
	
	
}
















