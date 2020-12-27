package com.testCases;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErokdaTest {
	
	
	public WebDriver driver;

	String baseurl = "http://www.erokda.in/newinvest/";

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
		
		driver.manage().window().maximize();

	}
	
	
	@Test(priority=1)
	public void test() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.xpath("//a[text()='New Customer? Register']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='mobile_no']")));
		
		Actions act = new Actions(driver);
		WebElement el1 = driver.findElement(By.xpath("//input[@name='mobile_no']"));
		act.moveToElement(el1);
		
		driver.findElement(By.xpath("//input[@name='mobile_no']")).sendKeys("9730134501");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mt@test.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password@123");
		
		driver.findElement(By.xpath("//input[@id='repassword']")).sendKeys("password@123");
		
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='mode']")));
		sel1.selectByValue("1");
		
		
		driver.findElement(By.xpath("//input[@id='chkterms']")).click();
		
		driver.findElement(By.xpath("//input[@name='reg']")).click();
		
		driver.navigate().to("http://www.erokda.in/newinvest/productlist");
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='introjs-button introjs-skipbutton']")));
		
		driver.findElement(By.xpath("//a[@class='introjs-button introjs-skipbutton']")).click();
		
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/p[text()='Filters']")));
		
		WebElement el= driver.findElement(By.xpath("//div[@data-intro='Apply Filters']"));
		act.moveToElement(el);
		
		driver.findElement(By.xpath("//a[@data-target='#mode']")).click();
		
		
		
		driver.findElement(By.xpath("//label[@data-search='Lumpsum']/div")).click();
		
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-intro='Apply Filters']")));
		Thread.sleep(2000);
		act.moveToElement(el);
		
		
		WebElement ele2= driver.findElement(By.xpath("//a[@data-target='#assettype']"));
		act.moveToElement(ele2);
		
		driver.findElement(By.xpath("//a[@data-target='#assettype']")).click();
		System.out.println("Clicked on Asset type");
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@data-target='#Commodity']/div")));
		driver.findElement(By.xpath("//label[@data-target='#Commodity']/div")).click();
		System.out.println("Clicked on Commodity");
		
		
		
//		
//		// Fetching otp
//		Actions act1 = new Actions(driver);
//		//WebElement body = driver.findElement(By.tagName("body"));
//		act1.sendKeys(Keys.CONTROL,"t").build().perform();
//		
//		
//		driver.navigate().to("https://www.google.com/");
//		
//		//driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/#");
//		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
//		
//		//driver.findElement(By.xpath("//ul[@class='h-c-header__cta-list header__nav--ltr']//a[@ga-event-action='sign in']")).click();
//		
//		driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("testaccamol001@gmail.com");
//	
//		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
//		
//		
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
//		
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password@1234");
//		
//		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
//		
//		List <WebElement>  rows = driver.findElements(By.xpath("//tr[@tabindex='-1']"));
//		
//		((WebElement) rows.get(0)).click();
//		
//	    String jr=driver.getPageSource().toString();
//		
//		System.out.println(jr);
		
	}
	
	
	
	
	
	

}
