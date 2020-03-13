package com.pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyPage {

	WebDriver driver;

	By addCompany = By.xpath("//span[text()=' Add Company']");

	By editLast = By.xpath("//div[@role='toolbar']//button[@tooltip='Edit Company']");

	public CompanyPage(WebDriver driver) {

		this.driver = driver;
	}

	public void addCompany() {

		driver.findElement(addCompany).click();

	}

	public void editLast() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> myElements = driver.findElements(editLast);

		System.out.println(myElements.size());

		int last = myElements.size() - 1;

		Iterator<WebElement> itr = myElements.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next().getText());
		}

		js.executeScript("arguments[0].scrollIntoView();", ((WebElement) myElements.get(last)));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		((WebElement) myElements.get(last)).click();

	}

}
