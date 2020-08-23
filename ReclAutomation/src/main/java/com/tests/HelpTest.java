package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.library.Utility;
import com.pageEditObjects.EditCompanyPage;
import com.pageEditObjects.EditCustomerPage;
import com.pageEditObjects.EditDriverPage;
import com.pageEditObjects.EditItemPage;
import com.pageEditObjects.EditMagazinePage;
import com.pageEditObjects.EditSecurityAgencyPage;
import com.pageEditObjects.EditSecurityGuardPage;
import com.pageEditObjects.EditTransporterPage;
import com.pageEditObjects.EditVehiclePage;
import com.pageObjects.AddCompanyPage;
import com.pageObjects.AddCustomerPage;
import com.pageObjects.AddDriverPage;
import com.pageObjects.AddItemPage;
import com.pageObjects.AddMagazinePage;
import com.pageObjects.AddSecurityAgencyPage;
import com.pageObjects.AddSecurityGuardPage;
import com.pageObjects.AddTransporterPage;
import com.pageObjects.AddVehiclePage;
import com.pageObjects.AllPoPage;
import com.pageObjects.CompanyPage;
import com.pageObjects.CreateGateInEntryPage;
import com.pageObjects.CreateNewAccessoryPoPage;
import com.pageObjects.CreateNewPoPage;
import com.pageObjects.CustomerPage;
import com.pageObjects.DriverPage;
import com.pageObjects.GateInList;
import com.pageObjects.HomePage;
import com.pageObjects.ItemPage;
import com.pageObjects.LoginPage;
import com.pageObjects.MagzinePage;
import com.pageObjects.POIntemationPage;
import com.pageObjects.SecurityAgencyPage;
import com.pageObjects.SecurityGuardPage;
import com.pageObjects.TransporterPage;
import com.pageObjects.VehiclePage;

public class HelpTest {
	
	
	public final String driverPath = "/usr/bin/chromedriver";

	public final String driverPath2 = "/usr/bin/geckodriver";

	public WebDriver driver;
	// public WebDriver driver2;

	String baseurl = "http://staging-marketsepeti.devdemo.pro/marketsepeti_staging/";
    String baseurl2 ="https://www.webpagetest.org/";
	
	

	// public ExtentReports report;
	// public ExtentTest test;
	// ExtentHtmlReporter
	// ExtentReportsClass extentReportsClass;

	@BeforeTest
	public void openBrowser() {

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

		// System.setProperty("webdriver.chrome.driver", driverPath);
		// driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver", driverPath2);
		// driver=new FirefoxDriver();

		// driver2=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);

		// driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		System.out.println("Successfully opened the browser");
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();

	    

	}
	
	@Test(priority=1)
	public void enter() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='zip-input']")));
		driver.findElement(By.xpath("//div//div[@class='zip-input']/input")).sendKeys("28309");
		driver.findElement(By.xpath("//button[@id='btnZip']")).click();
		
	}



	
	
	
	

}
