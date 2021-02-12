package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.tests.StartTest;

public class LoginTestDataDriven extends StartTest{
	

//	public final String driverPath = "/usr/bin/chromedriver";
//	public WebDriver driver;
//	// public WebDriver driver2;
//
	String baseurl = "http://recl-qa-web.s3-website.ap-south-1.amazonaws.com/index.html";
//
//	public LoginPage login;
//	public HomePage homePage;
//	
//	@BeforeMethod
//	public void setUp() {
//		
//
//		login = new LoginPage(driver);
//		homePage = new HomePage(driver);
//		System.setProperty("webdriver.chrome.driver", driverPath);
//	    driver=new ChromeDriver();
//	   // driver2=new ChromeDriver(); 
//	    driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS ); 
//	   
//	    //driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
//	    System.out.println("Successfully opened the browser");
//	   // driver.navigate().to(baseurl);
//	    driver.manage().window().maximize();
//	}
//	
	

	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		
	
		driver.navigate().to(baseurl);

		
		File src = new File("/home/ankita/seleniumdata/login.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {
            
			
			try {
			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			String custname = cell.toString();
			System.out.println(custname);

			cell = sh1.getRow(i).getCell(2);
			String email = cell.toString();
			System.out.println(email);

				login.usernameInput(custname);
				login.passwordInput(email);

				login.SignInButtonClick();
				login.submitChk();
				
				homePage.logout();
				
			}catch(Exception e) {e.printStackTrace();
			
			 System.out.println("The Test Data Fail For Row NO"+i); 
			 
			}

		}
	}

}
