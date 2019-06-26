package com.firstselenium;

import java.io.IOException;

import org.openqa.selenium.By;

public class Assertclass extends BasePage2
{

	

	public static void main(String[] args) throws IOException 
	{
		BrowserLaunch(getdeta("gbrowser"), getdeta("urla"));
		String actul = dr.findElement(By.xpath("//a[text()='Customer Service']")).getText();
	    String expctvl = "customer Service";
	    

	}

}
