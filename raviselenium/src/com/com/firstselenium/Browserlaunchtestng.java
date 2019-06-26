package com.com.firstselenium;

import org.testng.annotations.Test;

import com.firstselenium.Basepage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterMethod;

public class Browserlaunchtestng extends Basepage
{
 
  @BeforeMethod
 //@Parameters("browser")
  public void startProcess()
  {
	  BrowserLaunch("gecko", "https://www.amazon.com");
	  driver.manage().window().maximize();
	  
  }
  @Test/*(priority=4,groups= {"regression""smoke"})*/
  public void launch() throws InterruptedException
  {
	 Thread.sleep(1000);
	 WebElement d = driver.findElement(By.id("twotabsearchtextbox"));
	 
	d.sendKeys("sony");
  }

  @AfterMethod
  public void EndProcess() 
  {
	  
  }

}
