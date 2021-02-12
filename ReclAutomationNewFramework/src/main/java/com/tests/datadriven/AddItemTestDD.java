package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddItemTestDD extends StartTest {

	@Test(priority = 1)
	public void addItem() throws IOException {

		homePage.masterClick();

		homePage.itemClick();

		File src = new File("/home/ankita/seleniumdata/item.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			char[] data1=sh1.getRow(i).getCell(1).getStringCellValue().toCharArray();
			String shortnam = data1.toString();
			System.out.println(shortnam);

			//double dispord1 = Double.parseDouble(sh1.getRow(i).getCell(2).toString());
			
			char[] data2=sh1.getRow(i).getCell(2).getStringCellValue().toCharArray();
			//int dispord2 = (int) dispord1;
			String dispord = String.valueOf(data2);
			System.out.println(dispord);

			cell = sh1.getRow(i).getCell(3);
			String name = cell.toString();
			System.out.println(name);

			double pesocode1 = Double.parseDouble(sh1.getRow(i).getCell(4).toString());
			int pesocode2 = (int) pesocode1;
			String pesocode = String.valueOf(pesocode2);
			System.out.println(pesocode);

			cell = sh1.getRow(i).getCell(5);
			String itemcart = cell.toString();
			System.out.println(itemcart);

			double tokenno1 = Double.parseDouble(sh1.getRow(i).getCell(6).toString());
			int tokenno2 = (int) tokenno1;
			String tokenno = String.valueOf(tokenno2);
			System.out.println(tokenno);

			cell = sh1.getRow(i).getCell(7);
			String itemcat = cell.toString();
			System.out.println(itemcat);

			double qtybox1 = Double.parseDouble(sh1.getRow(i).getCell(8).toString());
			int qtybox2 = (int) qtybox1;
			String qtybox = String.valueOf(qtybox2);
			System.out.println(qtybox);

			cell = sh1.getRow(i).getCell(9);
			String classanddiv = cell.toString();
			System.out.println(classanddiv);

			double kgmtr1 = Double.parseDouble(sh1.getRow(i).getCell(10).toString());
			int kgmtr2 = (int) kgmtr1;
			String kgmtr = String.valueOf(kgmtr2);
			System.out.println(kgmtr);

			double grpdesc1 = Double.parseDouble(sh1.getRow(i).getCell(11).toString());
			int grpdesc2 = (int) grpdesc1;
			String grpdesc = String.valueOf(grpdesc2);
			System.out.println(grpdesc);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			itemPage.addItemClick();
			addItemPage.typeSelectDrop("Detonators");

			try {
				// Detonators or Explosive

				addItemPage.shortNameInput(shortnam);
				addItemPage.categoryInput();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addItemPage.uom();
				addItemPage.dispOrderInp(dispord);
				addItemPage.nameInp(name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addItemPage.pesocodeInp(pesocode);
				addItemPage.itemcartageInp(itemcart);
				addItemPage.tokenNoInp(tokenno);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addItemPage.itemCatInp(itemcat);
				addItemPage.qtyInp(qtybox);
				addItemPage.classAndDivInp(classanddiv);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				addItemPage.kgmtrnosuom(kgmtr);
				addItemPage.groupDesc(grpdesc);
				addItemPage.status();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				addItemPage.submit();

				addItemPage.chekItemSubmit();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("TEST DATA FAILED FOR NO" + i);
				continue;
			}

		}

	}

}
