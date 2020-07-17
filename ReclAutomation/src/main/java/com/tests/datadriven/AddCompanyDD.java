package com.tests.datadriven;


import java.io.IOException;

import org.testng.annotations.Test;

import com.library.Xls_Reader;
import com.tests.StartTest;

public class AddCompanyDD extends StartTest {
	
	Xls_Reader reader;

	@Test(priority = 1)

	 
	
	public void addCompanyTest() throws IOException {
		
		test = extent.createTest("Add Company DD");

		homePage.masterClick();
		homePage.customerClick();

		

		
		reader = new Xls_Reader("/home/ankita/seleniumdata/company.xlsx");
		


		for (int i = 2; i <= reader.getRowCount("Sheet1"); i++) {
			
			
			String custname = reader.getCellData("Sheet1", 1, i);
			String email = reader.getCellData("Sheet1", 2, i);
			String mobileno = reader.getCellData("Sheet1", 3, i);
			String telephone = reader.getCellData("Sheet1", 4, i);
			String address = reader.getCellData("Sheet1", 5, i);
			String state = reader.getCellData("Sheet1", 6, i);
			String dist = reader.getCellData("Sheet1", 7, i);
			String taluka = reader.getCellData("Sheet1", 8, i);
			//String custname = reader.getCellData("Sheet1", 1, i);
			
			
			customerPage.addcustomerClick();
			
			System.out.println("Customer clicked");
			try {
				addCustomerPage.customerName(custname);
				addCustomerPage.email(email);
				addCustomerPage.mobileNo(mobileno);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addCustomerPage.telephone(telephone);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addCustomerPage.address(address);
				addCustomerPage.state(state);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addCustomerPage.district(dist);
				addCustomerPage.taluka(taluka);

				addCustomerPage.submit();
				addCustomerPage.chekSubmit();
				//reader.addColumn("Sheet1", "result");
			  reader.setCellData("Sheet1", "result", i, "Pass");
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO" + i);
				continue;

			}

		}

	}

}
