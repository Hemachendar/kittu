package gropofbrowsers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepagepath {
   
     static WebDriver driver;
	public static final String path="./proparticefile";
	
	public static String getdata(String key) throws Exception 
	{
		File f=new File(path);
		FileInputStream fI=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fI);
		return p.getProperty(key);

	}
	
	public static WebDriver launch(String browser,String url) 
	{
		if (browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		 driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}else if (browser.equalsIgnoreCase("gecko"))
		{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
	 driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//microsoftwebdriver.exe");
			 driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	   
		

	}

}
