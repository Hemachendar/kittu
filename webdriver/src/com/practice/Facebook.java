package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "D:\\MicrosoftWebDriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.facebook.com");
		String a = driver.getTitle();
		System.out.println(a);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("8008990184");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("8008990184");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click();
		
	

	}

}
