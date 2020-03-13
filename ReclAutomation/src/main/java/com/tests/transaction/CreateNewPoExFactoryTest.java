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
	 
	 createNewPoPage.companyNameSelect("Maharashtra Explosives");
	 
	 createNewPoPage.customerNameSelect("CHARBHUJA NATH");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 
	 createNewPoPage.exfactoryRadioButtonSelect();
	 
	 createNewPoPage.vehicleNoSelect();
	 
	
	 
	 createNewPoPage.magazineCode("4545454");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.re11No("454677");
	 
	 createNewPoPage.browseSelect("/home/ankita/Pictures/jpeg43.jpg");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 //driver.quit();
	 createNewPoPage.re11DateSelect("03-06-2020");
	 
	 createNewPoPage.re11QtyInp();
	 
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.orderBox();
	 
	 
	 
	 //createNewPoPage.orderQty();
	 
	 try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
	 
	 createNewPoPage.submit();
	 
	 createNewPoPage.submitchk();
	 
	 
	 
 }
	

}
