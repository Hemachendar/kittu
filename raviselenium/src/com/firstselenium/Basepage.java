package com.firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage 
{
	public static WebDriver driver;
		
	public static void BrowserLaunch(String browsertype,String url) 
	{
		if(browsertype.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsertype.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browsertype.equalsIgnoreCase("gecko")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsertype.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//microsoftwebdriver.exe");
			 driver=new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		/*driver.close();
		driver.quit();
		*/
	}

}
