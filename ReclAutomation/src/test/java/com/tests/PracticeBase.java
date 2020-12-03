package com.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.library.Utility;


import practicePageObjects.LoginPage1;

public class PracticeBase {

	public final String driverPath = "/usr/bin/chromedriver";

	public final String driverPath2 = "/usr/bin/geckodriver";

	public WebDriver driver;
	// public WebDriver driver2;
	public static Logger logger;
	String baseurl = "https://www.saucedemo.com/";
	// String baseurl2 ="https://www.webpagetest.org/";

	public LoginPage1 login1;

	// =================Edit Page Objects================

	// public ExtentReports report;
	// public ExtentTest test;
	// ExtentHtmlReporter
	// ExtentReportsClass extentReportsClass;

	@BeforeTest
	public void openBrowser() {

		logger = Logger.getLogger("ReclAutomation");
		PropertyConfigurator.configure("log4j.properties");

		String browser = "chrome";

		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver", driverPath2);
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");

			System.setProperty("webdriver.chrome.driver", driverPath);
			// create chrome instance
			driver = new ChromeDriver(options);
		}

		login1 = new LoginPage1(driver);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		System.out.println("Successfully opened the browser");
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();

		// =====================Edit Page Declared=========

	}

	@Test
	public void LoginTest() {

		login1.usernameInput("standard_user");

		login1.passwordInput("secret_sauce");

		login1.loginClick();
		
		login1.chkSuccees();

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
					// test.addScreenCaptureFromPath(destination);
				} catch (Exception e) {
					System.out.println("add Screenshot failure");
				}
			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");
				String dest = Utility.captureScreenshot(driver, result.getName());

				// test.addScreenCaptureFromPath(dest);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
