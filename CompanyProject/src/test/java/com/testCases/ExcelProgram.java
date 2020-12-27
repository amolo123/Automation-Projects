package com.testCases;

import org.testng.annotations.Test;

public class ExcelProgram {
	
	
	Xls_Reader reader;
	
	@Test
	public void testReader()
	{
        
        //reader = new Xls_Reader("/home/ankita/seleniumdata/company.xlsx");
        String p1 = System.getProperty("user.dir")+"/myexcel.xlsx";
		String p2 = System.getProperty("user.dir")+"/final.xlsx";
        
		
		for(int i=2;i<=3;i++) {
		reader= new Xls_Reader(System.getProperty("user.dir")+"/myexcel.xlsx");
		
        String custname1 = reader.getCellData("Sheet1", 0, i);
        //reader.g
         
        String lastname1 = reader.getCellData("Sheet1", 1, i);
        
        String salary1 = reader.getCellData("Sheet1", 2, i);
        
        reader.setCellData("Sheet1", "Status", i, "Passed");
        System.out.println(salary1+lastname1+custname1);
        
        
        for(int j=2;j<=3;j++) {
        	
        	reader = new Xls_Reader(System.getProperty("user.dir")+"/final.xlsx");
        	
        	 String custname2 = reader.getCellData("sheet1", 0, j);
             
             String lastname2 = reader.getCellData("sheet1", 1, j);
             
             String salary2 = reader.getCellData("sheet1", 2, j);
             
             
             System.out.println(salary2+lastname2+custname2);
             
             
             if(custname1.equals(custname2)&&lastname1.equals(lastname2)&&salary1.equals(salary2)) {
             	
             	System.out.println("The Record "+j+" is matching");
             	break;
             }
             
             else {
             	
             	System.out.println("The Record "+j+" is not matching");
             	break;
             }
             
             
             
        	
        }
        
        
		}
        
        
       
//       
//        
//        reader= new Xls_Reader(System.getProperty("user.dir")+"/myexcel.xlsx");
//		
//        String custnameb1 = reader.getCellData("Sheet1", 0, 3);
//        //reader.g
//         
//        String lastnameb1 = reader.getCellData("Sheet1", 1, 3);
//        
//        String salaryb1 = reader.getCellData("Sheet1", 2, 3);
//        
//        
//        reader = new Xls_Reader(System.getProperty("user.dir")+"/final.xlsx");
//        
//        String custnamec1 = reader.getCellData("sheet1", 0, 2);
//        
//        String lastnamec1 = reader.getCellData("sheet1", 1, 2);
//        
//        String salaryc1 = reader.getCellData("sheet1", 2, 2);
//        
//        
//
//        if(custnameb1.equals(custnamec1)&&lastnameb1.equals(lastnamec1)&&salaryb1.equals(salaryc1)) {
//        	
//        	System.out.println("The Second Record is matching");
//        }
//        
//        else {
//        	
//        	System.out.println("Record is not matching");
//        }
        
        
        
        
        
        
	}

}
