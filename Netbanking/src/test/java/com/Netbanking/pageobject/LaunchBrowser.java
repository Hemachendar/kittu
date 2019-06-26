package com.Netbanking.pageobject;



import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser 
{
	public static WebDriver driver;

	public void launch(String browser) 
	{
		  PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.propartice");

		if (browser.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}else if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
		driver=new InternetExplorerDriver();
		}else if (browser.equalsIgnoreCase("gecko")) 
		{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");	
		driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}

}
