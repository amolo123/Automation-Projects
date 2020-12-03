package com.library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Utility {

	
WebDriver driver;
    
	public static String captureScreenshot(WebDriver driver, String screenshotname) throws IOException
	{
		
		org.openqa.selenium.TakesScreenshot ts= (org.openqa.selenium.TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("./Screenshots"+File.separator+screenshotname+".png"));
	    String dest = "/Screenshots"+File.separator+screenshotname+".png";
		System.out.println("screenshot taken");	
		return dest;
		
	}
	
}
