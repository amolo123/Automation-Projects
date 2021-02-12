package com.tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.library.ExtentReportsClass;
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
import com.pageObjects.AddSecurityGuardPage;
import com.pageObjects.TransporterPage;
import com.pageObjects.VehiclePage;
import com.recl.driver.Driver;

public class StartTest extends ExtentReportsClass {

	
	public WebDriver driver;
	// public WebDriver driver2;
    public static Logger logger;
	
    ITestResult result;
	
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
    public GateInList gateInList;
    public CreateGateInEntryPage createGateInEntryPage;
    public POIntemationPage poIntemationPage;
    
    
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
	
	
	protected  StartTest() {
		// TODO Auto-generated constructor stub
	}
	
	

	@BeforeTest
	public void openBrowser() throws IOException {
		
		logger = Logger.getLogger("ReclAutomation");
		PropertyConfigurator.configure("log4j.properties");	
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("/home/ankita/git/Automation-Projects/ReclAutomation/src/main/java/config.properties");
		prop.load(file);
		String uname = prop.getProperty("uname");
		
		String password = prop.getProperty("password");
		
		String baseurl = prop.getProperty("baseurl");
		
		String driverpath = prop.getProperty("driverpath");
		
		String driverpath2 = prop.getProperty("driverpath2");

		String browser = "chrome";

		//Driver.initDriver();
		
		
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver", driverpath2);
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			
			System.setProperty("webdriver.chrome.driver", driverpath);
			// create chrome instance
			driver = new ChromeDriver(options);
		}
		
		
		else if (browser.equalsIgnoreCase("headless")) {
			// set path to chromedriver.exe
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("headless");
			
			System.setProperty("webdriver.chrome.driver", driverpath);
			// create chrome instance
			
		}
		

		// System.setProperty("webdriver.chrome.driver", driverPath);
		// driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver", driverPath2);
		// driver=new FirefoxDriver();

		// driver2=new ChromeDriver();
		
		
		
		//System.out.println(prop.getProperty("uname"));
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
		driverPage = new DriverPage(driver);
		addDriverPage = new AddDriverPage(driver);
		createNewPoPage = new CreateNewPoPage(driver);
		allPoPage = new AllPoPage(driver);
		createNewAccessoryPoPage = new CreateNewAccessoryPoPage(driver);
		gateInList = new GateInList(driver);
		createGateInEntryPage = new CreateGateInEntryPage(driver);
		poIntemationPage = new POIntemationPage(driver);
		
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

		login.usernameInput(uname);
		logger.info(" Enterd email ");
		
		login.passwordInput(password);
		logger.info(" Enterd password ");
		
		login.SignInButtonClick();
		logger.info("Clicked on Sign In  ");

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
				test.addScreenCaptureFromPath(destination);
                }catch(Exception e) {System.out.println("add Screenshot failure");}
			}

			else if (result.getStatus() == ITestResult.SKIP) {

				System.out.println(result.getName() + "" + "Skiped***********");
				String dest = Utility.captureScreenshot(driver, result.getName());
                
				test.addScreenCaptureFromPath(dest);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Driver.quitDriver(result);
		

	}

}
