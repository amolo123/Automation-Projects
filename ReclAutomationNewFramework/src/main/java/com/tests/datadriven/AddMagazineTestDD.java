package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddMagazineTestDD extends StartTest {

	@Test(priority = 1)
	public void addMagazine() throws IOException, InterruptedException {

		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		homePage.magZineClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("magazine clicked");

		File src = new File("/home/ankita/seleniumdata/magazine.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			double magztype1 = cell.getNumericCellValue();
			int magztype = (int) magztype1;
			System.out.println(magztype);

			cell = sh1.getRow(i).getCell(2);
			String licenno = cell.toString();
			System.out.println(licenno);

			cell = sh1.getRow(i).getCell(3);
			String magzdet = cell.toString();
			System.out.println(magzdet);

			double custcode1 = Double.parseDouble(sh1.getRow(i).getCell(4).toString());
			int custcode2 = (int) custcode1;
			String custcode = String.valueOf(custcode2);
			System.out.println(custcode);

			cell = sh1.getRow(i).getCell(5);
			String custname = cell.toString();
			System.out.println(custname);

			cell = sh1.getRow(i).getCell(6);
			String contname = cell.toString();
			System.out.println(contname);

			double contno1 = Double.parseDouble(sh1.getRow(i).getCell(7).toString());
			int contno2 = (int) contno1;
			String contno = String.valueOf(contno2);
			System.out.println(contno);

			cell = sh1.getRow(i).getCell(8);
			String address = cell.toString();
			System.out.println(address);

			double pincode1 = Double.parseDouble(sh1.getRow(i).getCell(9).toString());
			int pincode2 = (int) pincode1;
			String pincode = String.valueOf(pincode2);
			System.out.println(pincode);

			cell = sh1.getRow(i).getCell(10);
			String state = cell.toString();
			System.out.println(state);

			cell = sh1.getRow(i).getCell(11);
			String district = cell.toString();
			System.out.println(district);

			cell = sh1.getRow(i).getCell(12);
			String taluka = cell.toString();
			System.out.println(taluka);

			cell = sh1.getRow(i).getCell(13);
			String item = cell.toString();
			System.out.println(item);

			magzinePage.addMagzineClick();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			try {

				addMagazinePage.magazineTypeSelect(magztype); // 1 for detonators 2 for explosives

				addMagazinePage.licenceNoInput(licenno);

				addMagazinePage.magazineDetailInput(magzdet);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addMagazinePage.licenceExpiryInput("03/15/2020");

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addMagazinePage.customerCodeSelect(custcode);
				addMagazinePage.customerNameSelect(custname);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addMagazinePage.contactNameInput(contname);

				addMagazinePage.contactNoInput(contno);

				addMagazinePage.addressInput(address);

				addMagazinePage.pinInput(pincode);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addMagazinePage.stateSelect(state);

				addMagazinePage.districtSelect(district);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addMagazinePage.talukaInput(taluka);

				addMagazinePage.itemNameSelect(item);

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addMagazinePage.submit();

				addMagazinePage.submitchk();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO" + i);
				continue;

			}

			driver.quit();

		}

	}

}
