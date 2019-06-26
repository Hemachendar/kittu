package com.Netbanking.pageobject;



import com.Netbanking.close.Closebro;
import com.Netbanking.testcase.TC_001;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testng001 
{
	public static Logger logger=LogManager.getLogger(Testng001.class);
   
	public Testng001() {
		LaunchBrowser.driver.manage().timeouts().implicitlyWait(60,TimeUnit.MILLISECONDS);
	}
	
  @Parameters("browser")
  @BeforeMethod
  public void setup(String bro) 
  {
	  
	  LaunchBrowser lch=new LaunchBrowser();
	  lch.launch(bro);
	  
	  OpenUrl open=new OpenUrl();
	  open.url();
  }
  @Test
  public void test() throws Exception 
  {
	  TC_001 tc=new TC_001();
	  tc.uname();
	  tc.passwed();
	  tc.login();
	  File src=((TakesScreenshot)LaunchBrowser.driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//Screenshort//.jpg"));
	  
  }

  @AfterMethod
  public void setdown() 
  {
	  Closebro close=new Closebro();
	  close.quit();
	  
  }
	
}
