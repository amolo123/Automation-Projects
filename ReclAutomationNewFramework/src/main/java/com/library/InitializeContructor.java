package com.library;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class InitializeContructor {
	
	WebDriver driver;
	
	public void initializeConstructor(WebDriver driver, String className) throws IOException
	{
		
			this.driver=driver;
		
	}
	

}
