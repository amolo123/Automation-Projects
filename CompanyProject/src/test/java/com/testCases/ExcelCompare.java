package com.testCases;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelCompare {
	
	
	public WebDriver driver;
	
	
	
	@BeforeTest
	public void openBrowser() throws IOException {

		// set path to chromedriver.exe
		WebDriverManager.chromedriver().version("86.0.4240.22").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// create chrome instance
		driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		System.out.println("Successfully opened the browser");

		// Go to http://annauniv.edu/
		//driver.navigate().to();

	}
	
	
	@Test(priority=1)
	public void Excel() throws IOException {
		
		
		String c1="",c2="",c3="";
		String b1="",b2="",b3="";
		
		
		String p1 = System.getProperty("user.dir")+"/myexcel.xlsx";
		String p2 = System.getProperty("user.dir")+"/final.xlsx";
		 System.out.println(p1);
		 System.out.println(p2);
	
		//String src1 ="/CompanyProject/myexcel.xlsx"; 
		//String src2 = "/CompanyProject/final.xlsx";
		
		
		FileInputStream fis = new FileInputStream(p1);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheetAt(0);
		
		int num1 = sh.getLastRowNum();
	
	
	
		
		Cell cell1= sh.getRow(1).getCell(0);
		
		Cell cell2 = sh.getRow(1).getCell(1);
		
		Cell cell3 = sh.getRow(1).getCell(2);
		
		c1 = cell1.toString();
		c2 = cell2.toString();
		c3 = cell3.toString();
	
		

		
		
		
         Cell cell12= sh.getRow(2).getCell(0);
		
		Cell cell22 = sh.getRow(2).getCell(1);
		
		Cell cell32 = sh.getRow(2).getCell(2);
		
		String c12 = cell12.toString();
		String c22 = cell22.toString();
		String c32 = cell32.toString();
		
		
		//System.out.println(c12+c22+c32);
		
		
		
		
        FileInputStream fis1 = new FileInputStream(p2);
		
		XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
		
		XSSFSheet sh1 = wb1.getSheetAt(0);
		
		int num2 = sh.getLastRowNum();
		
		
		
         
		
		Cell cellb1= sh1.getRow(1).getCell(0);
		
		Cell cellb2 = sh1.getRow(1).getCell(1);
		
		Cell cellb3 = sh1.getRow(1).getCell(2);
		
		 b1 = cellb1.toString();
		 b2 = cellb2.toString();
		 b3 = cellb3.toString();
		
	
		

		
		
        Cell cellb12= sh1.getRow(2).getCell(0);
		
		Cell cellb22 = sh1.getRow(2).getCell(1);
		
		Cell cellb32 = sh1.getRow(2).getCell(2);
		
		String b12 = cellb12.toString();
		String b22 = cellb22.toString();
		String b32 = cellb32.toString();
		
		//System.out.println(b12+b22+b32);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(c12);
		System.out.println(c22);
		System.out.println(c32);
		
		
		System.out.println(b12);
		System.out.println(b22);
		System.out.println(b32);
		
		if(c1.equals(b1) && c2.equals(b2)&& c3.equals(b3)) {
			
			System.out.println("The"+c1+" "+c2+" "+c3+" "+"Record is Matching");
			
		}
		else {
			
			System.out.println("The "+c1+" "+c2+" "+c3+" "+"Record is not Matching");
		}
		
		//if()
//		
		if(c12==b12&&c22==b22&&c32==b32) {
			System.out.println("The Record " +c12+" "+c22+" "+c32+" "+ "is Matching");
			
		}
		
	     else {
			
		System.out.println("The Record  "+c12+" "+c22+" "+c32+" "+"is Not Matching");
		}

		
	}
	
	
	
	
	
	
	
	
	

}
