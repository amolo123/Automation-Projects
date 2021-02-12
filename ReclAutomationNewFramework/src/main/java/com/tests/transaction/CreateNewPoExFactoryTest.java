package com.tests.transaction;

import java.io.IOException;

import org.testng.annotations.Test;


import com.tests.StartTest;



public class CreateNewPoExFactoryTest extends StartTest {
	
	
	
	@Test(priority=1)
	public void createNewPO() throws IOException, InterruptedException {
		
	test=extent.createTest("Create New PO");
	 
	 homePage.transactionClick();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
	 homePage.createNewPoClick();
	 
	 //createNewPoPage.companyNameSelect("GANPATI ENTERPRISES");
	 
	 createNewPoPage.customerNameSelect("GANPATI ENTERPRISES");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 
	 createNewPoPage.exfactoryRadioButtonSelect();
	 
	 createNewPoPage.vehicleNoSelect();
	 
	
	 
	 createNewPoPage.magazineCode("E/NC/RJ/22/730(E37454)");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.re11No("454677");
	 
	 createNewPoPage.browseSelect("/home/ankita/Downloads/sample.pdf");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewPoPage.re11DateSelect("07/09/2020");
	 
	 createNewPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.submit();
	 
	 createNewPoPage.submitchk();
	 
	 
	 
 }
	

}
