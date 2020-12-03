package com.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.library.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3Test {

	public WebDriver driver;

	String baseurl = "https://www.google.com/";

	@BeforeTest
	public void openBrowser() throws IOException {

		// set path to chromedriver.exe
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// create chrome instance
		driver = new ChromeDriver(options);

		System.out.println("Successfully opened the browser");
		driver.navigate().to(baseurl);

	}

	@Test(priority = 1)
	public void gmailTest() {

		// Clicked on gmail and opened in new window
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpeninNewTab);

		// Switch Tab

		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));

		// Click on sign in

		List<WebElement> myElements = driver
				.findElements(By.xpath("//div[@class='h-c-header__cta']//a[@ga-event-action='sign in']"));

		System.out.println(myElements.size());

		Iterator<WebElement> itr = myElements.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next().getText());
		}

		((WebElement) myElements.get(0)).click();

		// Login with Gmail
		ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bledel4567");

		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bledel4567");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bledel4567@123");

		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

		// Switch to google tab
		driver.switchTo().window(tab2.get(0));

		// Enter selenium webdriver in 1st tab
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium WebDriver", Keys.ENTER);

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
