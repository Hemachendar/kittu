package gropofbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage {
static WebDriver driver;
	public static void launch(String browser, String url) 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("gecko"))
		{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D\\edgedriver.exe");
			driver=new EdgeDriver();
		}else if (browser.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver", "D\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
			
		}
		 driver.manage().window().maximize();
         driver.navigate().to(url);
         
	}

}
