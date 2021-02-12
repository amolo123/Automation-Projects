package practicePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage1 {
	
	WebDriver driver;
	
	
	By username = By.xpath("//input[@placeholder='Username']");
	
	By password = By.xpath("//input[@placeholder='Password']");
	
	By loginbutton = By.xpath("//input[@value='LOGIN']");
	
	By checkSuccessLogin = By.xpath("//div[text()='Products']");
	
	public LoginPage1(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	//-----------Actions------------
	
	
	public void usernameInput(String uname) {
		
		driver.findElement(username).sendKeys(uname);
	}
	
	
	
	public void passwordInput(String pword) {
		
		driver.findElement(password).sendKeys(pword);
	}
	
	
	
    public void loginClick() {
    	
    	driver.findElement(loginbutton).click();
    }
    
    
    public void chkSuccees() {
    	
    	String actual = driver.findElement(checkSuccessLogin).getText();
        
    	String expected = "Products"; 
    	
        Assert.assertEquals(actual, expected);
    
    
    }
    
    
}