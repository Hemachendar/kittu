package com.ATMbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ATMbanking.utility.ReadConfig;

public class BaseClass 
{
	ReadConfig readconfig=new ReadConfig();
	
public static WebDriver driver;
public String baseurl=readconfig.getApplication();
public String uname=readconfig.getUsername();
public String pasword=readconfig.getpassword();
public static Logger logger;

@Parameters("browser")
@BeforeClass
public void setup(String br) 
{
	logger=Logger.getLogger("ATMbanking");
	PropertyConfigurator.configure("log4j.properties");
	//PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.propartice");
	
	if (br.equals("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromebro());
		driver=new ChromeDriver();
	}else if (br.endsWith("edge")) 
	{
		System.setProperty("webdriver.edge.driver",readconfig.getedgebro());
		driver=new EdgeDriver();
	}
	else if (br.equals("ie")) 
	{
		System.setProperty("webdriver.ie.driver",readconfig.getiebro());
		driver=new InternetExplorerDriver();
	}
	else if (br.equals("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxbro());
		driver=new FirefoxDriver();
	}	
	driver.get(baseurl);
}
@AfterClass
public void teardown() 
{
	driver.quit();
}

}
