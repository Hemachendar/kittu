package Marvenproject.MFirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasePage 

{
  static WebDriver driver;
  
	
	public static void BrowserLaunch(String browser, String url) 
	
	{
		if(browser.equalsIgnoreCase("CHROME")) 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
			driver=new InternetExplorerDriver();
			
		}
		else if(browser.equalsIgnoreCase("FIREFOX")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			 driver=new FirefoxDriver();
			
		}
		
		driver.get(url);
		driver.close();
	}
	
	

}
