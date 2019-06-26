package com.firstselenium;

import java.io.IOException;

import org.openqa.selenium.By;

public class Validationclass extends BasePage2 
{

	public static void main(String[] args) throws Exception 
	{
	BrowserLaunch(getdeta("gbrowser"), getdeta("urla"));
	String actul = dr.findElement(By.xpath("//a[text()='Customer Service']")).getText();
    String expctvl = "customer Service";
    System.out.println("actuavl value is"+actul);
    System.out.println("expected value is"+expctvl);
    //if(actul.equals(expctvl)) 
    //if(actul.equalsIgnoreCase(expctvl))
    //if(actul.contentEquals(expctvl))
    if(actul.contains(expctvl))	
    {
    	System.out.println("both are equal....");
    }
    else 
    {
    	System.out.println("both are not equals....");
    }
	}

}
