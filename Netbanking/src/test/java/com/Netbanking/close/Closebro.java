package com.Netbanking.close;

import com.Netbanking.pageobject.LaunchBrowser;

public class Closebro extends LaunchBrowser
{
 
	public void quit() 
	{
		LaunchBrowser.driver.quit();
	}
	
	
	
	
}
