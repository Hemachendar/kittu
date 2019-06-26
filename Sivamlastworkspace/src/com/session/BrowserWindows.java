package com.session;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindows {

public static void main(String[] args) throws InterruptedException {
		
		
//		Initializing Chrome driver
		System. setProperty("webdriver.chrome.driver", "D:\\MicrosoftWebDriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(" http://demo.guru99.com/popup.php");
		
//		maximize the browser window
		driver.manage().window().maximize(); 
		
//		declaring implicit wait
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		
//		below mentioned code will create a webElement
		WebElement clickHereButton =  driver.findElement(By.xpath("//a[text()='Click Here']"));
		
//		perform an action on webElement
		clickHereButton.click();

		
//		belowline isused to perform an action drectly.		
//		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Thread.sleep(4000);
		
//		It will fetch the address of current browser
		String st = driver.getWindowHandle();
		
//		It will fetches address of all open windows/tabs 
		Set<String> allStrings = driver.getWindowHandles(); 
		
//		Switching all open tabs
		for(String s :allStrings) {
			System.out.println(s);
			
//			switch to a window
			driver.switchTo().window(s);
//			print page title of current browser
			System.out.println(driver.getTitle());
			if(!s.equals(st)) {
//				sendkeys is used to enter value into text field box 
				driver.findElement(By.name("emailid")).sendKeys("shivam technologies");
				Thread.sleep(5000);
			}		
			
		}
		
//		Switch to default window
		driver.switchTo().window(st);
		
		Thread.sleep(4000);

		driver.quit();
		
	}
}
