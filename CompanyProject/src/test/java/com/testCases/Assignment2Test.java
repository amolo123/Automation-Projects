package com.testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.library.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Test {

	public WebDriver driver;

	String baseurl = "https://www.triphobo.com/";

	@BeforeTest
	public void openBrowser() throws IOException {

		// set path to chromedriver.exe
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// create chrome instance
		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		System.out.println("Successfully opened the browser");

		// go to triphobo.com website
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void triphobo() throws InterruptedException, AWTException {

		// Click on "PLAN YOUR NEXT VACATION" button on the homepage

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Plan Your Next Vacation']")));
		driver.findElement(By.xpath("//a[text()='Plan Your Next Vacation']")).click();

		// Type Where do you want to go? field, Houston in Texas
		wait.until(ExpectedConditions
				.presenceOfAllElementsLocatedBy(By.xpath("//input[@class='input-control js_city_search']")));

		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//input[@class='input-control js_city_search']"));
		ele.sendKeys("Houston");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='city-listing city-list']")));
		WebElement ele2 = driver.findElement(By.xpath("//div[@class='city-listing city-list']"));
		act.moveToElement(ele2).sendKeys(Keys.DOWN, Keys.ENTER).build().perform();

		// Select Start and End date of your journey
		driver.findElement(By.xpath("//span[@class='start-date-control']")).click();

		driver.findElement(By.xpath(
				"//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-month='11']/a[text()='8']"))
				.click();

		driver.findElement(By.xpath(
				"//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-month='11']/a[text()='24']"))
				.click();

		// Click on button "Start Planning"
		driver.findElement(By.xpath("//span[@class='button p-color full-width start-planning']")).click();

		// Click on "Next - About Your Trip"
		driver.findElement(By.xpath("//div[text()='About Your Trip']")).click();

		// Click on "Suggest an itinerary with "Things to do ""
		driver.findElement(By.xpath("//div[@class='profile select-profile-3 ']")).click();

		driver.findElement(By
				.xpath("//input[@class='input-control js_calendar_control js_custom_route_arrive_date hasDatepicker']"))
				.click();

		act.moveByOffset(200, 200).contextClick();

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='transportation--l']")));

		driver.findElement(By.xpath("//a[text()='9']")).click();

		// Click on "Next" thrice

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='transportation--l']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='icon-transportation-h']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='to']")));
		driver.findElement(By.xpath("//div[@class='custom-route-form js_custom_route_form']//span[text()='Next']"))
				.click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='next-pri-btn']//span[@class='icon-angle-left']")));
		driver.findElement(By.xpath("//div[@class='custom-route-form js_custom_route_form']//span[text()='Next']"))
				.click();

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='p-size add-a-accomodation']")));
		driver.findElement(By.xpath("//div[@class='next-pri-btn']/span[text()='Next']")).click();

		// Click on "Wandering Solo"

		driver.findElement(By.xpath("//div[@class='entry-points solo-point  ']")).click();

		// Clicking on Next Trip Overview

		driver.findElement(By.xpath("//span[@class='next-button js_city_step_move next-btn-dsk']//span[text()='Next']"))
				.click();

		// disable the note
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Disclaimer']")));
		driver.findElement(By.xpath("//span[@class='icon-close']")).click();

		// Clicking on Editable View
		driver.findElement(By.xpath("//span[text()='Editable view']")).click();
        
		
		WebElement src = driver.findElement(By.xpath("//div[@title='Childrens Museum Of Houston']"));
		WebElement dest = driver.findElement(By.xpath("//div[@title='Museum Of Fine Arts Houston']"));
		//Dragging Childrens museum to 3rd day
		Thread.sleep(7000);
		Robot robot = new Robot();
		//robot.mousePress(InputEvent.BUTTON1_MASK);
		Point coordinates = driver.findElement(By.xpath("//div[@title='Childrens Museum Of Houston']")).getLocation();
		Point coordinates2 = driver.findElement(By.xpath("//div[@title='Museum Of Fine Arts Houston']")).getLocation();
		 System.out.println(coordinates2);
		 System.out.println(coordinates);
		robot.mouseMove(1047, 887);
		robot.keyPress(InputEvent.BUTTON1_MASK);
		robot.mouseMove(720, 886);
		robot.keyPress(InputEvent.BUTTON1_MASK);

		//		//act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
//		//act.clickAndHold(src).moveToElement(dest).release().build().perform();
////		System.out.println("Clckand hold success");
////		act.moveToElement(dest);
////		System.out.println("movesuccess");
////		act.release().build().perform();
//		//act.dragAndDropBy(src, 890, 1107).build().perform();
		
		
		// Save Plan
		driver.findElement(By.xpath("//span[text()='Save Plan ']")).click();

		// Finish Planning
		driver.findElement(By.xpath("//span[text()='Finish Planning']")).click();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		try {
			if (result.getStatus() == ITestResult.SUCCESS) {

				// Do something here
				System.out.println(result.getName() + "" + "passed **********");
			}

			else if (result.getStatus() == ITestResult.FAILURE) {
				// Do something here
				System.out.println(result.getName() + "" + "Failed ***********");
				String desti = Utility.captureScreenshot(driver, result.getName());
				System.out.println(desti);
				String destination = System.getProperty("user.dir") + desti;
				System.out.println("File path is " + destination);
				try {

				} catch (Exception e) {
					System.out.println("add Screenshot failure");
				}
			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");
				Utility.captureScreenshot(driver, result.getName());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	
	}	
	
}
