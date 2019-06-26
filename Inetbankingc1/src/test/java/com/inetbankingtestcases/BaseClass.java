package com.inetbankingtestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
  public String Baseurl="http://demo.guru99.com/V4/";
  public String uname ="mngr164225";
  public String paswrd="jahetAp";
  public static WebDriver driver;
  
  @BeforeClass
  public void setup()
  {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
    driver=new ChromeDriver();
  }
  
  @AfterClass
   public void tearDown() 
   {
	driver.close();
}
  
}
