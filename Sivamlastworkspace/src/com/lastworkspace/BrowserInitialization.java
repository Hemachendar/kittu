package com.lastworkspace;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInitialization 
{
	
	static WebDriver driver;

	public void initiateBrowser() 
	{
		System. setProperty("webdriver.edge.driver", "D:\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();	
	
	}
	
	

}
