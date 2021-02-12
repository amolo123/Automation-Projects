package com.recl.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;

import com.library.ExtentReportsClass;
import com.library.Utility;

public class Driver extends ExtentReportsClass {

	public static WebDriver driver;

	public static void initDriver() throws FileNotFoundException {

		Properties proper = new Properties();
		FileInputStream file = new FileInputStream(
				"/home/ankita/git/Automation-Projects/ReclAutomationNewFramework/src/main/java/config.properties");
		try {
			proper.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (driver == null) {

			String browser = "chrome";

			if (browser.equalsIgnoreCase("firefox")) {
				// create firefox instance
				System.setProperty("webdriver.gecko.driver", proper.getProperty("driverpath2"));
				driver = new FirefoxDriver();
			}
			// Check if parameter passed as 'chrome'
			else if (browser.equalsIgnoreCase("chrome")) {
				// set path to chromedriver.exe

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");

				System.setProperty("webdriver.chrome.driver", proper.getProperty("driverpath"));
				// create chrome instance
				driver = new ChromeDriver(options);
			}

			else if (browser.equalsIgnoreCase("headless")) {
				// set path to chromedriver.exe

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.addArguments("headless");

				System.setProperty("webdriver.chrome.driver", proper.getProperty("driverpath"));
				// create chrome instance

			}
		}

	}

	public static void quitDriver(ITestResult result) {

		try {
			if (result.getStatus() == ITestResult.SUCCESS) {

				// Do something here
				System.out.println(result.getName() + "" + "passed **********");
				driver.quit();
			}

			else if (result.getStatus() == ITestResult.FAILURE) {
				// Do something here
				System.out.println(result.getName() + "" + "Failed ***********");
				String desti = Utility.captureScreenshot(driver, result.getName());
				System.out.println(desti);
				String destination = System.getProperty("user.dir") + desti;
				System.out.println("File path is " + destination);
				try {
					test.addScreenCaptureFromPath(destination);
				} catch (Exception e) {
					System.out.println("add Screenshot failure");
				}

				driver.quit();

			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");
				String dest = Utility.captureScreenshot(driver, result.getName());

				test.addScreenCaptureFromPath(dest);

				driver.quit();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
