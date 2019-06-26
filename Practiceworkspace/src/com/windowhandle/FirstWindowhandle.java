package com.windowhandle;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstWindowhandle {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      /*System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		/*System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//microsoftwebdriver.exe");
		WebDriver driver=new EdgeDriver();*/
      driver.navigate().to("http://demo.guru99.com/popup.php");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//a[text()='Click Here']")).click();
      
      String st = driver.getWindowHandle();
      
      Set<String> allstrings = driver.getWindowHandles();
      
      for (String s : allstrings) 
      {
		System.out.println(s);
		driver.switchTo().window(s);
		System.out.println(driver.getTitle());
		if (!s.equals(st))
		{
			
			
			//driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sivam");
			driver.findElement(By.name("emailid")).sendKeys("sivam");
			//driver.findElement(By.id("message9")).sendKeys("sivam");
		}
	}
		
		
	}

}
