package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddCustomerTestDD extends StartTest {

	@Test(priority = 1)

	public void addCompanyTest() throws IOException {

		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.customerClick();

		File src = new File("/home/ankita/seleniumdata/customer.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			String custname = cell.toString();
			System.out.println(custname);

			cell = sh1.getRow(i).getCell(2);
			String email = cell.toString();
			System.out.println(email);

			cell = sh1.getRow(i).getCell(3);
			String mobileno = cell.toString();
			System.out.println(mobileno);

			cell = sh1.getRow(i).getCell(4);
			String telephone = cell.toString();
			System.out.println(telephone);

			cell = sh1.getRow(i).getCell(5);
			String address = cell.toString();
			System.out.println(address);

			cell = sh1.getRow(i).getCell(6);
			String state = cell.toString();
			System.out.println(state);

			cell = sh1.getRow(i).getCell(7);
			String district = cell.toString();
			System.out.println(district);

			cell = sh1.getRow(i).getCell(8);
			String taluka = cell.toString();
			System.out.println(taluka);

			cell = sh1.getRow(i).getCell(9);
			String banknam = cell.toString();
			System.out.println(banknam);

			cell = sh1.getRow(i).getCell(10);
			String accno = cell.toString();
			System.out.println(accno);

			cell = sh1.getRow(i).getCell(11);
			String branchname = cell.toString();
			System.out.println(branchname);

			cell = sh1.getRow(i).getCell(12);
			String ifsc = cell.toString();
			System.out.println(ifsc);

			cell = sh1.getRow(i).getCell(13);
			String panno = cell.toString();
			System.out.println(panno);

			cell = sh1.getRow(i).getCell(14);
			String gstno = cell.toString();
			System.out.println(gstno);

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

				addCustomerPage.district(district);
				addCustomerPage.taluka(taluka);

				addCustomerPage.bankName(banknam);

				addCustomerPage.accountNo(accno);

				addCustomerPage.branchName(branchname);

				addCustomerPage.ifscCode(ifsc);

				addCustomerPage.panNo(panno);

				addCustomerPage.gstNo(gstno);

				addCustomerPage.submit();

				addCustomerPage.chekSubmit();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO" + i);
				continue;

			}

		}

	}

}
