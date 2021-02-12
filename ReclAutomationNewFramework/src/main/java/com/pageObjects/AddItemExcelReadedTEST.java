package com.pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.library.ExcelReader;
import com.tests.StartTest;

public class AddItemExcelReadedTEST extends StartTest {
	
	
	
	@Test
	public void testExcel() throws IOException {
		
		
		ExcelReader excel = new ExcelReader(driver, "/home/ankita/seleniumdata/item.xlsx");
		
		char[] d =excel.getData(0, 1, 1);
		System.out.println(d);
		
	}
//	try {
//
//		File src = new File("/home/ankita/seleniumdata/item.xlsx");
//
//		FileInputStream fis = new FileInputStream(src);
//
//		XSSFWorkbook wibii = new XSSFWorkbook(fis);
//
//		XSSFSheet sh1 = wibii.getSheetAt(0);
//
//		int lastrow = sh1.getLastRowNum();
//		System.out.println(lastrow);
//		
//		List<String> arrName;
//
//		for (int i = 1; i <= lastrow; i++) {
//
//			 arrName = new ArrayList<String>();
//			Row row = sh1.getRow(i);
//			for (int j = 1; j < row.getLastCellNum(); j++) {
//				// Create an object reference of 'Cell' class
//				Iterator cells = row.cellIterator();
//				Cell cell = row.getCell(j);
//				// Add all the cell values of a particular row
//				cell = (XSSFCell) cells.next();
//				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//					System.out.print(cell.getStringCellValue() + ",");
//					arrName.add(cell.getStringCellValue());
//				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
//					System.out.print(cell.getNumericCellValue() + ",");
//					arrName.add(cell.getStringCellValue());
//				} else if(cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
//					arrName.add(""+",");
//
//				}
//
//			}
//			
//			Iterator<String> itr = arrName.iterator();
//	        while(itr.hasNext()){
//	            System.out.println("arrayList values: "+itr.next());
//	           
//	        }
//	     }
//
//	
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	}

}
