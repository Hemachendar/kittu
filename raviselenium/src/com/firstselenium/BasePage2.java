package com.firstselenium;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage2
{
	public static WebDriver dr;
	
	public static final String path = "./data.proparties";
	
	public static String getdeta(String key) throws IOException 
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		
		Properties p=new Properties();
		p.load(fis);
		//p.getProperty(key);
		System.out.println(p.getProperty(key));
	    return p.getProperty(key);
		
	}
		
	public static WebDriver BrowserLaunch(String browsertype,String url) 
	{
		if(browsertype.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			dr= new ChromeDriver();
		}
		else if(browsertype.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
			dr=new InternetExplorerDriver();
		/*	dr.get("http://automationpractice.com/index.php");
			dr.manage().window().maximize();
			//driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			System.out.println("Actions performed on IE");*/
		}
		else if(browsertype.equalsIgnoreCase("gecko")) 
		{
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			dr=new FirefoxDriver();
		}
		else if(browsertype.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//microsoftwebdriver.exe");
			 dr=new EdgeDriver();
		}
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
		/*driver.close();
		driver.quit();*/
		return dr;
		
		
	}

}

