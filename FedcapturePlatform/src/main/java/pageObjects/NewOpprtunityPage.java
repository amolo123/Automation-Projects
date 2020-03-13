package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewOpprtunityPage {

	
	WebDriver driver;
	
	
	By taskOrder = By.xpath("//span[text()='Task Order']");
	
	
	
	By quickTurn = By.xpath("//span[text()='Quick Turn']");
	
	By regular= By.xpath("//span[text()='Regular']");
	
	By next = By.xpath("//span[text()='Next']");
	
	By cancel = By.xpath("//div[@data-aura-class='forceChangeRecordTypeFooter']/button/span[text()='Cancel']");
	
	
	
	public  NewOpprtunityPage(WebDriver driver) {
		
	
		this.driver=driver;
		
	}
	
	
	// -------------Actions----------------
	
	public void taskOrderClick() {
		
		driver.findElement(taskOrder).click();
		
	}
	
	

	
	public void quickTurn() {
		
		driver.findElement(quickTurn).click();
	}
	

	
	public void nextClick() {
		
		driver.findElement(next).click();
		
	}
	
	
	public void cancelClick() {
		
		driver.findElement(cancel).click();
		
	}
	
	
	public void regularClick() {
		
		
		driver.findElement(regular).click();
	}
	
}
