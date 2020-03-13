package com.library;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.format.CellTextFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReader {
	
	XSSFWorkbook wibii;
	
	XSSFSheet sh1;

	public ExcelReader(WebDriver driver, String filePath) throws IOException {

		File src = new File("/home/ankita/seleniumdata/item.xlsx");

		FileInputStream fis = new FileInputStream(src);

		wibii = new XSSFWorkbook(fis);

		

		int lastrow = sh1.getLastRowNum();
		System.out.println(lastrow);
		
		//return lastrow;
		
	}
	
	
	
	public char[] getData(int sheetNo, int row, int col)
	{
		
	
		sh1 = wibii.getSheetAt(sheetNo);
		char[] data=sh1.getRow(row).getCell(1).getStringCellValue().toCharArray();
	       
	        return data;
		
	}
	
	
	

}
