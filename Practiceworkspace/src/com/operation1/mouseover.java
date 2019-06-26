package com.operation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com");
		driver.manage().window().maximize();
		
		
		//WebElement element = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a/span/span"));
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/a/span/span")));
		action.perform();
		action.click(driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/ul/li[2]")));
		
		/*Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[7]/ul/li[6]")));
		action1.click();*/
		System.out.println("operation action1 is operate");
		
		
		/*Select select=new Select(driver.findElement(By.linkText("DEMO SITES")));
		
		select.selectByVisibleText("IFrame practice page");*/
		

	}

}
