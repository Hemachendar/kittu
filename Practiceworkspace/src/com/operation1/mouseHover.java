package com.operation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	
//	https://www.toolsqa.com/
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.navigate().to("https://www.toolsqa.com");
		driver.manage().window().maximize();
		
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='DEMO SITES']"))).build();
		driver.findElement(By.xpath("//span[text()='DEMO SITES']")).click();
		
		Thread.sleep(4000);
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Basic Demo Site']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Basic Demo Site']")).click();
		
		
		
		
	}

}
