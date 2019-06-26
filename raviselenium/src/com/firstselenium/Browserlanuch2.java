package com.firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserlanuch2 {

	public static void main(String[] args) 
	{
		WebDriver d;
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		 d=new ChromeDriver();
		d.navigate().to("https://www.amazon.in");
		String a = d.getTitle();
		System.out.println(a);
		String b = d.getCurrentUrl();
		System.out.println(b);
		d.manage().deleteAllCookies();
		
		d.navigate().forward();
		d.quit();
		
		/*System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//drivers//iedriverserver.exe");
		InternetExplorerDriver d1=new InternetExplorerDriver();
		d1.navigate().to("https://www.facebook.com");
		String a1 = d1.getTitle();
		System.out.println(a1);
		String b1 = d1.getCurrentUrl();
		System.out.println(b1);*/
		
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriverserver.exe");
	 	d=new FirefoxDriver();
		s.navigate().to("https://www.flipkart.com");*/
		
		

	}

}
