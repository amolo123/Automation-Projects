package com.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.library.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Test {

	public WebDriver driver;

	String baseurl = "http://annauniv.edu/";

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

		// Go to http://annauniv.edu/
		driver.navigate().to(baseurl);

	}

	@Test(priority = 1)
	public void annaAssignment1() {

		// Click on departments
		Actions act = new Actions(driver);
		act.moveByOffset(300, 125).click().build().perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Goto "Faculty Of Civil Engineering" and click on "Institute for Ocean Management"

		WebElement ele = driver.findElement(By.xpath("//a/strong[text()=' Faculty of Civil Engineering ']"));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a/strong[text()=' Faculty of Civil Engineering ']")));
		act.moveToElement(ele).build().perform();

		WebElement ele2 = driver.findElement(By.xpath("//div[@id='menuItemText33']"));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a/strong[text()=' Faculty of Civil Engineering ']")));
		act.moveToElement(ele2).click().build().perform();

		// Verify the page title.

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='images/iomtxt.jpg']")));
		String Actual = driver.getTitle();
		System.out.println(Actual);
		String expected = "Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts";
		Assert.assertEquals(Actual, expected);
		System.out.println("Assert Passed");

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
