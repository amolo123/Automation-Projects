package com.tests.transaction;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class CreateNewAccessoryPOCompanyTest extends StartTest{
	
	

	@Test(priority=1)
	public void createNewPO() throws IOException {
		
	test=extent.createTest("Create New PO");
	 
	 homePage.accessoryClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	 homePage.createNewAccessory();
	 
	 createNewAccessoryPoPage.companyNameSelect("Maharashtra Explosives Pvt Ltd");
	 
	 createNewAccessoryPoPage.customerNameSelect("GANPATI ENTERPRISES");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.exfactoryRadioButtonSelect();
	 
	 createNewAccessoryPoPage.vehicleNoSelect();
	 
	 createNewAccessoryPoPage.magazineCode("Mag/Det/3456434r");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.re11No("454677");
	 
	 createNewAccessoryPoPage.browseSelect("/home/ankita/Downloads/sample.pdf");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewAccessoryPoPage.re11DateSelect("12-02-2020");
	 
	 createNewAccessoryPoPage.itemSelect("SUPER ELECTRIC DETONATOR(White) 1.5 Mtrs");
	 
	 
	 createNewAccessoryPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.submit();
	 
	 createNewAccessoryPoPage.submitchk();
	 
	 
	 
 }

	
	

}
