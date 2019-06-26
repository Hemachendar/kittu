package com.practice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Firsturl extends Basepagep {

	public static void main(String[] args) throws Exception {
		browser(loaddata("edge"),loaddata("url"));
		List<WebElement> select = driver.findElements(By.tagName("option"));
	     System.out.println(select.size());
	     for (int i = 0; i < select.size(); i++) 
	     {
		    System.out.println(select.get(i).getText());
		  
		}
		Select selct=new Select(driver.findElement(By.id("searchDropdownBox")));
		Thread.sleep(2000);
		selct.selectByIndex(3);
		Thread.sleep(2000);
		selct.selectByVisibleText("Amazon Devices");
		System.out.println(selct);
		
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");

	}

	

}
