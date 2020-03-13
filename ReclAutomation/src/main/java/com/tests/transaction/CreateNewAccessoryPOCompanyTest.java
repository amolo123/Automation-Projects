package com.tests.transaction;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class CreateNewAccessoryPOCompanyTest extends StartTest{
	
	

	@Test(priority=1)
	public void createNewPO() {
		
	test=extent.createTest("Create New PO");
	 
	 homePage.accessoryClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	 homePage.createNewAccessory();
	 
	 createNewAccessoryPoPage.companyNameSelect("Maharashtra Explosives");
	 
	 createNewAccessoryPoPage.customerNameSelect("GANPATI ENTERPRISES");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.exfactoryRadioButtonSelect();
	 
	 
	 
	 createNewAccessoryPoPage.magazineCode("Explo-E/HQ/RJ/21/206(E25019)");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.re11No("454677");
	 
	 createNewAccessoryPoPage.browseSelect("/home/ankita/Pictures/jpeg43.jpg");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewAccessoryPoPage.re11DateSelect("12-02-2020");
	 
	 createNewAccessoryPoPage.itemSelect("SUPER ELECTRIC  DETONATOR(Red) 1.5 Mtrs");
	 
	 
	 createNewAccessoryPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewAccessoryPoPage.submit();
	 
	 createNewAccessoryPoPage.submitchk();
	 
	 
	 
 }

	
	

}
