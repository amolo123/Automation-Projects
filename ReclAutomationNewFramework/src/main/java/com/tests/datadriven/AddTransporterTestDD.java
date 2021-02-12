package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddTransporterTestDD extends StartTest {

	@Test(priority = 1)
	public void addTransporter() throws IOException {

		homePage.masterClick();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.transportClick();

		File src = new File("/home/ankita/seleniumdata/company.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			String transname = cell.toString();
			System.out.println(transname);

			cell = sh1.getRow(i).getCell(2);
			String contper = cell.toString();
			System.out.println(contper);

			cell = sh1.getRow(i).getCell(3);
			String mob = cell.toString();
			System.out.println(mob);

			cell = sh1.getRow(i).getCell(4);
			String email = cell.toString();
			System.out.println(email);

			cell = sh1.getRow(i).getCell(5);
			String address1 = cell.toString();
			System.out.println(address1);

			cell = sh1.getRow(i).getCell(6);
			String address2 = cell.toString();
			System.out.println(address2);

			cell = sh1.getRow(i).getCell(7);
			String pin = cell.toString();
			System.out.println(pin);

			cell = sh1.getRow(i).getCell(8);
			String state = cell.toString();
			System.out.println(state);

			cell = sh1.getRow(i).getCell(9);
			String dist = cell.toString();
			System.out.println(dist);

			transporterPage.addTransporterClick();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			try {
				addTransporterPage.transporterNameInp(transname);
				addTransporterPage.contactPersonInp(contper);
				addTransporterPage.mobileInp(mob);
				addTransporterPage.emailInp(email);
				addTransporterPage.address1Inp(address1);
				addTransporterPage.address2Inp(address2);
				addTransporterPage.pincodeInp(pin);
				addTransporterPage.stateInp(state);
				addTransporterPage.districtInp(dist);
				addTransporterPage.submit();

				addTransporterPage.submitchk();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO " + i);
				continue;

			}

			driver.quit();
		}
	}
}
