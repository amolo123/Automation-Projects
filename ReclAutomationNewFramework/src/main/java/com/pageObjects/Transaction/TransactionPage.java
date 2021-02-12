package com.pageObjects.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tests.StartTest;

public class TransactionPage {

	WebDriver driver;
	
	
	By createNewPO = By.xpath("");
	

	By companyName= By.xpath("//ng-select[@formcontrolname='companyId']");
	
	By customerName = By.xpath("//ng-select[@formcontrolname='customerId']");
	
	By magzineCode = By.xpath("//ng-select[@formcontrolname='magazine']");
	
	By dispatchMode = By.xpath("//input[@value='Company']");
	
	By vehicleDetailCompany = By.xpath("//input[@value='Company']");
	
	By re11Number = By.xpath("//input[@formcontrolname='re11No']");
	
	By re11Date= By.xpath("//input[@formcontrolname='re11Date']");
	
	
	
}
