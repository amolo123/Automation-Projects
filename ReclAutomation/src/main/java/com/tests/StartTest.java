package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.library.ExtentReportsClass;
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
import com.pageObjects.AddTransporterPage;
import com.pageObjects.AddVehiclePage;
import com.pageObjects.AllPoPage;
import com.pageObjects.CompanyPage;
import com.pageObjects.CreateNewAccessoryPoPage;
import com.pageObjects.CreateNewPoPage;
import com.pageObjects.CustomerPage;
import com.pageObjects.DriverPage;
import com.pageObjects.HomePage;
import com.pageObjects.ItemPage;
import com.pageObjects.LoginPage;
import com.pageObjects.MagzinePage;
import com.pageObjects.SecurityAgencyPage;
import com.pageObjects.SecurityGuardPage;
import com.pageObjects.AddSecurityGuardPage;
import com.pageObjects.TransporterPage;
import com.pageObjects.VehiclePage;

public class StartTest extends ExtentReportsClass {

	public final String driverPath = "/usr/bin/chromedriver";
	
	public final String driverPath2 = "/usr/bin/geckodriver";
	
	public WebDriver driver;
	// public WebDriver driver2;

	String baseurl = "http://recl-qa-web.s3-website.ap-south-1.amazonaws.com/index.html";

	public LoginPage login;
	public HomePage homePage;
	public CustomerPage customerPage;
	public AddCustomerPage addCustomerPage;
	public ItemPage itemPage;
	public AddItemPage addItemPage;
	public MagzinePage magzinePage;
	public AddMagazinePage addMagazinePage;
	public VehiclePage vehiclePage;
	public AddVehiclePage addVehiclePage;
	public CompanyPage companyPage;
	public AddCompanyPage addCompanyPage;
	public TransporterPage transporterPage;
	public AddTransporterPage addTransporterPage;
	public SecurityAgencyPage securityAgencyPage;
	public AddSecurityAgencyPage addSecurityAgencyPage;
	public SecurityGuardPage securityGuardPage;
	public AddSecurityGuardPage addSecurityGuardPage;
	public DriverPage driverPage;
	public AddDriverPage addDriverPage;
	public CreateNewPoPage createNewPoPage;
	public AllPoPage allPoPage;
	public CreateNewAccessoryPoPage createNewAccessoryPoPage;

	// =================Edit Page Objects================
	public EditCompanyPage editCompanyPage;
	public EditCustomerPage editCustomerPage;
	public EditDriverPage editDriverPage;
	public EditItemPage editItemPage;
	public EditMagazinePage editMagazinePage;
	public EditSecurityAgencyPage editSecurityAgencyPage;
	public EditSecurityGuardPage editSecurityGuardPage;
	public EditTransporterPage editTransporterPage;
	public EditVehiclePage editVehiclePage;

	// public ExtentReports report;
	// public ExtentTest test;
	// ExtentHtmlReporter
	// ExtentReportsClass extentReportsClass;

	@BeforeMethod
	public void openBrowser() {
		
		
	String browser = "chrome";
		
		if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
				System.setProperty("webdriver.gecko.driver", driverPath2);
				driver = new FirefoxDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver", driverPath);
				//create chrome instance
				driver = new ChromeDriver();
			}
		
		
		

		//System.setProperty("webdriver.chrome.driver", driverPath);
		//driver = new ChromeDriver();
	
		//System.setProperty("webdriver.gecko.driver", driverPath2);
		//driver=new FirefoxDriver();
		
		// driver2=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);

		// driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
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
		driverPage = new DriverPage(driver);
		addDriverPage = new AddDriverPage(driver);
		createNewPoPage = new CreateNewPoPage(driver);
		allPoPage = new AllPoPage(driver);
		createNewAccessoryPoPage = new CreateNewAccessoryPoPage(driver);

		// =====================Edit Page Declared=========

		editCompanyPage = new EditCompanyPage(driver);
		editCustomerPage = new EditCustomerPage(driver);
		editDriverPage = new EditDriverPage(driver);
		editItemPage = new EditItemPage(driver);
		editMagazinePage = new EditMagazinePage(driver);
		editSecurityAgencyPage = new EditSecurityAgencyPage(driver);
		editSecurityGuardPage = new EditSecurityGuardPage(driver);
		editTransporterPage = new EditTransporterPage(driver);
		editVehiclePage = new EditVehiclePage(driver);

		login.usernameInput("admin@gmail.com");
		login.passwordInput("password");

		login.SignInButtonClick();

	}

}
