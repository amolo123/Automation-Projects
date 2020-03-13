package com.tests.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.pageObjects.AddCompanyPage;
import com.pageObjects.AddCustomerPage;
import com.pageObjects.AddItemPage;
import com.pageObjects.AddMagazinePage;
import com.pageObjects.AddSecurityAgencyPage;
import com.pageObjects.AddSecurityGuardPage;
import com.pageObjects.AddTransporterPage;
import com.pageObjects.AddVehiclePage;
import com.pageObjects.CompanyPage;
import com.pageObjects.CustomerPage;
import com.pageObjects.HomePage;
import com.pageObjects.ItemPage;
import com.pageObjects.LoginPage;
import com.pageObjects.MagzinePage;
import com.pageObjects.SecurityAgencyPage;
import com.pageObjects.SecurityGuardPage;
import com.pageObjects.TransporterPage;
import com.pageObjects.VehiclePage;

public class StartDataDrivenTest {
	
	public final String driverPath = "/usr/bin/chromedriver";
	public WebDriver driver;
	//public WebDriver driver2;
	
	String baseurl="http://recl-qa-web.s3-website.ap-south-1.amazonaws.com/index.html";
	
	
	LoginPage login;
	HomePage homePage;
	CustomerPage customerPage;
	AddCustomerPage addCustomerPage;
	ItemPage itemPage;
	AddItemPage addItemPage;
	MagzinePage magzinePage;
	AddMagazinePage addMagazinePage;
	VehiclePage vehiclePage;
	AddVehiclePage addVehiclePage;
	CompanyPage companyPage;
	AddCompanyPage addCompanyPage;
	TransporterPage transporterPage;
	AddTransporterPage addTransporterPage;
	SecurityAgencyPage securityAgencyPage;
	AddSecurityAgencyPage addSecurityAgencyPage;
	SecurityGuardPage securityGuardPage;
	AddSecurityGuardPage addSecurityGuardPage;
	
	
	
	
	@BeforeTest
	public void openBrowser(){
		 
		
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver=new ChromeDriver();
	   // driver2=new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS ); 
	   
	    //driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	    System.out.println("Successfully opened the browser");
	    driver.navigate().to(baseurl);
	    driver.manage().window().maximize();
	    
	    login = new LoginPage(driver);
	    homePage = new HomePage(driver);
	    customerPage = new CustomerPage(driver);
	    addCustomerPage = new AddCustomerPage(driver);
	    itemPage = new ItemPage(driver);   
	    addItemPage = new AddItemPage(driver);
	    magzinePage = new MagzinePage(driver);
	    addMagazinePage = new AddMagazinePage(driver);
	    vehiclePage = new VehiclePage(driver);
	    addVehiclePage = new AddVehiclePage(driver);
	    companyPage = new CompanyPage(driver);
	    addCompanyPage = new AddCompanyPage(driver);
	    transporterPage = new TransporterPage(driver);
	    addTransporterPage = new AddTransporterPage(driver);
	    securityAgencyPage = new SecurityAgencyPage(driver);
	    addSecurityAgencyPage = new AddSecurityAgencyPage(driver);
	    securityGuardPage = new SecurityGuardPage(driver);
	    addSecurityGuardPage = new AddSecurityGuardPage(driver);
	    
	
	    login.usernameInput("admin@gmail.com");
		login.passwordInput("password");
		
		login.SignInButtonClick();
	    
	   
	}
	
	
	
	
	
	

}
