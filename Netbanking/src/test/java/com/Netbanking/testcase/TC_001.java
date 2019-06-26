package com.Netbanking.testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.Netbanking.pageobject.LaunchBrowser;

public class TC_001 
{
	public final By uname=By.name("uid");
	public final By pwd =By.name("password");
	public final By login=By.xpath("//input[@name='btnLogin']");
	
	private static final Logger log=Logger.getLogger(TC_001.class.getName());
	
   public void uname() 
   {
	   LaunchBrowser.driver.findElement(uname).sendKeys("mngr197095");
	  log.info("Enter the user name");
   }	
	public void passwed() 
	{
		LaunchBrowser.driver.findElement(pwd).sendKeys("gazyqEv");
		log.info("Enter the password");
	}
	public void login()
	{
		LaunchBrowser.driver.findElement(login).click();
		log.info("click login botton");
	}

}
