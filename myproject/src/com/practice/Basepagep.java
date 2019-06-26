package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepagep {
	
	static WebDriver driver;
	public static Properties p;
	public static FileInputStream fs;
	
	public static String loaddata(String key) throws IOException
	{
		p=new Properties();
		fs=new FileInputStream(System.getProperty("user.dir")+"//data.properties1");
		p.load(fs);
		return p.getProperty(key);
		
	}

	public static WebDriver browser(String browser,String url) {
		if (browser.equalsIgnoreCase("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver= new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver","D:\\MicrosoftWebDriver.exe");
		 driver= new EdgeDriver();
		}else if (browser.equalsIgnoreCase("gecko"))
		{
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("ie"))
		{
		System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//driver.close();
		return driver;
		
	}

}
