package com.firstselenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitexplicitwait {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		FirefoxDriver d= new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		/*d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(d, 60);*/
		d.get("https://www.hdfcbank.com/");
		d.manage().deleteAllCookies();
		//d.findElement(By.className("popupCloseButton")).click();
		System.out.println(d.getTitle());
		String window = d.getWindowHandle();
		System.out.println("parent window"+window);
		d.findElement(By.id("loginsubmit")).click();
		Set<String> whandles = d.getWindowHandles();
		System.out.println("child window is..."+whandles.size());
		  
		Iterator<String> tir = whandles.iterator();
		while(tir.hasNext())
		{
			String currentwndow = tir.next();
			System.out.println("window are.."+currentwndow);
			if(currentwndow.equals(window)) 
			{
				d.switchTo().window(currentwndow);
				System.out.println(d.getTitle());
			}
		}
		d.manage().window().maximize();
		//wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]")))).click();;
		d.switchTo().window(window);
		System.out.println(d.getTitle());
		d.findElement(By.linkText("Continue to NetBanking")).click();

		
		
				
		
	}

}
