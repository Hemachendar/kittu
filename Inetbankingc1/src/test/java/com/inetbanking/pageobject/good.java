package com.inetbanking.pageobject;

import org.openqa.selenium.chrome.ChromeDriver;

public class good {
 
  public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
}
}
