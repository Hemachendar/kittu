package com.lastworkspace;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserWindow {
	
	private final By clickHere = By.xpath("//a[text()='Click Here']");
	private final By email = By.name("emailid");
	
	WebDriver driver = BrowserInitialization.driver;
	
		public void handlingWindows() throws InterruptedException {
			
		//	maximize the browser window
			driver.manage().window().maximize(); 
			
		//	declaring implicit wait
			BrowserInitialization.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			
		//	below mentioned code will create a webElement
			WebElement clickHereButton =  BrowserInitialization.driver.findElement(clickHere);
			
		//	perform an action on webElement
			clickHereButton.click();
		
			
		//	belowline isused to perform an action drectly.		
		//	BrowserInitialization.driver.findElement(By.xpath("//a[text()='Click Here']")).click();
			Thread.sleep(4000);
			
		//	It will fetch the address of current browser
			String st = BrowserInitialization.driver.getWindowHandle();
			
		//	It will fetches address of all open windows/tabs 
			Set<String> allStrings = BrowserInitialization.driver.getWindowHandles(); 
			
		//	Switching all open tabs
			for(String s :allStrings) {
				System.out.println(s);
				
		//		switch to a window
				BrowserInitialization.driver.switchTo().window(s);
		//		print page title of current browser
				System.out.println(BrowserInitialization.driver.getTitle());
				if(!s.equals(st)) {
		//			sendkeys is used to enter value into text field box 
					BrowserInitialization.driver.findElement(email).sendKeys("shivam technologies");
					Thread.sleep(5000);
				}		
				
			}
			
		//	Switch to default window
			BrowserInitialization.driver.switchTo().window(st);
		
			
		}	

}
