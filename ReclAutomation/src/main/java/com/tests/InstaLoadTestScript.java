package com.tests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.library.Utility;

public class InstaLoadTestScript extends StartTest{
	
	public final String driverPath = "/usr/bin/chromedriver";

	public final String driverPath2 = "/usr/bin/geckodriver";

	public WebDriver driver;
	// public WebDriver driver2;
    public static Logger logger;
    
	String baseurl = "https://meet.orangebitsindia.com/";
	
	Random rand = new Random(100000); 
	int counter = 1;

	
	
	@Test(invocationCount =60)
	public void openBrowser() {
		 
		test= extent.createTest("User No / Load :" + counter);
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
			options.addArguments("--disable-infobars");
			
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--headless");
			
			//options.addArguments("user-data-dir=");
			//DesiredCapabilities cap = new DesiredCapabilities();
			
			//options.addArguments("use-fake-device-for-media-stream");
			//options.addArguments("use-fake-ui-for-media-stream");
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			
			
		
				driver= new ChromeDriver(options);
				
				driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);

				// driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
				System.out.println("Successfully opened the browser");
				driver.navigate().to(baseurl);
				driver.manage().window().maximize();
				
		        
			    int num= rand.nextInt();
					
					
				driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Amol"+num);;
			    driver.findElement(By.xpath("//input[@type='submit']")).click();
			        
			   
			    try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    driver.findElement(By.xpath("//button[@aria-label='Listen only']")).click();
				
		
			System.out.println(counter);
			counter++;
		}
 
        
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
                String destination= System.getProperty("user.dir") +desti;
                System.out.println("File path is "+destination);
                try {
				
                }catch(Exception e) {System.out.println("add Screenshot failure");}
			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");
				String dest = Utility.captureScreenshot(driver, result.getName());
                
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
	
	
	

}
