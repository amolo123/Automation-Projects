package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddSecurityGuardTestDD extends StartTest {

	@Test(priority = 1)
	public void addSecurityGuard() throws IOException {

		homePage.masterClick();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.securityGuardClick();

		File src = new File("/home/ankita/seleniumdata/securityguard.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			String guardName = cell.toString();
			System.out.println(guardName);

			cell = sh1.getRow(i).getCell(2);
			String agencysel = cell.toString();
			System.out.println(agencysel);

			cell = sh1.getRow(i).getCell(3);
			String add1inp = cell.toString();
			System.out.println(add1inp);

			cell = sh1.getRow(i).getCell(4);
			String add2inp = cell.toString();
			System.out.println(add2inp);

			cell = sh1.getRow(i).getCell(5);
			String state = cell.toString();
			System.out.println(state);

			cell = sh1.getRow(i).getCell(6);
			String dist = cell.toString();
			System.out.println(dist);

//			cell = sh1.getRow(i).getCell(7);
//			String pin = cell.toString();
//			System.out.println(pin);

			double dispord1 = Double.parseDouble(sh1.getRow(i).getCell(7).toString());
			int dispord2 = (int) dispord1;
			String pin = String.valueOf(dispord2);
			System.out.println(pin);

			cell = sh1.getRow(i).getCell(8);
			String mob = cell.toString();
			System.out.println(mob);

			cell = sh1.getRow(i).getCell(9);
			String emai = cell.toString();
			System.out.println(emai);

			cell = sh1.getRow(i).getCell(10);
			String type = cell.toString();
			System.out.println(type);

			cell = sh1.getRow(i).getCell(11);
			String idinp = cell.toString();
			System.out.println(idinp);

			securityGuardPage.addSecurityGuardClick();

			try {

				addSecurityGuardPage.guardNameInp(guardName);

				addSecurityGuardPage.agencySelect(agencysel);

				addSecurityGuardPage.address1Inp(add1inp);

				addSecurityGuardPage.address2Inp(add2inp);

				addSecurityGuardPage.stateSelect(state);

				addSecurityGuardPage.districtSelect(dist);

				System.out.println("State District Selected");

				addSecurityGuardPage.pincodeInp(pin);

				addSecurityGuardPage.mobileInp(mob);

				addSecurityGuardPage.emailInp(emai);

				addSecurityGuardPage.typeInp(type);

				addSecurityGuardPage.idNoInp(idinp);

				System.out.println("Pincode Mobile Typeinput Success id no inp");

				addSecurityGuardPage.submit();

				addSecurityGuardPage.submitChk();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO" + i);
				continue;

			}

		}

	}

}
