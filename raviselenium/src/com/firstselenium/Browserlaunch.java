package com.firstselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserlaunch {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	 String a = driver.getCurrentUrl();
		System.out.println(a);
		String b = driver.getTitle();
		System.out.println(b);
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Shreyu\\Downloads\\IEDriverServer_x64_3.1.0\\IEDriverServer.exe");
		InternetExplorerDriver d=new InternetExplorerDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		Thread.sleep(2000);
		 String k = d.getCurrentUrl();
			System.out.println(k);
			Thread.sleep(2000);
			String h = d.getTitle();
			System.out.println(h);
		
		
	}

}
