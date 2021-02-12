package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddSecurityAgencyTestDD extends StartTest {

	@Test(priority = 1)
	public void addSecurityAgency() throws IOException {

		homePage.masterClick();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.securityAgencyClick();

		File src = new File("/home/ankita/seleniumdata/securityagency.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			String agencyName = cell.toString();
			System.out.println(agencyName);

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
			String state = cell.toString();
			System.out.println(state);

			cell = sh1.getRow(i).getCell(8);
			String dist = cell.toString();
			System.out.println(dist);

			cell = sh1.getRow(i).getCell(9);
			String pin = cell.toString();
			System.out.println(pin);

			securityAgencyPage.addSecurityAgencyClick();
			try {

				addSecurityAgencyPage.agencyNameInp(agencyName);

				addSecurityAgencyPage.contactPersonInp(contper);

				addSecurityAgencyPage.mobileInp(mob);

				addSecurityAgencyPage.emailInp(email);

				addSecurityAgencyPage.address1Inp(address1);

				addSecurityAgencyPage.address2Inp(address2);

				addSecurityAgencyPage.stateSelect(state);

				addSecurityAgencyPage.districtSelect(dist);

				addSecurityAgencyPage.pinCodeInp(pin);

				// addSecurityAgencyPage

				addSecurityAgencyPage.submit();

				addSecurityAgencyPage.submitchk();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO" + i);
				continue;

			}

			driver.quit();

		}

	}

}
