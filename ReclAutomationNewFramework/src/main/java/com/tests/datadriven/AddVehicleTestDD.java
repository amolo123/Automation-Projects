package com.tests.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.tests.StartTest;

public class AddVehicleTestDD extends StartTest {

	@Test(priority = 1)

	public void addVehicleData() throws IOException, InterruptedException {

		homePage.masterClick();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homePage.vehicleClick();

		File src = new File("/home/ankita/seleniumdata/vehicle.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wibii = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wibii.getSheetAt(0);

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {

			Cell cell;

			cell = sh1.getRow(i).getCell(1);
			String compan = cell.toString();
			System.out.println(compan);

			cell = sh1.getRow(i).getCell(2);
			String vehno = cell.toString();
			System.out.println(vehno);

			cell = sh1.getRow(i).getCell(3);
			String vehdesc = cell.toString();
			System.out.println(vehdesc);

			cell = sh1.getRow(i).getCell(4);
			String capa = cell.toString();
			System.out.println(capa);

			cell = sh1.getRow(i).getCell(5);
			String licin = cell.toString();
			System.out.println(licin);

			vehiclePage.addVehiclePageClick();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.vehicleOwnerSelect(compan); // 0-company 1- transporter 2-infactory
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.vehicleNoInput(vehno);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.vehicleDescription(vehdesc);

			addVehiclePage.capacityInput(capa);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.licenceNoInput(licin);
			addVehiclePage.licenceExpDateSelect("03/02/2021");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.insuranceUpto("04/02/2021");
			addVehiclePage.form38date("05/02/2022");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.nationalPermitdate("05/06/2017");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			addVehiclePage.submit();

		}

		driver.quit();

	}

}
