package gropofbrowsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BasePagepath2 
{
  public static WebDriver driver;
  public static Properties p;
  public static Properties or;
  
  public static FileInputStream fs;
  
 
  				
 
 public static  ExtentReports e=Extentmanager.getinstant();
 public static  ExtentTest test;
  
  
  public static void init() throws IOException 
  {
	  p=new Properties();
	  fs=new FileInputStream(System.getProperty("user.dir")+"//data.propartice");
	  p.load(fs);
	  
	  or=new Properties();
	  fs=new FileInputStream(System.getProperty("user.dir")+"//Locaters.OR");
	  or.load(fs);
	  
	  PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.propartice");
	  
	  
	  
  }
	
	public static void browser(String browser) 
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
		 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		 System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");

		 driver=new ChromeDriver();
		}else if (p.getProperty(browser).equals("gecko"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
 
			driver=new FirefoxDriver();
		}else if (p.getProperty(browser).equals("ie"))
		{
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//iedriverserver.exe");

			driver=new InternetExplorerDriver();
		}else if (p.getProperty(browser).equals("edge"))
		{
			//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//edgedriver.exe");
		//System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//edgedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:\\drivers\\MicrosoftWebDriver.exe");
		
		driver=new EdgeDriver();
		}
		
      }
	/*public static void navigate(String urlkey)
	{
		driver.get(p.getProperty(urlkey));
		driver.manage().window().maximize();
	}*/
	
	public static void navigate(String urlkey) {
		 driver.get(p.getProperty(urlkey));
		driver.manage().window().maximize();
	}
	
	public static WebElement getelement(String locaterkey) 
	{
		WebElement element=null;
	
		if (locaterkey.endsWith("_id")) 
		{
			element=driver.findElement(By.id(or.getProperty(locaterkey)));
		}else if (locaterkey.endsWith("_name")) 
		{
			element=driver.findElement(By.name(or.getProperty(locaterkey)));
		}else if (locaterkey.endsWith("_class")) 
		{
			element=driver.findElement(By.className(or.getProperty(locaterkey)));
		}else if (locaterkey.endsWith("_xpath")) 
		{
			element=driver.findElement(By.xpath(or.getProperty(locaterkey)));
		}else if (locaterkey.endsWith("_css")) 
		{
			element=driver.findElement(By.cssSelector(or.getProperty(locaterkey)));
		}
		return element;
		
	}

	public static void selectoption(String locaterkey,String locater)
	{
		//WebElement el = driver.findElement(By.id(or.getProperty(locaterkey)));
		WebElement el = getelement(locaterkey);
	    Select s=new Select(el);
	   //s.selectByIndex(item);
	   
	   
	   //s.selectByIndex(item);
		s.selectByVisibleText(locater);
		
		//s.selectByValue("search-alias=fashion");
	   
	}
	public static void text(String locaterkey,String value) 
	{
		//driver.findElement(By.name(or.getProperty(locaterkey))).sendKeys(value);
		getelement(locaterkey).sendKeys(value);
	}
	public static void submit(String locaterkey) 
	{
		//driver.findElement(By.xpath(or.getProperty(locaterkey))).click();
		getelement(locaterkey).click();
	}
	
}
