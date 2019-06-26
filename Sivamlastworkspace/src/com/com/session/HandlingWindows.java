package com.com.session;

import org.testng.annotations.Test;

import com.lastworkspace.BrowserInitialization;
import com.lastworkspace.BrowserWindow;
import com.lastworkspace.OpenAnURL;
import com.lastworkspace.QuitBrowser;
import com.lastworkspace.Screenshot;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class HandlingWindows {
  @BeforeMethod
  public void beforeMethod()
  {
	  BrowserInitialization b=new BrowserInitialization();
	  b.initiateBrowser();
	  
	  OpenAnURL url=new OpenAnURL();
	  url.openURL();
	  
  }
  @Test
  public void f() throws Exception 
  {
	  BrowserWindow win=new BrowserWindow();
	      win.handlingWindows();
	   
	  Screenshot screen=new Screenshot();
	  screen.takeScreenShot();
	      
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  QuitBrowser quit=new QuitBrowser();
	  quit.closeBrowser();
	  
  }

}
