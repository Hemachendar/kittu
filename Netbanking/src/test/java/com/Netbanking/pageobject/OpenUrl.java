package com.Netbanking.pageobject;

import org.openqa.selenium.WebDriver;

public class OpenUrl 
{
	WebDriver driver=LaunchBrowser.driver;
	public void url() 
	{
		LaunchBrowser.driver.navigate().to("http://demo.guru99.com/V4/");
	}

}
